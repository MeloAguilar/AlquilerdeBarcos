package Ejercicio1.Clases.Barco;

import Ejercicio1.Clases.Alquiler;

public class BarcoConMotor extends Barco{

    private int potenciaEnCaballos;

    public BarcoConMotor(String matricula, int metrosEslora, int anioProduccion, int potenciaEnCaballos) {
        super (matricula, metrosEslora, anioProduccion);
        this.potenciaEnCaballos = potenciaEnCaballos;
    }

    public int getPotenciaEnCaballos() {
        return potenciaEnCaballos;
    }

    public void setPotenciaEnCaballos(int potenciaEnCaballos) {
        this.potenciaEnCaballos = potenciaEnCaballos;
    }

    @Override
    public double calcularModulo() {
        double alquiler;
        alquiler = getMetrosEslora ()*10* Alquiler.TARIFA_CONSTANTE+potenciaEnCaballos;
        return alquiler;
    }

    @Override
    public String toString() {
        return super.toString () +
                "\nNumero de Velas: " + potenciaEnCaballos + "\n**********************************************************";
    }
}
