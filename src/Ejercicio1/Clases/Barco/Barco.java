package Ejercicio1.Clases.Barco;

public abstract class Barco {

    private String matricula;
    private int metrosEslora;
    private int anioProduccion;

    public Barco(String matricula, int metrosEslora, int anioProduccion) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.anioProduccion = anioProduccion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public int getAnioProduccion() {
        return anioProduccion;
    }

    public void setAnioProduccion(int anioProduccion) {
        this.anioProduccion = anioProduccion;
    }

    /**
     * TODO IMPLEMENTAR EN TODOS LOS TIPOS DE BARCO
     */
    public abstract double calcularModulo();

    @Override
    public String toString() {
        return "Barco\n**********************************************************" +
                "\nMatrícula: " + matricula + '\'' +
                "\nMetros de Eslora: " + metrosEslora +
                "\nAño de Produccion: " + anioProduccion;
    }
}
