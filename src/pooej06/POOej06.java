/*
 * @author NeuenMartinez
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual 
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada
 */
package POOej06;

import Entidades06.Cafetera;
import Servicios06.CafeteraService;
import java.util.Scanner;

public class POOej06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean exit = false;
        CafeteraService cs = new CafeteraService();
        Cafetera c1 = cs.crearCafetera();
        do {
            System.out.println("MENU");
            System.out.println("==================");
            System.out.println("1- Llenar cafetera");
            System.out.println("2- Servir taza");
            System.out.println("3- Vaciar cafetera");
            System.out.println("4- Agregar cafe");
            System.out.println("5- Apagar");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Llenando la cafetera...");
                    cs.llenarCafetera(c1);
                    break;
                case 2:
                    System.out.println("Que capacidad tiene la taza? (ml)");
                    int taza = leer.nextInt();
                    cs.servirTaza(taza, c1);
                    break;
                case 3:
                    System.out.println("Vaciando la cafetera...");
                    cs.vaciarCafetera(c1);
                    break;
                case 4:
                    System.out.println("Cuanto cafe desea agregar? (ml):");
                    int agrega = leer.nextInt();
                    cs.agregarCafe(agrega, c1);
                    break;
                case 5:
                    System.out.println("Apagando...");
                    exit = true;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intente de nuevo:");
            }

        } while (exit == false);

    }
}
