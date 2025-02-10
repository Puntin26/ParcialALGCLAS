import java.time.LocalDateTime;
import java.util.Scanner;

// ejecuta el servicio y simular la entrada de trabajos en la consola, corra esto. 

public class PrintManager {
    public static void main(String[] args) {

        PrintService servicio = new PrintService();
        Scanner sc = new Scanner(System.in);
        
        while(true){


            System.out.println("Ingrese nom de usuario o 'procesar', o 'salir' ");
            String entUser = sc.nextLine().trim();

            if (entUser.equalsIgnoreCase("salir")){
                break;
            }
            if (entUser.equalsIgnoreCase("procesar")){
                servicio.procesarTrabajos();
                continue;
            }



            System.out.println(" prioridad (H,M,L)");
            String pri = sc.nextLine().trim();
            
            char prioridad = pri.isEmpty() ? 'M': pri.charAt(0);//cons
            servicio.enviarTrabajo(entUser,prioridad);
        }
        sc.close();
    }
}
