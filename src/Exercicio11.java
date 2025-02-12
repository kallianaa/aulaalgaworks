
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double notaMinima = 60.0;
        double notaDeCorte = 150.0;

        double matematicaNota = 100.0;
        double portuguesNota = 100.0;


        System.out.println("VERIFICANDO SE TEM NOTA SUFICIENTE PARA CONCURSO.");
        System.out.print("\nDigite qual foi sua nota em matemática: ");
        double matematica = scanner.nextDouble();

        System.out.print("Digite qual foi sua nota em português: ");
        double portugues = scanner.nextDouble();



        boolean estaAcimaDoMinimoEmPortugues = portugues >= notaMinima;
        boolean estaAcimaDoMinimoEmMatematica = matematica >= notaMinima;
        double notaTotal = matematica + portugues;
        boolean notaParaPassar = notaTotal >= notaDeCorte;
        boolean passou = notaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;

        if (passou) {
            System.out.println("Parabéns! Você passou de ano.");
        } else {
            System.out.println("Você não passou de ano.");
        }



        scanner.close();
    }
}
