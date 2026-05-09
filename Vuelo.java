public class Vuelo {

    public String nombre;
    public int telefono;
    public int hora;
    public String ubicacion;
    public String servicios;

    public Vuelo(String nombre, int telefono, int hora, String ubicacion, String servicios) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.servicios = servicios;
    }

    public String getNombre() { 
        return nombre; 
    }

    public int getTelefono() { 
        return telefono; 
    }

    public int getHora() {
        return hora; 
    }

    public String getUbicacion() { 
        return ubicacion; 
    }

    public void mostrarInfo() {
        System.out.println("--- DETALLE COMPLETO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Hora: " + hora);
        System.out.println("Telefono: " + telefono);
        System.out.println("Servicios: " + servicios);
    }

    public void cambiarhora(int nueva_hora){
        this.hora = nueva_hora;
    }

    public void modificarservicio(String agregar_servicio){
        this.servicios = agregar_servicio;
    }

    public void mostrarInfo(String mensajePersonalizado) {
        System.out.println(mensajePersonalizado + " " + nombre);
    }

    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("HPMYADMIN", 320200342, 10, "medellin", "Se ofrece un incrible bufet que va incluido en la compra del vuelo");
        
        vuelo.cambiarhora(10);
        vuelo.mostrarInfo();
        vuelo.modificarservicio("Se ofrece un asiento exclusivo para todos los que an estado en nuestra aerolinea durante mas de 10 años");
    }
}