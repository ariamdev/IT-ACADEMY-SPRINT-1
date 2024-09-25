package hospital;

public class medico {
    private String nombre;
    private String consulta;
    private especializacion esp;

    public medico(String nombre, String consulta, especializacion esp) {
        this.nombre = nombre;
        this.consulta = consulta;
        this.esp = esp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public especializacion getEsp() {
        return esp;
    }

    public void setEsp(especializacion esp) {
        this.esp = esp;
    }

    public void RX (){
        if (esp.equals(especializacion.TRAUMATOLOGIA)){
            System.out.println("Se realizará una radiografia.");
        } else {
            System.out.println("Debe ir a traumatología para hacer una radiografía");
        }
    }

    public void tomografia (){
        if(esp.equals(especializacion.NEUROLOGIA)){
            System.out.println("Se realizará una tomografía");
        } else {
            System.out.println("Debe ir a Neurologia para hacer una radiografia");
        }
    }
}

