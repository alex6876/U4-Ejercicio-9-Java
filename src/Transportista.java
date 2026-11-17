public abstract class Transportista {

    protected String nombre;
    protected double tarifaBase;

    public Transportista(String nombre, double tarifaBase) {
        this.nombre = nombre;
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularCostoEnvio(double pesoKg, double distanciaKm);

    public String getNombre() {
        return nombre;
    }
}