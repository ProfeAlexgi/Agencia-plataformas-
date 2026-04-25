public class Reserva{

    int id 44513047;
    String usuario miguel;
    String vuelo ee.uu;
    String hotel california;

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
        System.out.println("      DETALLE                 ");
         System.out.println("        DE                  ");
          System.out.println("   LA RESERVA  =            ");
        System.out.println("=============================");


    }

}
