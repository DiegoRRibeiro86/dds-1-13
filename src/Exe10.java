
import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a temperatura em graus Celcius: ");
        Double celcius = scanner.nextDouble();
        Double fahreinheit = celcius * 1.8 + 32;
        System.out.println(fahreinheit + " Fahreinheit.");

        scanner.close();
    }
}
