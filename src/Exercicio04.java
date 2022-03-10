import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desconto = 10;
        int totalPorcentagem = 100;

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        Integer quantidadeProduto = scanner.nextInt();

        double valorSubTotal = obterValorTotal(valorProduto, quantidadeProduto);
        double valorSubTotalDesconto = obterValorTotalDesconto(desconto, totalPorcentagem, valorSubTotal);
        double valorFinal = obterValorFinal(valorSubTotal, valorSubTotalDesconto);

        if (quantidadeProduto > 10) {
            System.out.println("Você receberá um desconto de 10%.");
            System.out.println("Sua compra com desconto é de R$ " + valorFinal + ".");
        }else{
            System.out.println("Sua compra é de R$ " + valorSubTotal + ".");
        }

        scanner.close();

    }

    private static double obterValorFinal(double valorTotal, double valorTotalDesconto) {
        return valorTotal - valorTotalDesconto;
    }

    private static double obterValorTotalDesconto(int desconto, int totalPorcentagem, double valorTotal) {
        return (valorTotal * desconto) / totalPorcentagem;
    }

    private static double obterValorTotal(Double valorProduto, Integer quantidadeProduto) {
        return valorProduto * quantidadeProduto;
    }
}
