

  public class Vuelo{

    protected String origen;
    protected String destino;
    protected String fecha;
    protected double precio;

    public Vuelo(String origen, String destino, String fecha, double precio){
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getOrigen(){return origen;}
    public String getDestino(){return destino;}
    public String getFecha(){return fecha;}
    public double getPrecio(){return precio;}

    public void mostrarInfo(){
        System.out.println("Vuelo: " + origen + " -> " + destino);
        System.out.println("Fecha: " + fecha);
        System.out.println("Precio: " + precio);
    }
}

