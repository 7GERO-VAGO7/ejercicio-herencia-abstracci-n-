package vehiculo;

public class Carro extends vehiculos {
    public void andar(int distancia) {
        recorrer(distancia);
        System.out.println("estas andando en el carro");
    }

    public void quemarLlantas(int distancia) {
        recorrer(distancia);
        System.out.println("Estas Quemando llantas con el carro");
    }
}