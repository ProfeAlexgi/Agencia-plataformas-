package Modelos;

import java.time.LocalTime;

public class Vuelo {

    public String nombre;
    public int telefono;
    public int hora;
    public String ubicacion;
    public String codigo;
    public String origen;
    public String destino;
    public double precio;
    public int asientosDisponibles;
    public LocalTime horaSalida;
    public LocalTime horaLlegada;
    public double pesoMaximoEquipaje;
    public String tipoAsiento;

    public Vuelo(String nombre, int telefono, int hora, String ubicacion,
                 String codigo, String origen, String destino, double precio,
                 int asientosDisponibles, LocalTime horaSalida,
                 LocalTime horaLlegada, double pesoMaximoEquipaje,
                 String tipoAsiento) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.hora = hora;
        this.ubicacion = ubicacion;

        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.asientosDisponibles = asientosDisponibles;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.pesoMaximoEquipaje = pesoMaximoEquipaje;
        this.tipoAsiento = tipoAsiento;
    }
    public void mostrarInfo() {
        System.out.println("Vuelo: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Hora: " + hora);
        System.out.println("Ubicación: " + ubicacion);

        System.out.println("Código: " + codigo);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Precio: $" + precio);
    }
    public void mostrarInfo(boolean detallado) {
        if (detallado) {
            System.out.println("--- DETALLE COMPLETO ---");
            mostrarDatos();
        } else {
            mostrarInfo();
        }
    }

    public void mostrarInfo(String mensajePersonalizado) {
        System.out.println(mensajePersonalizado + " " + nombre);
    }

    public boolean validarEquipaje(double pesoMaleta) {
        if (pesoMaleta <= pesoMaximoEquipaje) {
            return true;
        } else {
            System.out.println("El equipaje excede el peso permitido (" 
                               + pesoMaximoEquipaje + " kg).");
            return false;
        }
    }
    public boolean hayAsientos() {
        return asientosDisponibles > 0;
    }    
    
    public void asignarAsiento() {
        if (hayAsientos()) {
            asientosDisponibles--;
            System.out.println("Asiento asignado correctamente.");
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }
    
    public void liberarAsiento() {
        asientosDisponibles++;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Hora salida: " + horaSalida);
        System.out.println("Hora llegada: " + horaLlegada);
        System.out.println("Precio: $" + precio);
        System.out.println("Asientos disponibles: " + asientosDisponibles);
        System.out.println("Peso máximo equipaje: " + pesoMaximoEquipaje + " Kg ");
        System.out.println("Tipo de asiento: " + tipoAsiento);
    }
}