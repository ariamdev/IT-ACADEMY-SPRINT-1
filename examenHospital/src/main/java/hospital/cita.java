package hospital;

public class cita {

    private String fecha;
    private String hora;
    private medico doctor;
    private int contador = 0;

    public cita(String fecha, String hora, medico doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.doctor = doctor;
        this.contador = ++contador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public medico getDoctor() {
        return doctor;
    }

    public void setDoctor(medico doctor) {
        this.doctor = doctor;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "CITA número " + contador +
                "\n Fecha: " + fecha +
                "\n Hora=" + hora +
                "\n Doctor=" + doctor;
    }
}
