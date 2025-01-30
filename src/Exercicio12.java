import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite qual foi a meta de faturamento anual: R$ ");
        double meta = scanner.nextDouble();

        System.out.print("\nDigite qual foi o faturamento: R$ ");
        double faturamento = scanner.nextDouble();

        System.out.print("\nDigite a média salarial dos últimos 12 meses: R$ ");
        double mediaSalarialFuncionario = scanner.nextDouble();


        double oitentaPorCentoDaMeta = (meta * 80) / 100;

        boolean bateuAMeta = faturamento >= meta;

        boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;

        if (bateuAMeta) {
            System.out.println("VOCE GANHOU O BONUS DE 100%: R$ " + mediaSalarialFuncionario);
        } else if (faturouPeloMenosOitentaPorCento) {
            double oitentaPorCentoDaMediaSalarial = (mediaSalarialFuncionario * 80) / 100; // nao bateu a meta, mas faturou pelo menos 80% da meta

            System.out.println("Você vai ganhar um bônus de 80%! Ele será de: " + oitentaPorCentoDaMediaSalarial);
        } else {
            System.out.println("SEM BONUS.");
        }




        scanner.close();
    }
}
