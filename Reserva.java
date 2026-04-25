public class Reserva {

    private int id;
    private String usuario;
    private String vuelo;
    private String hotel;
    private String estado; 

    public Reserva(int id, String usuario, String vuelo, String hotel) {
        this.id = id;
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.estado = "ACTIVA"; 
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getVuelo() {
        return vuelo;
    }

    public String getHotel() {
        return hotel;
    }

    public String getEstado() {
        return estado;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    // NUEVO: cancelar reserva
    public void cancelarReserva() {
        this.estado = "CANCELADA";
        System.out.println("La reserva ha sido cancelada.");
    }

    // NUEVO: validar datos
    public boolean validarDatos() {
        if (usuario == null || usuario.isEmpty()) {
            System.out.println("Error: el usuario no puede estar vacío");
            return false;
        }
        if (vuelo == null || vuelo.isEmpty()) {
            System.out.println("Error: el vuelo no puede estar vacío");
            return false;
        }
        if (hotel == null || hotel.isEmpty()) {
            System.out.println("Error: el hotel no puede estar vacío");
            return false;
        }
        return true;
    }

    public void mostrarReserva() {
        System.out.println("ID: " + id);
        System.out.println("Usuario: " + usuario);
        System.out.println("Vuelo: " + vuelo);
        System.out.println("Hotel: " + hotel);
        System.out.println("Estado: " + estado);
    }

    public void imprimirResumen() {
        System.out.println("\n============================");
        System.out.println("      DETALLE DE RESERVA     ");
        System.out.println("============================");
        System.out.println("ID: " + id);
        System.out.println("Cliente: " + usuario);
        System.out.println("Vuelo reservado: " + vuelo);
        System.out.println("Hotel reservado: " + hotel);
        System.out.println("Estado: " + estado);
        System.out.println("============================\n");
    }
}