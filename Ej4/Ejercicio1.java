//Ejercicio 3
class Persona {
    String nombre;
    int edad;

    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }

    public void mostrar() {
        System.out.println(nombre + " - " + edad);
    }
}

class Estudiante extends Persona {
    String carrera;

    public Estudiante(String n, int e, String c) {
        super(n, e);
        carrera = c;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Carrera: " + carrera);
    }

    public boolean mismaCarrera(Estudiante otro) {
        return this.carrera.equals(otro.carrera);
    }
}

class Docente extends Persona {
    String materia;

    public Docente(String n, int e, String m) {
        super(n, e);
        materia = m;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Materia: " + materia);
    }
}

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Juan", 20, "Informatica");
        Estudiante e2 = new Estudiante("Ana", 25, "Informatica");
        Docente d1 = new Docente("Luis", 25, "Programacion");

        e1.mostrar();
        e2.mostrar();
        d1.mostrar();

        // misma edad
        if (e1.edad == d1.edad || e2.edad == d1.edad) {
            System.out.println("Hay estudiante con misma edad que docente");
        }

        // misma carrera
        if (e1.mismaCarrera(e2)) {
            System.out.println("Estan en la misma carrera");
        }
    }
}
