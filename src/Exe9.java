
import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a temperatura em Fahreinheit para ser convertida em Celcius: ");
        Double fahreinheit = scanner.nextDouble();

        Double celcius = 5 * ((fahreinheit -32)/9);

        System.out.println(celcius + " °Celcius.");

        scanner.close();
    }
}
