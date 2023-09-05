package Habitaciones;

public class HabitacionLujo extends HabitacionBase {
    public HabitacionLujo(int numeroHabitacion, boolean disponible) {
        numeroPersonas = 2;
        precioNoche = 1530.50;
        tipoHabitacion = "Doble";
        amenidades.add("Jacuzzi");
        amenidades.add("Tele");
        amenidades.add("Mini bar");
        this.disponible = disponible;
        this.numeroHabitacion = numeroHabitacion;
    }
}
