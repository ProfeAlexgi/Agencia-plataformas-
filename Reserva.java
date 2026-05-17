public class Reserva {

    private int id;
    private String usuario;
    private String vuelo;
    private String hotel;

   
    public Reserva(int id, String usuario, String vuelo, String hotel) {
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
        System.out.println("ID: " + id);
        System.out.println("Cliente: " + usuario);
        System.out.println("Vuelo reservado: " + vuelo);
        System.out.println("Hotel reservado: " + hotel);
        System.out.println("============================\n");
    }

    
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

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}