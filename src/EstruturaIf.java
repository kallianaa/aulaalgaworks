
public class EstruturaIf {

    public static void main(String[] args) {
        double emprestimo = 4000.0;
        double movimentacaoMedia = 2000.0;

//		boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
        boolean aContaTemTempoSuficenteDeAbertura = true;
        boolean temNomeLimpo = true;

//		boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
//				&& aContaTemTempoSuficenteDeAbertura && temNomeLimpo;

        if (((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficenteDeAbertura && temNomeLimpo) {
            System.out.println("Sim! Pode liberar empréstimo.");
        } else {
            System.out.println("Não pode liberar o empréstimo.");
        }
    }

}
