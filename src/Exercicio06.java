import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        double subTotal = valorProduto * quantidade;

        boolean quantidadeMaiorOuIgualDez = quantidade >= 10;


        double percentualDesconto = 0.0;

        if (quantidadeMaiorOuIgualDez) {
            percentualDesconto = 10.0;
        }

        double desconto = subTotal * percentualDesconto / 100;

        double valorTotalComDesconto = subTotal - desconto;

        System.out.println("Valor total: " + valorTotalComDesconto);

        scanner.close();
    }
}


