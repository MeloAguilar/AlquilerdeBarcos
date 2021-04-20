package Ejercicio1.Clases;

import Ejercicio1.Clases.Barco.Barco;
import Ejercicio1.Clases.Barco.BarcoDeVela;
import Ejercicio1.Clases.Cliente.Cliente;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Alquiler {

    private Barco barco;
    private Cliente cliente;
    private LocalDate fechaInicioAlquiler;
    private LocalDate fechaFinAlquiler;
    public static final int TARIFA_CONSTANTE = 800;

    public Alquiler(Barco barco, Cliente cliente, LocalDate fechaInicioAlquiler, LocalDate fechaFinAlquiler) {
        this.barco = barco;
        this.cliente = cliente;
        this.fechaInicioAlquiler = fechaInicioAlquiler;
        this.fechaFinAlquiler = fechaFinAlquiler;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaInicioAlquiler() {
        return fechaInicioAlquiler;
    }

    public void setFechaInicioAlquiler(LocalDate fechaInicioAlquiler) {
        this.fechaInicioAlquiler = fechaInicioAlquiler;
    }

    public LocalDate getFechaFinAlquiler() {
        return fechaFinAlquiler;
    }

    public void setFechaFinAlquiler(LocalDate fechaFinAlquiler) {
        this.fechaFinAlquiler = fechaFinAlquiler;
    }

    /**
     * Método que devuelve los días entre la fecha de inicio del alquiler y la fecha de fin
     * @return días entre fechaInicioAlquiler y fechaFinAlquiler.
     */
    public int getTiempoDeAlquiler(){
        return (int)ChronoUnit.DAYS.between (fechaInicioAlquiler,fechaFinAlquiler);
    }

    public double getCalculoAlquiler(){
        double alquiler = 0;
        alquiler = this.barco.calcularModulo ();
        return alquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{\n**********************************************************" +
                "\nBarco: " + barco.getMatricula () +
                "\nCliente: " + cliente.getDni () +
                "\nFecha de Inicio del Alquiler: " + fechaInicioAlquiler +
                "\nFecha de Fin del Alquiler: " + fechaFinAlquiler +
                "\nPrecio total del Alquiler: " + this.getCalculoAlquiler ()+ "€"+
                "\n**********************************************************";
    }
}
