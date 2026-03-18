public class Reserva {
    protected Cliente cliente;
    protected Hotel hotel;
    protected Vuelo vuelo;
    protected String fecha;
    protected int numeroPersonas;
    protected double precioTotal;

    public Reserva(Cliente cliente, Hotel hotel, Vuelo vuelo, String fecha, int numeroPersonas, double precioTotal) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.vuelo = vuelo;
        this.fecha = fecha;
        this.numeroPersonas = numeroPersonas;
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void mostrarCliente() {
        System.out.println("--- Cliente ---");
        if (cliente != null) {
            System.out.println("Cliente: " + cliente);
        }
    }

    public void mostrarInfo() {
        System.out.println("--- Reserva ----");
        if (cliente != null) {
            cliente.mostrarInfo();
        }
        if (hotel != null) {
            System.out.println("Hotel: " + hotel);
        }
        if (vuelo != null) {
            System.out.println("Vuelo: " + vuelo);
        }
        System.out.println("Fecha: " + fecha);
        System.out.println("Personas: " + numeroPersonas);
        System.out.println("Precio total: " + precioTotal);
    }
}
