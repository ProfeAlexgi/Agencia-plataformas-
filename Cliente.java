public class Cliente {
    
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected int cedula;
    protected String email;
    protected String contrasenia;
    protected String usuario;

    
    
    public Cliente(String nombre, String apellido, String telefono,int cedula ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cedula=cedula;
    }

    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public String getTelefono(){return telefono;}
    public int getCedula(){return cedula;}
     
     
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    public void actualizarDatos(String nuevoUsuario, String nuevacontrasenia, String nuevoTelefono, String nuevoEmail) {
       this.usuario= nuevoUsuario;
       this.contrasenia = nuevacontrasenia;
       this.telefono = nuevoTelefono;
       this.email = nuevoEmail;

    }


    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Telefono: " + telefono);
    }
    public void  RegistraCliente(){

        System.out.println("El cliente ha sido registrado exitosamente");    
    }
    public void MostrarInformacion() {
        System.out.println("Informacion del cliente \n");
        System.out.println(nombre + " " + apellido + " " + email);
    }
    }