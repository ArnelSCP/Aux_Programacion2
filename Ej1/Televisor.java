class Televisor {
    private String marca;
    private int resolucion;
    private String tipo;

    public Televisor(String marca, int resolucion, String tipo) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }

    public Televisor() {}

    @Override
    public String toString() {
        return "TV: " + marca + " | Res: " + resolucion + "p | Tipo: " + tipo;
    }
}

public class MainTelevisor {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Samsung", 4, "OLED");
        Televisor tv2 = new Televisor(); 

        System.out.println(tv1.toString());
        System.out.println("Segundo objeto creado (vacío por ahora)");
    }
}
