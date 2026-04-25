public class Hotel {

    protected String nombre_hotel;
    protected String direccion_hotel;
    protected String telefono_hotel;
    protected String correo_hotel;
    protected String numero_habitaciones;

    protected String ciudad;
    protected String pais;
    protected int estrellas;
    protected double precioNoche;
    protected boolean disponible;
    protected String categoria;

    public Hotel(String hotelNombre, String hotelDireccion, String hotelTelefono,
                 String hotelCorreo, String habitacionesnum, String ciudad,
                 String pais, int estrellas, double precioNoche, String categoria) {
        this.nombre_hotel   = hotelNombre;
        this.direccion_hotel = hotelDireccion;
        this.telefono_hotel  = hotelTelefono;
        this.correo_hotel    = hotelCorreo;
        this.numero_habitaciones = habitacionesnum;
        this.ciudad      = ciudad;
        this.pais        = pais;
        this.estrellas   = estrellas;
        this.precioNoche = precioNoche;
        this.disponible  = true;
        this.categoria   = categoria;
    }

    public String getNombreHotel()       { return nombre_hotel; }
    public String getDireccionHotel()    { return direccion_hotel; }
    public String getTelefonoHotel()     { return telefono_hotel; }
    public String getCorreoHotel()       { return correo_hotel; }
    public String getNumeroHabitaciones(){ return numero_habitaciones; }

    public String getCiudad()    { return ciudad; }
    public void   setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getPais()      { return pais; }
    public void   setPais(String pais)     { this.pais = pais; }

    public int  getEstrellas()             { return estrellas; }
    public void setEstrellas(int estrellas){ this.estrellas = estrellas; }

    public double getPrecioNoche()                 { return precioNoche; }
    public void   setPrecioNoche(double precioNoche){ this.precioNoche = precioNoche; }

    public boolean isDisponible()                  { return disponible; }
    public void    setDisponible(boolean disponible){ this.disponible = disponible; }

    public String getCategoria()           { return categoria; }
    public void   setCategoria(String cat) { this.categoria = cat; }

    public boolean reservarHabitacion() {
        if (disponible) {
            disponible = false;
            System.out.println("Habitacion reservada en " + nombre_hotel);
            return true;
        }
        System.out.println("No hay habitaciones disponibles.");
        return false;
    }

    public void liberarHabitacion() {
        disponible = true;
        System.out.println("Habitacion liberada en " + nombre_hotel);
    }

    public double calcularPrecioTotal(int noches) {
        return precioNoche * noches;
    }

    public boolean verificarDisponibilidad() {
        return disponible;
    }

    public String getNombreCompleto() {
        return nombre_hotel;
    }

    public String getInfo() {
        return direccion_hotel + " | " + telefono_hotel + " | " +
               correo_hotel + " | Habitaciones: " + numero_habitaciones;
    }

    public void mostrarInfo() {
        System.out.println("=== Informacion del Hotel ===");
        System.out.println("Nombre:       " + getNombreCompleto());
        System.out.println("Ciudad:       " + ciudad + ", " + pais);
        System.out.println("Categoria:    " + categoria);
        System.out.println("Estrellas:    " + estrellas);
        System.out.println("Precio/noche: $" + precioNoche);
        System.out.println("Disponible:   " + (disponible ? "Si" : "No"));
        System.out.println("Info:         " + getInfo());
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel(
            "Hotel Manizales", "Calle 50 #20-30", "3001234567",
            "hotel@manizales.com", "50", "Manizales", "Colombia",
            4, 150000.0, "Resort"
        );

        hotel.mostrarInfo();

        System.out.println("\nPrecio por 3 noches: $" + hotel.calcularPrecioTotal(3));

        hotel.reservarHabitacion();
        hotel.reservarHabitacion(); 

        hotel.liberarHabitacion();
    }
}