
import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Quanto você ganha por hora? ");
        Double salarioHora = scanner.nextDouble();
        System.out.print("Quantas horas você trabalhou no mês: ");
        Double horaMes = scanner.nextDouble();

        Double salarioBruto = obterSalarioBruto(salarioHora, horaMes);
        Double descontoIr = obterIr(salarioBruto);
        Double descontoInss = obterInss(salarioBruto);
        Double descontoSindical = obterSindicato(salarioBruto);
        Double salarioliquido = obterSalarioliquido(salarioBruto, descontoIr, descontoInss, descontoSindical);

        System.out.println("Seu salário bruto é de: R$" +salarioBruto);
        System.out.println("Você pagou R$" + descontoInss + " ao INSS.");
        System.out.println("Você pagou R$" + descontoSindical + " ao sindicato.");
        System.out.println("Seu salário líquido é de R$: "+ salarioliquido);

    }

    private static double obterSalarioliquido(Double salarioBruto, Double ir, Double inss, Double sindicato) { return salarioBruto - ir - inss - sindicato; }

    private static double obterSindicato(Double salarioBruto) { return salarioBruto * 0.05; }

    private static double obterInss(Double salarioBruto) { return salarioBruto * 0.08; }

    private static double obterIr(Double salarioBruto) { return salarioBruto * 0.11; }

    private static double obterSalarioBruto(Double valorHora, Double horaMes) { return valorHora * horaMes; }
}
