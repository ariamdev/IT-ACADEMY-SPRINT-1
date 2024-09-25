package hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class hospitalManager {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<paciente> pacientes = new ArrayList<>();
    static ArrayList <medico> doctor = new ArrayList<>();
    static ArrayList<cita> citas = new ArrayList<>();


    public static void startProgram(){

        int opt;

        pacientes.add(new paciente(123,"paco"));

        do{
            System.out.println("MENÚ: \n" +
                    "1. Dar de alta un paciente \n" +
                    "2. Asignarle una cita \n" +
                    "3. Anular una cita \n" +
                    "4. Consultar las citas de un paciente. \n" +
                    "5. Consultar las citas de un médico. \n" +
                    "0. Salir.");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    crearPaciente();
                    break;
                case 2:
                    crearCita();
                    break;
                case 3:
                    eliminarCita();
                    break;
                case 4:
                    citasPaciente();
                    break;
                case 5:
                    citasDoctor();
                    break;
            }


        }while (opt != 0); {
            System.out.println("Hasta pronto.");
        }

        sc.close();

    }
    public static medico medGeneral(){
        medico m1 = new medico("Ana","A-1",especializacion.GENERAL);
        doctor.add(m1);
        return m1;
    }

    public static medico trauma(){
        medico m2 = new medico("Eric", "E-6", especializacion.TRAUMATOLOGIA);
        doctor.add(m2);
        return m2;
    }

    public static medico neuro(){
        medico m3 = new medico("Marta", "M-8", especializacion.NEUROLOGIA);
        doctor.add(m3);
        return m3;
    }

    public static void crearPaciente (){
        System.out.println("Introduzca el id del paciente: ");
        int id = sc.nextInt();
        System.out.println("Introduzca el nombre del paciente: ");
        String nombre = sc.next();
        paciente pa1 = new paciente(id,nombre);
        System.out.println("El paciente " + nombre + " ha sido creado correctamente.");
        pacientes.add(pa1);
    }

    public static paciente buscarPaciente() {
        System.out.println("Indique el nombre del paciente: ");
        String nombre = sc.next();

        paciente pacienteEncontrado = pacientes.stream()
                .filter(pat -> pat.getNombre().equalsIgnoreCase(nombre))
                .findFirst().orElse(null);

        if (pacienteEncontrado != null) {
            System.out.println("Paciente " + nombre);
        } else {
            System.out.println("No tenemos un paciente con este nombre en el sistema.");
        }

        return pacienteEncontrado;
    }

    public static void crearCita(){
        paciente pacienteEncontrado = buscarPaciente();

        System.out.println("Indique la especialidad: \n" +
                "1. General \n" +
                "2. Traumatologia \n" +
                "3. Neurologia");
        int especialidad = sc.nextInt();

        System.out.println("Indique la fecha: ");
        String fecha = sc.next();
        System.out.println("Indique la hora: ");
        String hora = sc.next();

        switch (especialidad){
            case 1:
                medico general = medGeneral();
                citas.add(new cita(fecha,hora,general));
                pacienteEncontrado.setCitas(citas);
                System.out.println("Se ha creado la cita correctamente. Datos visita: \n" +
                        "Le visitará la doctora " + general.getNombre() + " en la consulta " + general.getConsulta()+
                        "\nFecha " + fecha + "Hora: " + hora);
                break;
            case 2:
                medico trauma = trauma();
                citas.add(new cita(fecha,hora,trauma));
                pacienteEncontrado.setCitas(citas);
                System.out.println("Se ha creado la cita correctamente. Datos visita: \n" +
                                "Le visitará el doctor " + trauma.getNombre() + " en la consulta " + trauma.getConsulta()+
                        "\nFecha " + fecha + "Hora: " + hora);
                break;
            case 3:
                medico neurolog = neuro();
                citas.add(new cita(fecha,hora,neurolog));
                pacienteEncontrado.setCitas(citas);
                System.out.println("Se ha creado la cita correctamente. Datos visita: \n" +
                                "Le visitará la doctora " + neurolog.getNombre() + " en la consulta " + neurolog.getConsulta()+
                        "\nFecha " + fecha + "Hora: " + hora);
                break;
        }

        System.out.println();


    }

    public static void eliminarCita(){
        buscarPaciente();
        paciente pacienteEncontrado = buscarPaciente();
        System.out.println("Qué cita quiere eliminar? Indique el número de cita: ");
        pacienteEncontrado.getCitas().forEach(System.out::println);
        int contador = sc.nextInt();

        cita citaAEliminar = pacienteEncontrado.getCitas().stream()
                .filter(cita -> cita.getContador() == contador)
                .findFirst()
                .orElse(null);

        if (citaAEliminar != null) {
            pacienteEncontrado.getCitas().remove(citaAEliminar);
            System.out.println("Cita anulada correctamente.");
        } else {
            System.out.println("Cita no encontrada.");
        }
    }

    public static void citasPaciente(){
        buscarPaciente();
        paciente pacienteEncontrado = buscarPaciente();
        System.out.println("Estas son las citas asignadas al paciente: ");
        pacienteEncontrado.getCitas().forEach(System.out::println);
    }


    public static medico buscarDoctor(){
        System.out.println("Indique el nombre del/a doctor/a: ");
        String nombre = sc.next();

        medico medicoEncontrado = doctor.stream()
                .filter(pat -> pat.getNombre().equalsIgnoreCase(nombre))
                .findFirst().orElse(null);

        if (medicoEncontrado != null) {
            System.out.println("Doctor/a " + nombre);
        } else {
            System.out.println("No hemos encontrado el/la doctor/a en el sistema.");
        }

        return medicoEncontrado;

    }

    public static void citasDoctor(){
        buscarDoctor();
     medico medicoEncontrado = buscarDoctor();
     System.out.println("Estas son las citas asignadas al doctor/a: ");
     citas.stream().filter(citax -> citax.getDoctor().equals(medicoEncontrado)).forEach(System.out::println);
    }

}
