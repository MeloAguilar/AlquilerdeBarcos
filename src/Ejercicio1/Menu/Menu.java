package Ejercicio1.Menu;

import Ejercicio1.Clases.Alquiler;
import Ejercicio1.Clases.Barco.Barco;
import Ejercicio1.Clases.Cliente.Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static final Scanner sc = new Scanner (System.in);
    public static final String MENSAJEPEDIRDATO = "Introduce aquí ";
    public static final String MENSAJEINICIO = "\n1 --> Establecer Cliente\n2 --> Establecer Barco\n3 --> Establecer Alquiler de un Barco por un cliente\n4 --> Mostrar lista de alquileres\n5 --> Salir";

    /**
     * Método que pide un String al usuario por escaner y lo devuelve
     * Precondiciones: ninguna.
     * Postcondiciones: devolverá lo que el usuario escriba por teclado.
     *
     * @param quePedir: String que muestra al usuario el dato que se requiere que introduzca.
     * @return El String que introduzca el usuario.
     */
    public static String pedirDato(String quePedir) {
        System.out.println (MENSAJEPEDIRDATO + quePedir);
        return sc.nextLine ( );
    }

    /**
     * Método que valida que un String se puede convertir en un entero y lo devuelve
     * Precondiciones: ninguna
     * Postcondiciones: devuelve el valor númerico de el parámetro cadena
     *
     * @param cadena
     * @return: entero valor
     */
    public static int parseInt(String cadena) {
        int valor;
        try {
            valor = Integer.parseInt (cadena);
        } catch (IllegalArgumentException e) {
            valor = 0;
        }
        return valor;
    }

    /**
     * Método que traduce 3 Strings introducidos por teclado a enteros y después devuelve una fecha a partir de estos.
     * Precondiciones: diaCadena, mesCadena y anioCadena deben ser números enteros. Esto se hace para evitar los problemas
     * de volcado de variables cuando se utiliza un escaner para pedir al usuario un entero
     *
     * @param descripcionFechaAPedir: String que muestra para que servirá la fecha.
     * @return Una fecha compuesta a partir de 3 Strings pedidos por teclado.
     */
    public static LocalDate introducirYValidarFechas(String descripcionFechaAPedir) {
        int dia = 0, mes = 0, anhio = 0;
        String diaCadena = "", mesCadena = "", anioCadena = "";
        LocalDate fechaAux = null;
        while (dia < 1 || mes < 1 || anhio < 1) {
            try {
                System.out.println ("Introduce el día " + descripcionFechaAPedir);
                diaCadena = sc.nextLine ( );
                dia = parseInt (diaCadena);
                System.out.println ("Introduce el mes " + descripcionFechaAPedir);
                mesCadena = sc.nextLine ( );
                mes = parseInt (mesCadena);
                System.out.println ("Introduce el año " + descripcionFechaAPedir);
                anioCadena = sc.nextLine ( );
                anhio = parseInt (anioCadena);
            } catch (IllegalArgumentException e) {
                System.out.println ("Introduce una fecha correcta");
            }
        }
        fechaAux = LocalDate.parse (diaCadena + "-" + mesCadena + "-" + anioCadena, DateTimeFormatter.ofPattern ("dd-MM-yyyy"));
        return fechaAux;
    }


    public static int imprimirYRecorrerListaClientes(ArrayList<Cliente> lista) {
        System.out.println ("Lista de clientes registrados: ");
        int index = 1;
        for (Cliente cliente : lista) {
            System.out.println ((index++) + " --> " + cliente);
        }
        index = 0;
        while ((index - 1) < 0 || lista.size ( ) < index) {
            System.out.println ("introduzca la posicion del cliente al que desea alquilar la embarcación");
            String indiceCadena = sc.nextLine ( );
            index = parseInt (indiceCadena);
        }
        return index - 1;
    }

    public static int imprimirYRecorrerListaBarcos(ArrayList<Barco> lista) {
        System.out.println ("Lista de embarcaciones registradas: ");
        int index = 1;
        for (Barco barco : lista) {
            System.out.println ((index++) + " --> " + barco);
        }
        index = 0;
        while ((index - 1) < 0 || lista.size ( ) < index) {
            System.out.println ("introduzca la posicion de la embarcación que desea alquilar:");
            String indiceCadena = sc.nextLine ( );
            index = parseInt (indiceCadena);
        }
        return index - 1;
    }

    public static void imprimirYRecorrerListaAlquileres(ArrayList<Alquiler> lista) {
        System.out.println ("Lista de alquileres registrados: ");
        int index = 1;
        for (Alquiler alquiler : lista) {
            System.out.println ((index++) + " --> " + alquiler);
        }
    }
}
