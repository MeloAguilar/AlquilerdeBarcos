package Ejercicio1.Clases.Cliente;

import Ejercicio1.Interfaces.PersonaImp;

public class Cliente implements PersonaImp {

    private String nombre;
    private String apellidos;
    private String dni;

    public Cliente(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente\n**********************************************************" +
                "\nNombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nDNI: " + dni +
                "\n**********************************************************";
    }
}
