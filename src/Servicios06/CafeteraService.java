package Servicios06;

import Entidades06.Cafetera;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class CafeteraService {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {
        System.out.println("Ingresar la capacidad maxima de su cafetera (ml):");
        double capacidadMax = leer.nextDouble();
        System.out.println("Ingresar la cantidad actual de cafe en la cafetera (ml):");
        double capacidadActual = leer.nextDouble();
        return new Cafetera(capacidadMax, capacidadActual);
    }

    public Cafetera llenarCafetera(Cafetera c1) {
        c1.setCapacidadActual(c1.getCapacidadMax());
        return c1;
    }

    public Cafetera servirTaza(int taza, Cafetera c1) {
        if (taza > c1.getCapacidadActual()) {
            double aux = taza - c1.getCapacidadActual();
            System.out.println("Falta de cafe, la taza solo se lleno " + (c1.getCapacidadActual()) + "ml");
            c1.setCapacidadActual(0);
            return c1;
        } else {
            c1.setCapacidadActual(c1.getCapacidadActual() - taza);
            System.out.println("La taza se ha llenado");
            return c1;
        }
    }

    public Cafetera vaciarCafetera(Cafetera c1) {
        c1.setCapacidadActual(0);
        return c1;
    }

    public Cafetera agregarCafe(int agrega, Cafetera c1) {
        c1.setCapacidadActual(c1.getCapacidadActual() + agrega);
        return c1;
    }
}
