import java.util.Scanner;

public class Prova2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double kelvin = celsius + 273.15;

        // Saída formatada
        System.out.println("\n--- Conversão de Temperatura ---");
        System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        scanner.close();
    }
}
