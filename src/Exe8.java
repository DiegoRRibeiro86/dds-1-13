
import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Quanto você ganha por hora trabalhada? ");
        Double ht = scanner.nextDouble();

        System.out.println("Quantas horas você trabalhou este mês? ");
        Double hm = scanner.nextDouble();

        Double sl = ht * hm;

        System.out.println("Neste mês seu salário será de: " + sl + ".");

        scanner.close();
    }
}
