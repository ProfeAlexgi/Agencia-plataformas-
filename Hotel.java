public class Hotel {
    private String nombre;
    private String ubicacion;
    private double precioNoche;

    public Hotel(String nombre, String ubicacion, double precioNoche) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precioNoche = precioNoche;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void mostrarInfo() {
        System.out.println("Hotel: " + nombre + " en " + ubicacion);
    }
}