public class Cliente {

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String cedula;
    protected String forma_de_pago;
    protected String lugares_mas_frecuentes;
    protected String lugar_de_partida;

    public Cliente(String nombre, String apellido, String telefono, String cedula, String forma_de_pago, String lugares_mas_frecuentes,String lugar_de_partida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cedula = cedula;
        this.forma_de_pago = forma_de_pago;
        this.lugares_mas_frecuentes=lugares_mas_frecuentes;
        this.lugar_de_partida=lugar_de_partida;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getTelefono() { return telefono; }
    public String getCedula() { return cedula; }
    public String getFormaDePago() { return forma_de_pago; }
    public String getLugaresMasFrecuentes(){ return lugares_mas_frecuentes;}
    public String getLugarDePartida(){ return lugar_de_partida;}

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Teléfono: " + telefono);
        System.out.println("lugar_de_partida:" + lugar_de_partida);
    }

    public void registrarCliente() {
        System.out.println("El cliente ha sido registrado exitosamente.");
    }

    public void mostrarInformacion() {
        System.out.println("Información del cliente:");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Cédula: " + cedula);
        System.out.println("Forma de pago: " + forma_de_pago);
        System.out.println("Lugar mas frecuentes: " + lugares_mas_frecuentes);
        System.out.println("lugar_de_partida:" + lugar_de_partida);
    }
}
 