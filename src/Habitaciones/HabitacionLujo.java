package Habitaciones;

public class HabitacionLujo extends HabitacionBase {
    public HabitacionLujo(int numeroHabitacion, boolean disponible) {
        numeroPersonas = 4;
        precioNoche = 1530.50;
        tipoHabitacion = "Lujo";
        amenidades.add("Jacuzzi");
        amenidades.add("Tele");
        amenidades.add("Mini bar");
        this.disponible = disponible;
        this.numeroHabitacion = numeroHabitacion;
    }
}
