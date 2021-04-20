package Ejercicio1.Clases.Barco;

import Ejercicio1.Clases.Alquiler;

public class BarcoDeVela extends Barco{

    private int numeroVelas;

    public BarcoDeVela(String matricula, int metrosEslora, int anioProduccion, int numeroVelas) {
        super (matricula, metrosEslora, anioProduccion);
        this.numeroVelas = numeroVelas;
    }

    public int getNumeroVelas() {
        return numeroVelas;
    }

    public void setNumeroVelas(int numeroVelas) {
        this.numeroVelas = numeroVelas;
    }


    @Override
    public double calcularModulo() {
        double alquiler;
        alquiler = getMetrosEslora ()*10* Alquiler.TARIFA_CONSTANTE+numeroVelas;
        return alquiler;
    }

    @Override
    public String toString() {
        return super.toString () +
                "\nNumero de Velas: " + numeroVelas + "\n**********************************************************";
    }
}
