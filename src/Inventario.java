import Habitaciones.HabitacionDoble;
import Habitaciones.HabitacionLujo;
import Habitaciones.HabitacionSimple;
import Habitaciones.IHabitacion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventario {
    private final List<IHabitacion> habitaciones = new ArrayList<>();

    public Inventario() {
        habitaciones.add(new HabitacionSimple(1408, true));
        habitaciones.add(new HabitacionSimple(1010, false));
        habitaciones.add(new HabitacionSimple(302, false));
        habitaciones.add(new HabitacionDoble(103, true));
        habitaciones.add(new HabitacionDoble(104, true));
        habitaciones.add(new HabitacionLujo(999, false));
    }

    public void invetarioCompleto() {
        imprimirInventario(habitaciones);
    }

    public void invetarioDisponible() {
        imprimirInventario(habitaciones.stream().filter(IHabitacion::esDisponible).collect(Collectors.toList()));
    }

    private void imprimirInventario(List<IHabitacion> habitaciones) {
        habitaciones.forEach(h -> {
            System.out.println("==============================");
            System.out.printf("El número de habitación es: %s%n", h.getNumeroHabitacion());
            System.out.printf("La habitación está disponible: %s%n", h.esDisponible() ? "Si" : "No");
            System.out.printf("La habitación es para %s personas%n", h.getNumeroPersonas());
            System.out.printf("El costo por noche es de %s%n", h.getPrecioNoche());
            System.out.printf("La habitación tiene fantasma %s%n", h.tieneFantasma() ? "Si" : "No");
            System.out.println("La habitación tiene estas amenidades:");
            h.getAmenidades().forEach(a -> System.out.printf("\t- %s%n", a));
        });
    }
}
