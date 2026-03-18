public class Reserva{

    public String crearReserva() {
        if (hotel.getHabitacionesDisponibles() >= cantidadHabitaciones) {
            hotel.setHabitacionesDisponibles(
                hotel.getHabitacionesDisponibles() - cantidadHabitaciones
            );
            confirmada = true;
            return "Reserva confirmada para " + cliente.getNombre();
        } else {
            return "No hay habitaciones disponibles";
        }
    }

  
}
