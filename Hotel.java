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
     
     

    public String getInfo(){
        return direccion_hotel + " " + telefono_hotel + " " + correo_hotel + " " + numero_habitaciones;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombreHotel());
        System.out.println("Informacion hotel: " + getInfo());
    }

    public enum Detallado {
        BASICO,
        INTERMEDIO,
        COMPLETO
    }

    public void mostrarInfo(Detallado nivel) {
        switch (nivel) {
            case BASICO:
                System.out.println("--------------------------------");
                System.out.println("Nombre: " + getNombreHotel());
                System.out.println("--------------------------------");
                break;
            case INTERMEDIO:
                System.out.println("--------------------------------");
                System.out.println("Nombre: " + getNombreHotel());
                System.out.println("Direccion: " + getDireccionHotel());
                System.out.println("--------------------------------");
                break;
            case COMPLETO:            
                System.out.println("--------------------------------");
                System.out.println("Nombre: " + getNombreHotel());
                System.out.println("Direccion: " + getDireccionHotel());
                System.out.println("Telefono: " + getTelefonoHotel());
                System.out.println("Correo: " + getCorreoHotel());
                System.out.println("Numero de habitaciones: " + getNumeroHabitaciones());
                System.out.println("--------------------------------");
                break;

            default:
                System.out.println("--------------------------------");
                System.out.println("Opcion no valida, por favor seleccione un nivel de detalle valido (BASICO, INTERMEDIO, COMPLETO) al pie de la letra en mayusculas.");
                System.out.println("--------------------------------");
                break;
        }
    }

    public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Hotel Sol", "Calle Principal 123", "555-1234", "info@hotsol.com", "25");
        hotel1.mostrarInfo(Detallado.COMPLETO);
        hotel1.mostrarInfo(Detallado.INTERMEDIO);
        hotel1.mostrarInfo(Detallado.BASICO);
        hotel1.mostrarInfo();
    }
}
}


