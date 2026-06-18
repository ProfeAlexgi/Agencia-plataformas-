public class Cliente {

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String cedula;
    // se agrega correo
    protected String correo;

    public Cliente(String nombre, String apellido, String telefono, String cedula, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cedula = cedula;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCedula() {
        return cedula;
    }

    // get correo
    public String getCorreo() {
        return correo;
    }

    // setters
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Telefono: " + telefono);
    }

    public void RegistraCliente() {

        System.out.println("El cliente ha sido registrado exitosamente");
    }

    public void MostrarInformacion() {
        System.out.println("Informacion del cliente");
        System.out.println(nombre + " " + apellido + " " + correo);
    }
    //Actualizar datos
    public void actualizarDatos(String nuevoTelefono, String nuevoCorreo) {
    this.telefono = nuevoTelefono;
    this.correo = nuevoCorreo;
    System.out.println("Datos actualizados correctamente.");
}
}