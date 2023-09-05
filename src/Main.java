import Habitaciones.IHabitacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a No Tell Motel");
        System.out.println("\tOpciones");
        System.out.println("\ta) Ver inventario completo");
        System.out.println("\tb) Ver inventario disponible");
        Scanner in = new Scanner(System.in);
        String opcion = in.next();
        Inventario inventario = new Inventario();
        if (opcion.equals("a")) {
            inventario.invetarioCompleto();
            return;
        }
        if (opcion.equals("b")) {
            inventario.invetarioDisponible();
            return;
        }
        System.out.println("Opcion Ínvalida");
    }
}