public class Vuelo {

    private String nombre;
    private int telefono;
    private int hora;
    private String ubicacion;

    public Vuelo(String nombre, int telefono, int hora, String ubicacion) {
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

    public String getNombre() { return nombre; }
    public int getTelefono() { return telefono; }
    public int getHora() { return hora; }
    public String getUbicacion() { return ubicacion; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public void setTelefono(int telefono) {
        if (telefono > 0) this.telefono = telefono;
    }
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) this.hora = hora;
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

    public void mostrarInfo(String mensajePersonalizado) {
        System.out.println(mensajePersonalizado + " " + nombre);
    }
}