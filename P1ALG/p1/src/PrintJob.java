import java.time.LocalDateTime;

//inicializacion de variables(atriburos) e formato de impresion
public class PrintJob {

    private String usuario;
    private LocalDateTime horaEnvio;
    private char prioridad;

    public PrintJob(String usuario, LocalDateTime horaEnvio, char prioridad) {
        this.usuario = usuario;
        this.horaEnvio = horaEnvio;
        this.prioridad = prioridad;


    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDateTime getHoraEnvio() {
        return horaEnvio;
    }

    public char getPrioridad() {
        return prioridad;
    }

    //formato de impresion
    public String toString(){
        return usuario+" ("+prioridad+") "+horaEnvio;
    }
}
