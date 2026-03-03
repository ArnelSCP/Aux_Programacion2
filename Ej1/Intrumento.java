class Instrumento {
    public String nombre;
    private String material;
    private String tipo;

    public Instrumento(String nombre, String material, String tipo) {
        this.nombre = nombre;
        this.material = material;
        this.tipo = tipo;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "Instrumento: " + nombre + " (" + material + ")";
    }
}

public class MainInstrumento {
    public static void main(String[] args) {
        Instrumento inst1 = new Instrumento("Guitarra", "Madera", "Cuerda");
        Instrumento inst2 = new Instrumento("Flauta", "Metal", "Aire");

        System.out.println(inst1.toString());
        System.out.println(inst2.toString());
    }
}
