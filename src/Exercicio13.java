import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o dia da semana, sabendo que 1 é domingo e 7 é sábado: ");
        int dia = scanner.nextInt();

        String diaSemana = "";


        switch(dia) {
            case 1: diaSemana = "domingo";
                break;
            case 2: diaSemana = "segunda-feira";
                break;
            case 3: diaSemana = "terça-feira";
                break;
            case 4: diaSemana = "quarta-feira";
                break;
            case 5: diaSemana = "quinta-feira";
                break;
            case 6: diaSemana = "sexta-feira";
                break;
            case 7: diaSemana = "sábado";
                break;
            default:
                System.err.println("INVÁLIDO!");
                System.exit(1);
        }

        System.out.println("O dia escolhido foi: " + diaSemana);

        scanner.close();
    }
}
