package principal;

import model.Veiculo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Informe os quilômetros percorridos: ");
        double quilometrosPercorridos = scanner.nextDouble();

        System.out.print("Informe os litros de combustível consumidos: ");
        double litrosConsumidos = scanner.nextDouble();
        
        Veiculo veiculo = new Veiculo(quilometrosPercorridos, litrosConsumidos);

        double consumo = veiculo.calcularConsumo();
        System.out.printf("O consumo do veículo é: %.2f km/l%n", consumo);
        
        scanner.close();
    }
}