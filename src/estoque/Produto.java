package estoque;

public class Produto {

    static final int quantidadeMinimaEstoque = 10;

    String nome;

    int quantidadeEstoque;

    boolean reporEstoque(){
        if (quantidadeEstoque < Produto.quantidadeMinimaEstoque) {
            return true;
        }

        return false;
    }

}