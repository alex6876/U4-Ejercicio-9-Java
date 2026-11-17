public class TransporteMaritimo extends Transportista {

    public TransporteMaritimo(String nombre, double tarifaBase) {
        super(nombre, tarifaBase);
    }

    @Override
    public double calcularCostoEnvio(double pesoKg, double distanciaKm) {

        return tarifaBase + (pesoKg * 80) + (distanciaKm * 1.5);
    }
}