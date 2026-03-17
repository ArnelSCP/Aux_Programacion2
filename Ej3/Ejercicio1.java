import java.util.Scanner;

class Videojuego {
    String nombre;
    String plataforma;
    int jugadores;
    
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.jugadores = 0;
    }

    public Videojuego(String nombre, String plataforma, int jugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.jugadores = jugadores;
    }
    
    public void agregarJugadores() {
        jugadores = jugadores + 1;
    }
    
    public void agregarJugadores(int cantidad) {
        jugadores = jugadores + cantidad;
    }

    public void mostrar() {
        System.out.println(nombre + " - " + plataforma + " - Jugadores: " + jugadores);
    }
}
//main
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Videojuego v1 = new Videojuego("left4dead", "xbox");
        Videojuego v2 = new Videojuego("minecraft", "PC", 5);


        v1.agregarJugadores();

        System.out.print("Ingrese cantidad de jugadores a agregar: ");
        int cant = sc.nextInt();
        v2.agregarJugadores(cant);

        v1.mostrar();
        v2.mostrar();
    }
}

