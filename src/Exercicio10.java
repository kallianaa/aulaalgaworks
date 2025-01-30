
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos anos você tem: ");
        int idade = scanner.nextInt();

        System.out.print("Quanto você já contribuiu para a previdência: ");
        int previdencia = scanner.nextInt();

        boolean aposentado = idade >= 55;
        boolean contribuicao = previdencia > 25;

        boolean podeaAposentar = aposentado && contribuicao;

        if (podeaAposentar) {
            System.out.println("Você pode se aposentar.");
        } else {
            System.out.println("Você não pode se aposentar!");
        }



        scanner.close();
    }
}
