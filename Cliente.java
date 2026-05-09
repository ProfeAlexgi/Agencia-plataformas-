public class Cliente {
    
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String tipoDocumento;
    protected String cedula;
    protected String correo;
    protected String paisOrigen;
    protected int edad;
    protected int puntos = 0;
    
    public Cliente(String nombre, String apellido, String telefono, String cedula, 
                   String correo, String paisOrigen, String tipoDocumento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoDocumento = tipoDocumento;
        this.cedula = cedula;
        this.correo = correo;
        this.paisOrigen = paisOrigen;
        this.edad = edad;
    }

    public String getNombre()        { return nombre; }
    public String getApellido()      { return apellido; }
    public String getTelefono()      { return telefono; }
    public String getCedula()        { return cedula; }
    public String getCorreo()        { return correo; }
    public String getPaisOrigen()    { return paisOrigen; }
    public String getTipoDocumento() { return tipoDocumento; }
    public int getEdad()             { return edad; }
    public int getPuntos()           { return puntos; }

    public void acumularPuntos(int puntosGanados) {
        this.puntos += puntosGanados;
        System.out.println("Puntos acumulados: " + this.puntos);
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void registraCliente() {
        System.out.println("El cliente ha sido registrado exitosamente");
    }

    public void mostrarInformacion() {
        System.out.println("=== Informacion del cliente ===");
        System.out.println("Nombre           : " + getNombreCompleto());
        System.out.println("Telefono         : " + telefono);
        System.out.println("Correo           : " + correo);
        System.out.println("Pais de origen   : " + paisOrigen);
        System.out.println("Tipo de documento: " + tipoDocumento);
        System.out.println("Cedula           : " + cedula);
        System.out.println("Edad             : " + edad);
    }


    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(
            "Juan", "Pérez", "3001234567",
            "1234567890", "juan@email.com",
            "Colombia", "Cédula", 28
        );

        cliente1.registraCliente();
        cliente1.mostrarInformacion();
        System.out.println("----------------------------");
        cliente1.acumularPuntos(100);
        cliente1.acumularPuntos(250);
        System.out.println("Total de puntos: " + cliente1.getPuntos());
        
    }
}