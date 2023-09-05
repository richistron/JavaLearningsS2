package Habitaciones;

import java.util.List;

public interface IHabitacion {
    boolean esDisponible();
    boolean tieneFantasma();
    int getNumeroHabitacion();
    int getNumeroPersonas();
    double getPrecioNoche();
    List<String> getAmenidades();
}
