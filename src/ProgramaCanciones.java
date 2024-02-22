import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaCanciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cancion> listaCanciones = new ArrayList<>();

        int opcion;
        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Agregar Canción");
            System.out.println("2. Imprimir Lista de Canciones");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarCancion(listaCanciones);
                    break;
                case 2:
                    imprimirListaCanciones(listaCanciones);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
    private static void agregarCancion(ArrayList<Cancion> listaCanciones) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título de la canción: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el intérprete de la canción: ");
        String interprete = scanner.nextLine();
        System.out.print("Ingrese el año de la canción: ");
        int año = scanner.nextInt();
        System.out.print("Duracion de la cancion en seg.: ");
        int duracion = scanner.nextInt();

        Cancion nuevaCancion = new Cancion(titulo, interprete, año, duracion);
        listaCanciones.add(nuevaCancion);

        System.out.println("Canción agregada con éxito.\n");
    }

    private static void imprimirListaCanciones(ArrayList<Cancion> listaCanciones) {
        if (listaCanciones.isEmpty()) {
            System.out.println("La lista de canciones está vacía.\n");
        } else {
            System.out.println("----- Lista de Canciones -----");
            for (Cancion cancion : listaCanciones) {
                System.out.println(cancion);
            }
            System.out.println();
        }
    }
}
