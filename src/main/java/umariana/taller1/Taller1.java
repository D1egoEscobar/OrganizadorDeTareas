package umariana.taller1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import mundo.Tarea;

/**
 *
 * @author Diego Escobar Enriquez
 */
public class Taller1 {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Tarea> misTareas = new ArrayList<>();

        boolean activo = true;
        do{
            
            System.out.println("---Menu de opciones---------");
            System.out.println("---1.Agregar tarea----------");
            System.out.println("---2.Mostrar tarea----------");
            System.out.println("---3.Ordenar tareas---------");
            System.out.println("---4.Terminar programa------");
            System.out.println("---Seleccione una opcion----");
            System.out.println("----------------------------");
            
            int opcion = sc.nextInt();
            switch(opcion){
                
                // Case 1 Agregar las Tareas 
                
                case 1:
                    System.out.println("Ingrese el id de la tarea");
                    int id=sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Ingrese la descripcion de la tarea");
                    String descripcion = sc.nextLine();
                    
                    System.out.println("Ingrese la prioridad del 1-5");
                    int prioridad = sc.nextInt();
                    
                   // Creacion del objeto y llenar la informacion
                    
                   Tarea nuevaTarea = new Tarea(id,descripcion,prioridad); 
                   
                   // Almacenar el objeto en la contenedora
                   
                   misTareas.add(nuevaTarea);
                   System.out.println("Tarea agregada satisfactoriamente ");
                   
                    break;
                    
                    // Case 2 para ver las tareas registradas
                    
                case 2:
                    System.out.println("TAREAS REGISTRADAS");
                    
                    // El for es para recorrer el Array y muestre las tareas 
                    
                    for (Tarea t: misTareas) {
                        System.out.println("id: " + "" + t.getIdTarea() );
                        System.out.println("descripcion: " + "" + t.getDescripcion());
                        System.out.println("prioridad: " + "" + t.getPrioridad());
                    }
                    break;
                    
                    // Case 3 para ordernar de manera descendente 
                    
                case 3:
                    // Ordenar las tareas por prioridad de forma descendente
                    
                      Collections.sort(misTareas, (tarea1, tarea2) -> tarea2.getPrioridad() - tarea1.getPrioridad());
                      
                    // Mostrar las tareas ordenadas por prioridad de forma descendente
                      
                     System.out.println("Tareas ordenadas por prioridad de forma descendente:");
                     for (Tarea tarea : misTareas) {
                      System.out.println("id: " + tarea.getIdTarea());
                      System.out.println("descripcion:" + tarea.getDescripcion());
                      System.out.println("prioridad: " + tarea.getPrioridad());
                     }
             break;

                case 4:
                    
                     // Cerrar programa 
                    
                    activo = false; System.out.println("Programa Terminado");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }
            
        }while(activo);
    }

    
}
