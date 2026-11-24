public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria", "Escobar", "3001234567", "1053000000");
        Vuelo vuelo = new Vuelo("Vuelo Bogota-Medellin", "3202003420", 10, "Medellin", "Bufet incluido");
        Hotel hotel = new Hotel("Hotel Central", "Calle 10 # 5-20", "6041234567", "info@hotelcentral.com", 120);

        cliente.registrar();
        vuelo.cambiarHora(14);
        vuelo.agregarServicio("Asiento exclusivo para clientes frecuentes");

        Reserva reserva = new Reserva(1, cliente, vuelo, hotel);
        reserva.imprimirResumen();
    }
}