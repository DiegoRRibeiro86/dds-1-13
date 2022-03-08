
import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a área de um quadrado: ");
        Double n = scanner.nextDouble();
        Double a = n * n;
        Double aa = a * 2;
        System.out.println("O dobro da área desse quadrado é: " + aa + ".");

        scanner.close();
    }
}
