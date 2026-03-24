public class Cliente {
    
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String cedula;
    
    
    public Cliente(String nombre, String apellido, String telefono,String cedula ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cedula=cedula;
    }

    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public String getTelefono(){return telefono;}
    public String getCedula(){return cedula;}
     
     
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Telefono: " + telefono);
    }
    public RegistraCliente(){

        System.out.println("El cliente ha sido registrado exitosamente");    
    }
    public void MostrarInformacion() {System.out.println(Informacion del clliente \n};
     {System.out.println(nombre+""+apellido""+correo)};

 