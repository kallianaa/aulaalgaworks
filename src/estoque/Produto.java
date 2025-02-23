package estoque;

public class Produto {

    static final int QUANTIDADE_MINIMA_ESTOQUE = 10;

    String nome;

    int quantidadeEstoque;

    boolean reporEstoque(){
        if (quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }

        return false;
    }

}