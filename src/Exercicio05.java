import java.util.Scanner;

public class Exercicio05 {

    static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        double nota = scanner.nextDouble();

        boolean passouDeAno = nota >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;

        if (passouDeAno) {
            System.out.print("Você foi aprovado!");
            System.out.print("\n (～￣▽￣)～) ");
        } else {
            System.out.print("Você foi reprovado!");
            System.out.print("\n ( ˘︹˘ ) ");
        }

        scanner.close();
    }
}
