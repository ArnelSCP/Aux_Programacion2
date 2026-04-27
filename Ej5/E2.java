package EJ2;

public class Animal {
    String nombre;
    int edad;
    String nombreDueño;

    public Animal(String nombre, int edad, String nombreDueño) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueño = nombreDueño;
    }
}
package EJ2;

public class Perro extends Animal {
    boolean requiereBozal;
    boolean ladraFuerte;

    public Perro(String nombre, int edad, String dueño, boolean bozal, boolean ladra) {
        super(nombre, edad, dueño);
        this.requiereBozal = bozal;
        this.ladraFuerte = ladra;
    }
}
package EJ2;

public class Gato extends Animal {
    boolean cazaRatones;
    boolean tomaLeche;

    public Gato(String nombre, int edad, String dueño, boolean caza, boolean leche) {
        super(nombre, edad, dueño);
        this.cazaRatones = caza;
        this.tomaLeche = leche;
    }
}
package EJ2;

public class CentroVeterinario {

    String nombre;
    Perro[] perros;
    Gato[] gatos;
    int cantPerros;
    int cantGatos;

    public CentroVeterinario(String nombre) {
        this.nombre = nombre;
        perros = new Perro[100];
        gatos = new Gato[100];
        cantPerros = 0;
        cantGatos = 0;
    }

    public void agregarPerro(Perro p) {
        perros[cantPerros++] = p;
    }

    public void agregarGato(Gato g) {
        gatos[cantGatos++] = g;
    }

    // Ordenar perros
    public void ordenarPerros() {
        for (int i = 0; i < cantPerros - 1; i++) {
            for (int j = i + 1; j < cantPerros; j++) {

                if (perros[i].edad > perros[j].edad ||
                   (perros[i].edad == perros[j].edad &&
                    perros[i].nombreDueño.compareTo(perros[j].nombreDueño) > 0) ||
                   (perros[i].edad == perros[j].edad &&
                    perros[i].nombreDueño.equals(perros[j].nombreDueño) &&
                    perros[i].nombre.compareTo(perros[j].nombre) > 0)) {

                    Perro aux = perros[i];
                    perros[i] = perros[j];
                    perros[j] = aux;
                }
            }
        }
    }

    //Ordenar gatos
    public void ordenarGatos() {
        for (int i = 0; i < cantGatos - 1; i++) {
            for (int j = i + 1; j < cantGatos; j++) {

                if ((!gatos[i].tomaLeche && gatos[j].tomaLeche) ||
                   (gatos[i].tomaLeche == gatos[j].tomaLeche &&
                    gatos[i].edad < gatos[j].edad) ||
                   (gatos[i].edad == gatos[j].edad &&
                    gatos[i].nombre.compareTo(gatos[j].nombre) > 0)) {

                    Gato aux = gatos[i];
                    gatos[i] = gatos[j];
                    gatos[j] = aux;
                }
            }
        }
    }

    //vERIFICAR DUEÑO
    public void verificarDueño(String dueño) {
        int contador = 0;

        for (int i = 0; i < cantPerros; i++) {
            if (perros[i].nombreDueño.equals(dueño)) {
                contador++;
            }
        }

        for (int i = 0; i < cantGatos; i++) {
            if (gatos[i].nombreDueño.equals(dueño)) {
                contador++;
            }
        }

        if (contador >= 2) {
            System.out.println("El dueño " + dueño + " tiene " + contador + " animales");
        }
    }
}
//MAIN
package EJ2;

public class Main {
    public static void main(String[] args) {

        CentroVeterinario c1 = new CentroVeterinario("Vet 1");
        CentroVeterinario c2 = new CentroVeterinario("Vet 2");

        c1.agregarPerro(new Perro("Firulais", 5, "Juan", true, true));
        c1.agregarPerro(new Perro("Max", 3, "Juan", false, true));

        c1.agregarGato(new Gato("Michi", 2, "Ana", true, true));
        c1.agregarGato(new Gato("Luna", 4, "Ana", false, false));

        c1.ordenarPerros();
        c1.ordenarGatos();

        c1.verificarDueno("Juan");
    }
}
