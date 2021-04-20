package Ejercicio1.Clases.Barco;

import Ejercicio1.Clases.Alquiler;

public class Yate extends BarcoConMotor {

    private int numeroCamarotes;

    public Yate(String matricula, int metrosEslora, int anioProduccion, int potenciaEnCaballos, int numeroCamarotes) {
        super (matricula, metrosEslora, anioProduccion, potenciaEnCaballos);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        double alquiler;
        alquiler = getMetrosEslora ( ) * 10 * Alquiler.TARIFA_CONSTANTE + getPotenciaEnCaballos ( ) + numeroCamarotes;
        return alquiler;
    }

    public String toString() {
        return super.toString ( ) +
                "\nNumero de Velas: " + getPotenciaEnCaballos ( ) + "\n" +
                "Número de Camarotes: " + numeroCamarotes +
                "\n**********************************************************";
    }
}
