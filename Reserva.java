public class Reserva {

    int id;
    String usuario;
    String vuelo;
    String hotel;
    String destino;
    String rutaEcologica;
    String transporteSostenible;
    double huellaCarbono;
    boolean incluyeGuiaLocal;

    void crear(
            int id,
            String usuario,
            String vuelo,
            String hotel,
            String destino,
            String rutaEcologica,
            String transporteSostenible,
            double huellaCarbono,
            boolean incluyeGuiaLocal
    ) {
        this.id = id;
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.destino = destino;
        this.rutaEcologica = rutaEcologica;
        this.transporteSostenible = transporteSostenible;
        this.huellaCarbono = huellaCarbono;
        this.incluyeGuiaLocal = incluyeGuiaLocal;
    }

    public void mostrarReserva() {
        System.out.println("ID: " + id);
        System.out.println("Usuario: " + usuario);
        System.out.println("Vuelo: " + vuelo);
        System.out.println("Hotel: " + hotel);
        System.out.println("Destino: " + destino);
        System.out.println("Ruta ecológica: " + rutaEcologica);
        System.out.println("Transporte sostenible: " + transporteSostenible);
        System.out.println("Huella de carbono: " + huellaCarbono + " kg CO2");
        System.out.println("Incluye guía local: " + incluyeGuiaLocal);
    }

    public void imprimirResumen() {
        System.out.println("\n============================");
        System.out.println("      DETALLE DE RESERVA     ");
        System.out.println("============================");
        mostrarReserva();
        System.out.println("============================");
    }

    public void recomendarAccionEcologica() {
        if (huellaCarbono <= 50) {
            System.out.println("Recomendacion: Bajo impacto ambiental.");
        } else if (huellaCarbono <= 100) {
            System.out.println("Recomendacion: Usa transporte compartido para reducir impacto.");
        } else {
            System.out.println("Recomendacion: Considera compensar tu huella de carbono.");
        }
    }
}