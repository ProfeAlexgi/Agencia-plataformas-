public class Vuelo {

    public String nombre;
    public String telefono;
    public String hora;
    public String ubicacion;

    public Vuelo(String nombre, String telefono, String hora, String ubicacion) {

        // Validación nombre
        if (nombre == null || nombre.isEmpty()) {
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }

        // Validación teléfono
        if (telefono == null || telefono.isEmpty()) {
            this.telefono = "Sin teléfono";
        } else {
            this.telefono = telefono;
        }

        // Validación hora
        if (hora == null || hora.isEmpty()) {
            this.hora = "00:00";
        } else {
            this.hora = hora;
        }

        // Ubicación (sin validación por ahora)
        this.ubicacion = ubicacion;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getHora() { return hora; }
    public String getUbicacion() { return ubicacion; }

    public void mostrarInfo() {
        System.out.println(
            "Vuelo: " + nombre +
            "\nTeléfono: " + telefono +
            "\nHora: " + hora +
            "\nUbicación: " + ubicacion
        );
    }

    public void mostrarInfo(boolean detallado) {
        if (detallado) {
            System.out.println("--- DETALLE COMPLETO ---");
            mostrarInfo();
        } else {
            mostrarInfo();
        }
    }

    public void mostrarInfo(String mensajePersonalizado) {
        System.out.println(mensajePersonalizado + " " + nombre);
    }
}