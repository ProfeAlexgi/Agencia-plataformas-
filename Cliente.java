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
    
    
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y soy cliente de la agencia");
    }
    
    public void mostrarCedula() {
        System.out.println("Mi cédula es: " + cedula);
    }
    
    public void despedirse() {
        System.out.println("Gracias por su atención, que tenga un buen día");
    }
}