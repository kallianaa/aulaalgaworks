
public class Vetores2Dimensoes {

    public static void main(String[] args) {
        double faturamentoDia = 1000.0;

        double[] faturamentoJaneiro = new double[] { 1500.0, 2000.0, 1700.0 };
        double[] faturamentoFevereiro = new double[] { 1000.0, 2500.0, 1800.0 };

        double[][] faturamentoAnual = new double[][] { faturamentoJaneiro, faturamentoFevereiro };

//		System.out.println("Faturamento do dia 1º de Janeiro: " + faturamentoAnual[0][0]);
//		System.out.println("Faturamento do dia 3 de Fevereiro: " + faturamentoAnual[1][2]);

        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println("Mês: " + (i + 1));

            double[] mes = faturamentoAnual[i];

            for(int y = 0; y < mes.length; y++) {
                double dia = mes[y]; // double dia = faturamentoAnual[i][y];

                System.out.println("Dia " + (y + 1) + ": " + dia);
            }
        }
    }
}