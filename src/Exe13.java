
import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite sua altura: ");
        Double h = scanner.nextDouble();
        Double m = imcM(h);
        Double f = imcF(h);
        System.out.println("Se gênero for 'M', seu peso ideal é: " + m + " . Se gênero for 'F' seu peso ideal é: " + f);
        scanner.close();

    }

    private static double imcF(Double h) { return (62.1 * h) - 44.7; }

    private static double imcM(Double h) { return (72.7 * h) - 58; }
}
