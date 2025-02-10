// PrintQueue.java
import java.time.LocalDateTime;
import java.util.LinkedList;

public class PrintQueue {
    private LinkedList<PrintJob> cola;

    public PrintQueue(){
        cola = new LinkedList<>();
    }

    private int prioridadNum(char p){
        if (p =='H') 
            return 1;

        if (p =='M')
            return 2;
            
        else
            return 3;
    }

    public void setTrabajo(PrintJob trabajo){

        if (cola.isEmpty()) {
            cola.add(trabajo);

        } 
        
        else{
            int i = 0;

            for (; i < cola.size(); i++){
                PrintJob actual = cola.get(i);
                int pNuevo =prioridadNum(trabajo.getPrioridad());
                int pActual =prioridadNum(actual.getPrioridad());

                if(pNuevo<pActual){
                    break;

                } 
                else if(pNuevo == pActual && trabajo.getHoraEnvio().compareTo(actual.getHoraEnvio())<0){
                    break;
                }
            }
            cola.add(i,trabajo);
        }
    }

    public PrintJob getSiguienteTrabajo(){
        if (cola.isEmpty()) return null;
        return cola.removeFirst();
    }

    public boolean isTrabajos() {
        return !cola.isEmpty();
    }
}
