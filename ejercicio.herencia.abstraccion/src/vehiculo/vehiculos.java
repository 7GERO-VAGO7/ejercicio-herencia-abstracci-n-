package vehiculo;

public class vehiculos {

    public static int vehiculosCreados = 0;
    public static int kilometrosTotales = 0;
    public int kilometrosRecorridos;

    public vehiculos() {
        this.kilometrosRecorridos = 0;
        vehiculosCreados++;
    }

    public void recorrer(int distancia) {
        this.kilometrosRecorridos += distancia;
        kilometrosTotales += distancia;
    }


}