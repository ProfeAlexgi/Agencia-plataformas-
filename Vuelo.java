public class Vuelo {

    public String nombre;
    public int telefono;
    public int hora;
    public String ubicacion;
    public String piloto;
    public String copiloto;
    public int azafatas;
    public Vuelo(String nombre, int telefono, int hora, String ubicacion, String piloto, String copiloto, int azafatas) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.azafatas = azafatas;
    }

   
    public String getNombre() { return nombre; }
    public int getTelefono() { return telefono; }
    public int getHora() { return hora; }
    public String getUbicacion() { return ubicacion; }
    public String getPiloto() { return piloto; }
    public String getCopiloto() { return copiloto; }
    public int getAzafatas() { return azafatas; }
    
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

    public void motrarTripulacion(){
        System.out.println("Piloto: " + piloto);
        System.out.println("Copiloto: " + copiloto);
        System.out.println("Cantidad de azafatas: " + azafatas);
    }
}