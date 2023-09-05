package Habitaciones;

import java.util.ArrayList;
import java.util.List;

public class HabitacionBase implements IHabitacion {
    protected int numeroPersonas = 0;
    protected int numeroHabitacion = 0;
    protected List<String> amenidades = new ArrayList<String>();
    protected double precioNoche = 0;
    protected boolean disponible = false;
    protected String tipoHabitacion = "Sin Implementar";

    public HabitacionBase() {
        amenidadesBasicas();
    }

    public boolean esDisponible() {
        return disponible;
    }

    public boolean tieneFantasma() {
        return numeroHabitacion == 1408;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }


    public List<String> getAmenidades() {
        return amenidades;
    }

    private void amenidadesBasicas() {
        amenidades.add("Cama");
        amenidades.add("Baño");
    }
}
