public class Bus {

    private int capacidad;
    private int pasajeros;
    private double precioPasaje;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.precioPasaje = 1.50;
    }

    public void subirPasajeros(int x) {
        if (pasajeros + x <= capacidad) {
            pasajeros = pasajeros + x;
        } else {
            System.out.println("no hay asientos.");
        }
    }

    public double cobrarPasaje() {
        return pasajeros * precioPasaje;
    }

    public int asientosDisponibles() {
        return capacidad - pasajeros;
    }

    public void mostrarInfo() {
        System.out.println("pasajeros: " + pasajeros);
        System.out.println("asientos disponibles: " + asientosDisponibles());
        System.out.println("cobro total: " + cobrarPasaje());
    }
}
//nuestro main
public class Main {

    public static void main(String[] args) {

        Bus bus1 = new Bus(40);

        bus1.subirPasajeros(15);

        bus1.mostrarInfo();
    }

}
