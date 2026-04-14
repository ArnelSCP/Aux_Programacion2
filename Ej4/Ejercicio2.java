//Ejercicio 5
abstract class Figura {
    String color;

    public Figura(String c) {
        color = c;
    }

    abstract double obtenerArea();

    public void mostrar() {
        System.out.println("Color: " + color + " Area: " + obtenerArea());
    }
}

class Cuadrado extends Figura {
    double lado;

    public Cuadrado(String c, double l) {
        super(c);
        lado = l;
    }

    double obtenerArea() {
        return lado * lado;
    }
}

class Triangulo extends Figura {
    double base, altura;

    public Triangulo(String c, double b, double h) {
        super(c);
        base = b;
        altura = h;
    }

    double obtenerArea() {
        return (base * altura) / 2;
    }
}

public class Main2 {
    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado("Rojo", 4);
        Cuadrado c2 = new Cuadrado("Azul", 3);

        Triangulo t1 = new Triangulo("Verde", 4, 5);
        Triangulo t2 = new Triangulo("Amarillo", 6, 2);

        c1.mostrar();
        c2.mostrar();
        t1.mostrar();
        t2.mostrar();

        // comparar area
        if (c1.obtenerArea() > t1.obtenerArea()) {
            System.out.println("Mayor area: " + c1.color);
        } else {
            System.out.println("Mayor area: " + t1.color);
        }
    }
}
