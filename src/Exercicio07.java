import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE UM NÚMERO: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("\n 1 - MULTIPLICAÇÃO" + "\n 2 - DIVISÃO" + "\n 3 - ADIÇÃO" + "\n 4 - SUBTRAÇÃO");
        System.out.print("Digite a operação que será realizada: ");
        int operacaoRealizada = scanner.nextInt();


        System.out.print("DIGITE OUTRO NÚMERO: ");
        int segundoNumero = scanner.nextInt();


        switch (operacaoRealizada) {
            case 1:
                System.out.println("RESULTADO: " + (primeiroNumero * segundoNumero));
                break;
            case 2:
                System.out.println("RESULTADO: " + (primeiroNumero / segundoNumero));
                break;
            case 3:
                System.out.println("RESULTADO: " + (primeiroNumero + segundoNumero));
                break;
            case 4:
                System.out.println("Resultado: " + (primeiroNumero - segundoNumero));
                break;
            default:
                System.out.println("OPS - OPERAÇÃO INVÁLIDA!");
                break;
        }

        scanner.close();
    }
}
