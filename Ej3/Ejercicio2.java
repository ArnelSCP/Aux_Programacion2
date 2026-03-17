class Aula {
    String nombreAula;
    int piso;
    String[] estudiantes;
    int[] notas;

    public Aula(String nombreAula, int piso, String[] estudiantes, int[] notas) {
        this.nombreAula = nombreAula;
        this.piso = piso;
        this.estudiantes = estudiantes;
        this.notas = notas;
    }

    public void mostrar() {
        System.out.println("Nombre Aula: " + nombreAula);
        System.out.println("Piso: " + piso);

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + " - " + notas[i]);
        }
    }

    public void mostrar(int opcion) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (notas[i] >= 51) {
                System.out.println(estudiantes[i] + " - APROBADO");
            } else {
                System.out.println(estudiantes[i] + " - REPROBADO");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Arnel", "Pilar"};
        int[] notas = {67, 89};

        Aula aula = new Aula("Aula 409", 1, nombres, notas);

        aula.mostrar();

        aula.mostrar(1);
    }
}
