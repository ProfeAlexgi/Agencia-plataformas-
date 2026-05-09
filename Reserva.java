```java
public class Reserva {

    int id;
    String usuario;
    String vuelo;
    String hotel;
    int noches;
    double precioVuelo;
    double precioHotel;

    void crear(int id, String usuario, String vuelo, String hotel,
               int noches, double precioVuelo, double precioHotel) {

        this.id = id;
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.noches = noches;
        this.precioVuelo = precioVuelo;
        this.precioHotel = precioHotel;
    }

    public void mostrarReserva() {
        System.out.println("ID: " + id);
        System.out.println("Usuario: " + usuario);
        System.out.println("Vuelo: " + vuelo);
        System.out.println("Hotel: " + hotel);
    }

    public double calcularTotal() {
        return precioVuelo + (precioHotel * noches);
    }

    public void imprimirResumen() {

        System.out.println("\n============================");
        System.out.println("      DETALLE DE RESERVA    ");
        System.out.println("============================");

        System.out.println("ID Reserva: " + id);
        System.out.println("Cliente: " + usuario);
        System.out.println("Vuelo seleccionado: " + vuelo);
        System.out.println("Hotel seleccionado: " + hotel);
        System.out.println("Cantidad de noches: " + noches);

        System.out.println("----------------------------");
        System.out.println("Precio vuelo: $" + precioVuelo);
        System.out.println("Precio hotel por noche: $" + precioHotel);

        System.out.println("----------------------------");
        System.out.println("TOTAL A PAGAR: $" + calcularTotal());

        System.out.println("============================");

        if (calcularTotal() > 2000000) {
            System.out.println("Incluye servicio VIP.");
        } else {
            System.out.println("Reserva estándar.");
        }

        System.out.println("Gracias por reservar con nosotros.");
    }

    public static void main(String[] args) {

        Reserva r1 = new Reserva();

        r1.crear(
            101,
            "David",
            "Bogotá - Medellín",
            "Hotel Paradise",
            3,
            850000,
            250000
        );

        r1.mostrarReserva();
        r1.imprimirResumen();
    }
}
```
