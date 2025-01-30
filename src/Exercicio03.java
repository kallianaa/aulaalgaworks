import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para saber seu quadrado: ");
        int multiplica = scanner.nextInt();

        System.out.print("Seu quadrado é: "+ multiplica*multiplica);

        scanner.close();
    }
}
