import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Vuelo {

    private String codigoVuelo;
    private String nombre;
    private String telefono;       
    private LocalDateTime fechaHora;   
    private String origen;
    private String destino;
    private String aerolinea;
    private int capacidadMaxima;
    private int asientosOcupados;
    private double precioBase;
    private String estado;

    private static final List<String> ESTADOS_VALIDOS =
            List.of("A TIEMPO", "RETRASADO", "CANCELADO");

    public Vuelo(String codigoVuelo, String nombre, String telefono,
                 LocalDateTime fechaHora, String origen, String destino,
                 String aerolinea, int capacidadMaxima, double precioBase) {
        this.codigoVuelo      = codigoVuelo;
        this.nombre           = nombre;
        this.fechaHora        = fechaHora;
        this.origen           = origen;
        this.destino          = destino;
        this.aerolinea        = aerolinea;
        this.asientosOcupados = 0;
        this.estado           = "A TIEMPO";
        setTelefono(telefono);
        setCapacidadMaxima(capacidadMaxima);
        setPrecioBase(precioBase);
    }

    public Vuelo(String nombre, String telefono, LocalDateTime fechaHora, String origen) {
        this("SIN-CODIGO", nombre, telefono, fechaHora, origen, "DESCONOCIDO",
             "DESCONOCIDA", 100, 0.0);
    }

    // ── Getters ────────────────────────────────────────────────────────────────
    public String getCodigoVuelo()    { return codigoVuelo; }
    public String getNombre()         { return nombre; }
    public String getTelefono()       { return telefono; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public String getOrigen()         { return origen; }
    public String getDestino()        { return destino; }
    public String getAerolinea()      { return aerolinea; }
    public int getCapacidadMaxima()   { return capacidadMaxima; }
    public int getAsientosOcupados()  { return asientosOcupados; }
    public double getPrecioBase()     { return precioBase; }
    public String getEstado()         { return estado; }

    // ── Setters con validación ─────────────────────────────────────────────────
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || !telefono.matches("\\d{7,15}"))
            throw new IllegalArgumentException("Teléfono inválido: debe tener entre 7 y 15 dígitos.");
        this.telefono = telefono;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        if (fechaHora == null)
            throw new IllegalArgumentException("La fecha/hora no puede ser nula.");
        this.fechaHora = fechaHora;
    }

    public void setCapacidadMaxima(int capacidad) {
        if (capacidad <= 0)
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0.");
        this.capacidadMaxima = capacidad;
    }

    public void setPrecioBase(double precio) {
        if (precio < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        this.precioBase = precio;
    }

    public void setEstado(String estado) {
        if (!ESTADOS_VALIDOS.contains(estado))
            throw new IllegalArgumentException("Estado inválido. Use: " + ESTADOS_VALIDOS);
        this.estado = estado;
    }


    // ── Mostrar información ────────────────────────────────────────────────────

    public void mostrarInfo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Vuelo     : " + codigoVuelo + " – " + nombre);
        System.out.println("Ruta      : " + origen + " → " + destino);
        System.out.println("Aerolínea : " + aerolinea);
        System.out.println("Fecha/Hora: " + fechaHora.format(fmt));
        System.out.println("Estado    : " + estado);
        System.out.println("Teléfono  : " + telefono);
    }

    public void mostrarInfo(boolean detallado) {
        if (detallado) {
            mostrarInfo();
        } else {
            System.out.println("[" + codigoVuelo + "] " + origen + " → " + destino + " | " + estado);
        }
    }
}