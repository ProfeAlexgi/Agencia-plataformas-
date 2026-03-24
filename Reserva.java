public class Reserva{

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

}
