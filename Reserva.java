public class Reserva {

    private int id;
    private Cliente cliente;
    private Vuelo vuelo;
    private Hotel hotel;

    public Reserva(int id, Cliente cliente, Vuelo vuelo, Hotel hotel) {
        this.id = id;
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.hotel = hotel;
    }

    public int getId() { return id; }

    public void mostrarReserva() {
        System.out.println("ID: " + id);
        cliente.mostrarInfo();
        vuelo.mostrarInfo();
        hotel.mostrarInfo();
    }

    public void imprimirResumen() {
        System.out.println("\n============================");
        System.out.println("      DETALLE DE RESERVA     ");
        System.out.println("============================");
        mostrarReserva();
    }
}