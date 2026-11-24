public class Vuelo {

    private String nombre;
    private String telefono;
    private int hora;
    private String ubicacion;
    private String servicios;

    public Vuelo(String nombre, String telefono, int hora, String ubicacion, String servicios) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.servicios = servicios;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public int getHora() { return hora; }
    public String getUbicacion() { return ubicacion; }
    public String getServicios() { return servicios; }

    public void cambiarHora(int nuevaHora) {
        if (nuevaHora < 0 || nuevaHora > 23) {
            System.out.println("Hora invalida: debe estar entre 0 y 23");
            return;
        }
        this.hora = nuevaHora;
    }

    public void agregarServicio(String servicio) {
        this.servicios = this.servicios + ", " + servicio;
    }

    public void mostrarInfo() {
        System.out.println("Vuelo: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Hora: " + hora + ":00");
        System.out.println("Telefono: " + telefono);
        System.out.println("Servicios: " + servicios);    }
}