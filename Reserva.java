

public class Reserva {
    private Cliente cliente;
    private Vuelo vuelo;
    private Hotel hotel;
    private String fechaReserva;

    public Reserva(Cliente cliente, Vuelo vuelo, Hotel hotel, String fechaReserva) {
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.fechaReserva = fechaReserva;
    }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Vuelo getVuelo() { return vuelo; }
    public void setVuelo(Vuelo vuelo) { this.vuelo = vuelo; }

    public Hotel getHotel() { return hotel; }
    public void setHotel(Hotel hotel) { this.hotel = hotel; }

    public String getFechaReserva() { return fechaReserva; }
    public void setFechaReserva(String fechaReserva) { this.fechaReserva = fechaReserva; }

    public void mostrarResumen() {
        System.out.println(cliente.getNombreCompleto());
        System.out.println(vuelo.getAerolinea() + " " + vuelo.getClaseReserva());
        System.out.println(hotel.getNombre() + " " + hotel.getRegimen());
        System.out.println(fechaReserva);
    }
}
  
