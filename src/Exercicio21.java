import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int numero = scanner.nextInt();



        imprimirTabuada(numero, 0);

        scanner.close();
    }

    static void imprimirTabuada(int multiplicando, int multiplicador) {
        System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));

        if (++multiplicador <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }
    }

}