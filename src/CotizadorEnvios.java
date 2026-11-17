public class CotizadorEnvios {

    public void cotizar(Transportista transportista, double pesoKg, double distanciaKm) {

        double costo = transportista.calcularCostoEnvio(pesoKg, distanciaKm);

        System.out.println("Transportista: " + transportista.getNombre());
        System.out.println("Peso del paquete: " + pesoKg + " kg");
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Costo del envio: $" + costo);

        System.out.println("------------------------------");
    }
}