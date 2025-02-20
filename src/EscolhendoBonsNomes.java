import java.util.Scanner;

public class EscolhendoBonsNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String cursoEscolhido = receberCursoDoUsuario(scanner);

        imprimirTraco();

        String formaPagamentoEscolhida = receberFormaPagamentoDoUsuario(scanner);

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    static String receberFormaPagamentoDoUsuario(Scanner scanner) {
        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamento abaixo: ");

        iterarEExibirPosicoesDoVetorString(formasPagamento);

        int posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario(formasPagamento, "Sua forma de pagamento escolhida é: ", scanner);

        return formasPagamento[posicaoFormaPagamentoEscolhida];
    }

    static String receberCursoDoUsuario(Scanner scanner) {
        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        iterarEExibirPosicoesDoVetorString(cursos);

        int posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "O curso que você deseja é o: ", scanner);

        return cursos[posicaoCursoEscolhido];
    }

    static int receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner scanner) {
        int posicaoEscolhida = receberNumeroInteiroDoUsuario(texto, scanner);

        boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhida, vetor);

        if (!posicaoValida) {
            encerrarProgramaPorCausaDaPosicaoInvalida();
        }

        return posicaoEscolhida;
    }

    static int receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
        imprimirEContinuarNaMesmaLinha(texto);
        int numero = scanner.nextInt();

        return numero;
    }

    static boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
        boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }

    static void imprimirEContinuarNaMesmaLinha(String texto) {
        System.out.print(texto);
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
        iterarEExibirPosicoesDoVetorString(vetor, 0);
    }

    static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer i) {
        imprimir("[" + i + "] " + vetor[i]);

        if (++i < vetor.length) {
            iterarEExibirPosicoesDoVetorString(vetor, i);
        }
    }

    static void imprimirTraco() {
        imprimir("----------------------------------------------");
    }

    static void encerrarProgramaPorCausaDaPosicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }

}