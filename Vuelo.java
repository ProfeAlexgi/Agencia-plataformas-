public class Vuelo {

    public String nombre;
    public int telefono;
    public int hora;
    public String ubicacion;
    public Vuelo(String nombre, int telefono, int hora, String ubicacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.hora = hora;
        this.ubicacion = ubicacion;
    }

   
    public String getNombre() { return nombre; }
    public int getTelefono() { return telefono; }
    public int getHora() { return hora; }
    public String getUbicacion() { return ubicacion; }
    public void mostrarInfo() {
        System.out.println("Vuelo: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Hora: " + hora);
        System.out.println("Ubicación: " + ubicacion);
    }

    public void mostrarInfo(boolean detallado) {
        if (detallado) {
            System.out.println("--- DETALLE COMPLETO ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Ubicacion: " + ubicacion);
            System.out.println("Hora: " + hora);
            System.out.println("Telefono: " + telefono);
        } else {
            mostrarInfo();
        }
    }


    public void mostrarInfo(String mensajePersonalizado) {
        System.out.println(mensajePersonalizado + " " + nombre);
    }
}
