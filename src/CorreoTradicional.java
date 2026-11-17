public class CorreoTradicional extends Transportista {

    public CorreoTradicional(String nombre, double tarifaBase) {
        super(nombre, tarifaBase);
    }

    @Override
    public double calcularCostoEnvio(double pesoKg, double distanciaKm) {

        return tarifaBase + (pesoKg * 100) + (distanciaKm * 2);
    }
}