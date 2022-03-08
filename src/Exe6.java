
import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o raio do círculo: ");
        Double numero = scanner.nextDouble();

        Double raio = numero * numero;
        Double area = 3.14 * raio;

        System.out.println("A área do círculo corresponde a: " + area + ".");

        scanner.close();
    }
}
