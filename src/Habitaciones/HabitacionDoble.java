package Habitaciones;

public class HabitacionDoble extends HabitacionBase{
    public HabitacionDoble(int numeroHabitacion, boolean disponible) {
        numeroPersonas = 2;
        precioNoche = 250;
        tipoHabitacion = "Doble";
        amenidades.add("Jacuzzi");
        this.disponible = disponible;
        this.numeroHabitacion = numeroHabitacion;
    }
}
