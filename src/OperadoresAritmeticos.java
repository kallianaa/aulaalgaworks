
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int adicao = 1 + 1;
        System.out.println("Adição: " + adicao);

        int subtracao = 1 - 1;
        System.out.println("Sub: " + subtracao);

        int multiplicacao = 2 * 2;
        System.out.println("Multiplicação: " + multiplicacao);

        int divisao = 4 / 2;
        System.out.println("Divisão: " + divisao);

        int modulo = 7 % 4;
        System.out.println("Módulo: " + modulo);

        int precedencia01 = 1 + 1 * 5;
        System.out.println("Precedencia 01: " + precedencia01);

        int precedencia02 = (1 + 1) * 5;
        System.out.println("Precedencia 02: " + precedencia02);

        int precedencia03 = 5 * (1 + 1);
        System.out.println("Precedencia 03: " + precedencia03);

        int precedencia04 = 5 * (1 + 1) + 2;
        System.out.println("Precedencia 04: " + precedencia04);

        int precedencia05 = 5 * ((1 + 1) + 2);
        System.out.println("Precedencia 05: " + precedencia05);


        int cinco = 5;
        int um = 1;

        int precedenciaComVariaveis = cinco * (um + um);
        System.out.println("Precedência com variáveis: " + precedenciaComVariaveis);
    }

}
