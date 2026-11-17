public class EnvioExpressAereo extends Transportista {

    public EnvioExpressAereo(String nombre, double tarifaBase) {
        super(nombre, tarifaBase);
    }

    @Override
    public double calcularCostoEnvio(double pesoKg, double distanciaKm) {

        return tarifaBase + (pesoKg * 250) + (distanciaKm * 8);
    }
}