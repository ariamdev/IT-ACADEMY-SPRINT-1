package hospital;

import java.util.ArrayList;

public class paciente {
    private int id;
    private String nombre;
    private ArrayList<cita> citas;
    private ArrayList<String> diagnostico;
    final static String hospital = "0098766H";

    public paciente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<cita> citas) {
        this.citas = citas;
    }

    public ArrayList<String> getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(ArrayList<String> diagnostico) {
        this.diagnostico = diagnostico;
    }

    public static String getHospital() {
        return hospital;
    }


    @Override
    public String toString() {
        return "Paciente con ID " + id +
                "\n Nº Hospital: " + hospital +
                "\n Nombre: " + nombre +
                "\n Citas programadas: " + citas +
                "\n Diagnostico:" + diagnostico;
    }
}
