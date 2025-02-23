package estoque;


import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("Informe o nome do produto que precisa conferir o estoque: ");
        produto.nome = scanner.nextLine();

        System.out.print("Informe a quantidade em estoque do produto " + produto.nome + ": ");
        produto.quantidadeEstoque = scanner.nextInt();

//        boolean precisaReposicao = reporEstoque(produto);
        System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + produto.reporEstoque()); //

        scanner.close();
    }
//
//    static boolean reporEstoque(Produto produto) {
//        return produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE;
//    }
}