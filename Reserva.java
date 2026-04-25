public class Reserva {

    int id;
    String usuario;
    String vuelo;
    String hotel;

    void crear(int id, String usuario, String vuelo, String hotel) {
        this.id = id;
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.hotel = hotel;
    }

    public void mostrarReserva() {
        System.out.println("ID: " + id);
        System.out.println("Usuario: " + usuario);
        System.out.println("Vuelo: " + vuelo);
        System.out.println("Hotel: " + hotel);
    }

    public void imprimirResumen() {
        System.out.println("\n============================");
        System.out.println("      DETALLE DE RESERVA     ");
        System.out.println("============================");
        System.out.println("ID de Reserva : " + id);
        System.out.println("Usuario       : " + usuario);
        System.out.println("Vuelo         : " + vuelo);
        System.out.println("Hotel         : " + hotel);
        System.out.println("============================\n");
    }

    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        reserva.crear(1, "Carlos", "AV123", "Hotel Danniels");
        reserva.imprimirResumen();
    }
}
