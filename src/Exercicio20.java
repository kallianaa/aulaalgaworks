import java.util.Scanner;


public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = numero(scanner);
        int numero2 = numero(scanner);

        imprimirTraco();

        int operacao = escolhaOperacao(scanner);

        imprimirTraco();

        int resultado = realizarCalculo(operacao, numero1, numero2);

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }

    static int realizarCalculo(int operacao, int numero1, int numero2) {
        Integer resultado = null;

        switch (operacao) {
            case 0:
                resultado = calculaSubtracao(numero1, numero2);
                break;
            case 1:
                resultado = caclulaAdicao(numero1, numero2);
                break;
            case 2:
                resultado = caclulaMultiplicacao(numero1, numero2);
                break;
            case 3:
                resultado = caclulaDivisao(numero1, numero2);
                break;
            default:
                System.err.println("Escolha uma operação válida!");
                System.exit(0);
        }

        return resultado;
    }

    static int calculaSubtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    static int caclulaAdicao(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static int caclulaMultiplicacao(int numero1, int numero2) {
        return numero1 * numero2;
    }

    static int caclulaDivisao(int numero1, int numero2) {
        return numero1 / numero2;
    }

    static int escolhaOperacao(Scanner scanner) {
        System.out.println("ESCOLHA A OPERAÇÃO");

        String[] operacoes = new String[] {"Subtração", "Adição", "Multiplicação", "Divisão"};

        for(int i = 0; i < operacoes.length; i++) {
            System.out.println("[" + i + "] " + operacoes[i]);
        }

        System.out.print("Digite a operação: ");

        return scanner.nextInt();
    }

    static int numero(Scanner scanner) {
        System.out.print("Informe um número inteiro: ");
        return scanner.nextInt();
    }

    static void imprimirTraco() {
        System.out.println("********************************************");
    }
}
