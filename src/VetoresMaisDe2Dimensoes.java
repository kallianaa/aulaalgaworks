
public class VetoresMaisDe2Dimensoes {

    public static void main(String[] args) {
        double[] faturamentoJaneiro = new double[] { 1500.0, 2000.0, 1700.0 };
        double[] faturamentoFevereiro = new double[] { 1000.0, 2500.0, 1800.0 };

        double[][] faturamentoAnual = new double[][] { faturamentoJaneiro, faturamentoFevereiro };

        double[][][] faturamentoQuinquenal = new double[][][] { faturamentoAnual };

        double[][][][] faturamentoDaDecada = new double[][][][] { faturamentoQuinquenal };
    }
}