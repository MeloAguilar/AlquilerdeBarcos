package Ejercicio1.MAin;

import Ejercicio1.Clases.Alquiler;
import Ejercicio1.Clases.Barco.Barco;
import Ejercicio1.Clases.Barco.BarcoConMotor;
import Ejercicio1.Clases.Barco.BarcoDeVela;
import Ejercicio1.Clases.Barco.Yate;
import Ejercicio1.Clases.Cliente.Cliente;
import Ejercicio1.Menu.Menu;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<> ( );
        ArrayList<Cliente> clientes = new ArrayList<> ( );
        ArrayList<Alquiler> alquileres = new ArrayList<> ( );
        boolean exit = false;
        do {
            int eleccionInicial = Menu.parseInt (Menu.pedirDato (Menu.MENSAJEINICIO));
            switch (eleccionInicial) {
                case 1 -> {
                    establecerCliente (clientes);
                }
                case 2 -> {
                    establecerBarco (barcos);
                }
                case 3 -> {
                    establecerAlquiler (alquileres, clientes, barcos);
                }
                case 4 -> {
                    Menu.imprimirYRecorrerListaAlquileres (alquileres);
                }
                case 5 -> {
                    System.out.println ("Good Bye!");
                    exit = true;
                }
                default -> {
                    System.out.println ("escribe un dato correcto");
                }
            }
        } while (!exit);


    }

    //Case 1
    private static void establecerCliente(ArrayList<Cliente> clientes) {
        String nombre = Menu.pedirDato ("el nombre del cliente:");
        String apellidos = Menu.pedirDato ("los apellidos del cliente:");
        String dni = Menu.pedirDato ("el Documento Nacional de Identidad del cliente");
        Cliente cliente = new Cliente (nombre, apellidos, dni);
        clientes.add (cliente);
    }

    //Case 2
    private static void establecerBarco(ArrayList<Barco> barcos) {
        String matricula;
        int metrosEslora;
        int anioProduccion;
        int numeroVelas;
        int potenciaEnCV;
        int numeroCamarotes;

        boolean exit = false;
        do {
            matricula = Menu.pedirDato ("La matrícula de la embarcación:");
            metrosEslora = Menu.parseInt (Menu.pedirDato ("Los metros de eslora de la embarcación:"));
            anioProduccion = Menu.parseInt (Menu.pedirDato ("El año de producción de la embarcación:"));
            int eleccion = Menu.parseInt (Menu.pedirDato ("\n1 --> Velero\n2 --> Embarcación a Motor\n3 --> Yate"));
            switch (eleccion) {
                case 1 -> {
                    numeroVelas = Menu.parseInt (Menu.pedirDato ("El número de velas de la embarcación:"));
                    BarcoDeVela barcoDeVela = new BarcoDeVela (matricula, metrosEslora, anioProduccion, numeroVelas);
                    barcos.add (barcoDeVela);
                    exit = true;
                }
                case 2 -> {
                    potenciaEnCV = Menu.parseInt (Menu.pedirDato ("los CV de la embarcación a motor:"));
                    BarcoConMotor barcoConMotor = new BarcoConMotor (matricula, metrosEslora, anioProduccion, potenciaEnCV);
                    barcos.add (barcoConMotor);
                    exit = true;
                }
                case 3 -> {
                    potenciaEnCV = Menu.parseInt (Menu.pedirDato ("los CV del yate:"));
                    numeroCamarotes = Menu.parseInt (Menu.pedirDato ("el número de camarotes del yate:"));
                    Yate yate = new Yate (matricula, metrosEslora, anioProduccion, potenciaEnCV, numeroCamarotes);
                    barcos.add (yate);
                    exit = true;
                }
                default -> {
                    System.out.println ("Escribe un dato correcto");
                }
            }

        } while (!exit);
    }

    //Case 3
    private static void establecerAlquiler(ArrayList<Alquiler> alquileres, ArrayList<Cliente> clientes, ArrayList<Barco> barcos) {
        Cliente cliente = null;
        Barco barco = null;
        LocalDate fechaInicioAlquiler = null;
        LocalDate fechaFinAlquiler = null;
        cliente = clientes.get (Menu.imprimirYRecorrerListaClientes (clientes));
        barco = barcos.get (Menu.imprimirYRecorrerListaBarcos (barcos));
        fechaInicioAlquiler = Menu.introducirYValidarFechas ("de inicio del alquiler:");
        fechaFinAlquiler = Menu.introducirYValidarFechas ("de fin del alquiler:");
        Alquiler alquiler = new Alquiler (barco,cliente,fechaInicioAlquiler, fechaFinAlquiler);
        alquileres.add (alquiler);
    }
}
