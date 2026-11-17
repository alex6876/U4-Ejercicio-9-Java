public class Main {

    public static void main(String[] args) {

        CotizadorEnvios cotizador = new CotizadorEnvios();

        Transportista correo = new CorreoTradicional("Correo Argentino", 500);

        Transportista aereo = new EnvioExpressAereo("DHL Express", 1500);

        Transportista maritimo = new TransporteMaritimo("Maersk", 2000);


        double peso = 10;
        double distancia = 1000;


        System.out.println("===== COTIZACION DE ENVIOS =====");

        cotizador.cotizar(correo, peso, distancia);

        cotizador.cotizar(aereo, peso, distancia);

        cotizador.cotizar(maritimo, peso, distancia);
    }
}