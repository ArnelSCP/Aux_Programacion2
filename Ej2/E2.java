//usaremos dos clases (jugador y servidor)
// Clase jugador
public class Jugador {

    private String nombre;
    private int diamantes;

    public Jugador(String nombre, int diamantes) {
        this.nombre = nombre;
        this.diamantes = diamantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDiamantes() {
        return diamantes;
    }

    public int stacks() {
        return diamantes / 64;
    }
}
//Clase servidor
public class Servidor {

    private Jugador[] jugadores;
    private int cantidad;

    public Servidor() {
        jugadores = new Jugador[10];
        cantidad = 0;
    }

    public void agregarJugador(Jugador j) {
        if (cantidad < 10) {
            jugadores[cantidad] = j;
            cantidad++;
        } else {
            System.out.println("servidor lleno");
        }
    }

    public void mostrarStacks() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(jugadores[i].getNombre() +
                    " tiene " + jugadores[i].stacks() + " stacks");
        }
    }

    public String jugadorMasRico() {

        Jugador mayor = jugadores[0];

        for (int i = 1; i < cantidad; i++) {
            if (jugadores[i].getDiamantes() > mayor.getDiamantes()) {
                mayor = jugadores[i];
            }
        }

        return mayor.getNombre();
    }

    public int totalDiamantes() {

        int suma = 0;

        for (int i = 0; i < cantidad; i++) {
            suma = suma + jugadores[i].getDiamantes();
        }

        return suma;
    }
}
//nuestro main
public class Main {

    public static void main(String[] args) {

        Servidor s = new Servidor();

        s.agregarJugador(new Jugador("Steve", 120));
        s.agregarJugador(new Jugador("Alex", 300));
        s.agregarJugador(new Jugador("Arnel", 65));

        s.mostrarStacks();

        System.out.println("jugador con mas diamantes: " + s.jugadorMasRico());

        System.out.println("total de diamantes: " + s.totalDiamantes());
    }

}
