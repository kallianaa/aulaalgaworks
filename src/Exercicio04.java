import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("\n");
        System.out.print("SEU NOME É: " + nome + " E " + "SEU SOBRENOME É: " + sobrenome);


        System.out.print("\n");
        System.out.print("\n(～￣▽￣)～");
        System.out.print("\n");

        scanner.close();
    }
}
