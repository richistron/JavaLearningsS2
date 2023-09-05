package Habitaciones;

public class HabitacionSimple extends HabitacionBase {
    public HabitacionSimple(int numeroHabitacion, boolean disponible) {
        numeroPersonas = 1;
        precioNoche = 199.90;
        tipoHabitacion = "Simple";
        this.disponible = disponible;
        this.numeroHabitacion = numeroHabitacion;
    }
}
