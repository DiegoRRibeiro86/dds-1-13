import java.util.Scanner;

public class Exercicio03 {
    static final Integer PASSOU_DE_ANO = 70;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        double notaDoAluno = scanner.nextDouble();

        boolean passouDeAno = notaDoAluno >= PASSOU_DE_ANO;

        if (passouDeAno) {
            System.out.println("Parabéns! Você passou de ano.");
        } else {
            System.out.println("Infelizmente, ficou de recuperação.");
        }

        scanner.close();
    }
}
