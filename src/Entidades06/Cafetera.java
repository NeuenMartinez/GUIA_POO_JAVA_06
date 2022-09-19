package Entidades06;

/**
 *
 * @author NeuenMartinez
 */
public class Cafetera {

    private double capacidadMax;
    private double capacidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMax, double capacidadActual) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
}
