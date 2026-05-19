import java.util.ArrayList;

public class Hotel {

    protected String nombre_hotel;
    protected String direccion_hotel;
    protected String telefono_hotel;
    protected String correo_hotel;
    String numero_habitaciones;

    private ArrayList<Habitacion> habitaciones;

    public Hotel(String hotelNombre, String hotelDireccion, String hotelTelefono, String hotelCorreo, String habitacionesnum ) {
        this.nombre_hotel = hotelNombre;
        this.direccion_hotel = hotelDireccion;
        this.telefono_hotel = hotelTelefono;
        this.correo_hotel = hotelCorreo;
        this.numero_habitaciones = habitacionesnum;
        this.habitaciones = new ArrayList<>();
    }

    public String getNombreHotel(){return nombre_hotel;}
    public String getDireccionHotel(){return direccion_hotel;}
    public String getTelefonoHotel(){return telefono_hotel;}
    public String getCorreoHotel(){return correo_hotel;}
    public String getNumeroHabitaciones(){return numero_habitaciones;}

    public String getNombreCompleto() {
        return nombre_hotel;
    }

    public String getInfo(){
        return direccion_hotel + " " + telefono_hotel + " " + correo_hotel + " " + numero_habitaciones;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Informacion hotel: " + getInfo());
    }


    public void agregarHabitacion(int numero, String tipo, double precio, boolean disponible) {
        Habitacion h = new Habitacion(numero, tipo, precio, disponible);
        habitaciones.add(h);
    }

    public void mostrarHabitaciones() {
        for (Habitacion h : habitaciones) {
            System.out.println(h.getInfo());
        }
    }

    class Habitacion {

        private int numero;
        private String tipo;
        private double precio;
        private boolean disponible;

        public Habitacion(int numero, String tipo, double precio, boolean disponible) {
            this.numero = numero;
            this.tipo = tipo;
            this.precio = precio;
            this.disponible = disponible;
        }

        public String getInfo() {
            return "Habitacion " + numero +
                   " | Tipo: " + tipo +
                   " | Precio: $" + precio +
                   " | Disponible: " + disponible;
        }
    }
}