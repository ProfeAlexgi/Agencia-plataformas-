public class Hotel {

    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private int numeroHabitaciones;

    public Hotel(String nombre, String direccion, String telefono, String correo, int numeroHabitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
    public int getNumeroHabitaciones() { return numeroHabitaciones; }

    public void mostrarInfo() {
        System.out.println("Hotel: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Habitaciones: " + numeroHabitaciones);
    }
}