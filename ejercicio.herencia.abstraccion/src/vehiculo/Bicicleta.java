package vehiculo;

public class Bicicleta extends vehiculos{

    public void andar(int distancia) {
        recorrer(distancia);
        System.out.println("Estas andando la bicicleta");
    }

    public void picar(int distancia) {
        recorrer(distancia);
        System.out.println("Estas picando con la bicicleta");
    }
}