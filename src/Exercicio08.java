import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();


        boolean valorFrete = valorProduto < 100;
        double valorTotal = valorProduto;

        if (valorFrete) {
            valorTotal += 15.0;
        }

        System.out.print("O valor final do produto será de : R$ " + valorTotal);

        scanner.close();
    }
}
