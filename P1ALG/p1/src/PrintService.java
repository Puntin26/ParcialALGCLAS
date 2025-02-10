import java.time.LocalDateTime;

//hace el servicio de impresion gestionando la adicion y el procesamiento de trabajos. 
public class PrintService {

    private PrintQueue cola;

    public PrintService(){
        cola = new PrintQueue();
    }

    public void enviarTrabajo(String usuario, char prioridad){

        if (prioridad!='H'&&prioridad!='M'&&prioridad!='L'&&prioridad!='h'&&prioridad !='m'&&prioridad!='l') {
            prioridad = 'M';

        }

        PrintJob trabajo = new PrintJob(usuario,LocalDateTime.now(), prioridad);

        cola.setTrabajo(trabajo);
    }

    public void procesarTrabajos(){
        
        while(cola.isTrabajos()) {
            PrintJob siguiente = cola.getSiguienteTrabajo();
            System.out.println("->"+siguiente);
        }
    }
}
