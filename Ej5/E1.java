package EJ1;

public class Libro {
    String nombre;
    String autor;
    int año;

    public Libro(String nombre, String autor, int año) {
        this.nombre = nombre;
        this.autor = autor;
        this.año = año;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
    }
}
package EJ1;

public class Biblioteca {
    String nombre;
    int cantLibros;
    Libro[] libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new Libro[100];
        cantLibros = 0;
    }

    public void agregarLibro(Libro l) {
        libros[cantLibros] = l;
        cantLibros++;
    }

    public void buscarLibro(String nombreBuscado) {
        boolean encontrado = false;

        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].nombre.equalsIgnoreCase(nombreBuscado)) {
                libros[i].mostrar();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Libro no encontrado");
        }
    }

    public void mostrar() {
        System.out.println("Biblioteca: " + nombre);
        for (int i = 0; i < cantLibros; i++) {
            libros[i].mostrar();
            System.out.println("------");
        }
    }
}
//Main
package EJ1;

public class Main {
    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca("Central");
        Biblioteca b2 = new Biblioteca("Zona Sur");

        b1.agregarLibro(new Libro("Java", "Autor1", 2020));
        b1.agregarLibro(new Libro("Python", "Autor2", 2021));

        b2.agregarLibro(new Libro("C++", "Autor3", 2019));
        b2.agregarLibro(new Libro("Java", "Autor4", 2018));

        b1.buscarLibro("Java");

        // Mostrar biblioteca con más libros
        if (b1.cantLibros > b2.cantLibros) {
            b1.mostrar();
        } else if (b2.cantLibros > b1.cantLibros) {
            b2.mostrar();
        } else {
            b1.mostrar();
            b2.mostrar();
        }
    }
}
