package vehiculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Bicicleta bici = new Bicicleta();
        Carro car = new Carro();
        new vehiculos();
        
        do {
            System.out.println("elije una opcion");
            System.out.println("1. Desplazarme en bicicleta");
            System.out.println("2. Picar la bicicleta");
            System.out.println("3. Desplazarme en carro");
            System.out.println("4. Quemar llanta");
            System.out.println("5. Kilometros recorridos en carro");
            System.out.println("6. Kilometros recorridos en bicicleta");
            System.out.println("7. Kilometros totales");
            System.out.println("8. Salir ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Ingresa la distancia que recorriste en bicicleta: ");
                    int distanciaBicicleta = scanner.nextInt();
                    bici.andar(distanciaBicicleta);
                    break;
                case 2:
                    System.out.print("Ingresa la distancia que recorriste picando la bicicleta: ");
                    int picar = scanner.nextInt();
                    bici.picar(picar);
                    break;
                case 3:
                    System.out.print("Ingresa la distancia que recorriste en carro: ");
                    int distanciaCarro = scanner.nextInt();
                    car.andar(distanciaCarro);
                    break;
                case 4:
                    System.out.print("Ingrese la distancia que recorriste al quemar llantas: ");
                    int quemar = scanner.nextInt();
                    car.quemarLlantas(quemar);
                    break;
                case 5:
                    System.out.println("Kilometraje de la bicicleta: " + vehiculos.kilometrosTotales + " km");
                    break;
                case 6:
                    System.out.println("Kilometraje del carro: " + bici.kilometrosRecorridos + " km");
                    break;
                case 7:
                    System.out.println("Kilometraje total: " + car.kilometrosRecorridos + " km");
                    break;
            }
            System.out.println();
        }while(opcion != 8);
        System.out.println("saliendo");
        scanner.close();
    }
}
