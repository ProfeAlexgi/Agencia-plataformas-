public class Hotel{

    protected String nombre_hotel;
    protected String direccion_hotel;
    protected String telefono_hotel;
    protected String correo_hotel;
    String numero_habitaciones;
    
    
    public Hotel(String hotelNombre, String hotelDireccion, String hotelTelefono, String hotelCorreo, String habitacionesnum ) {
        this.nombre_hotel = hotelNombre;
        this.direccion_hotel = hotelDireccion;
        this.telefono_hotel = hotelTelefono;
        this.correo_hotel = hotelCorreo;
        this.numero_habitaciones = habitacionesnum;
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
    public boolean verificarDisponibilidad(int numeroHabitacionesRequeridas) {
    try {
        int habitacionesDisponibles = Integer.parseInt(numero_habitaciones);
        
        if (numeroHabitacionesRequeridas <= 0) {
            System.out.println("Número de habitaciones inválido");
            return false;
        }
        
        if (numeroHabitacionesRequeridas <= habitacionesDisponibles) {
            System.out.println("Hotel disponible. Habitaciones libres: " + 
                             (habitacionesDisponibles - numeroHabitacionesRequeridas));
            return true;
        } else {
            System.out.println("Hotel sin disponibilidad. Solo quedan: " + 
                             habitacionesDisponibles);
            return false;
        }
    } catch (NumberFormatException e) {
        System.out.println("Error: número de habitaciones inválido en la base de datos puestos");
        return false;
    }
}


}


