
// Dada a lista de números abaixo:
//Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//... Itere por essa lista e imprima todos os números que são divisíveis por 3.
//Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo.
// Toda vez que o módulo de um número por 3 for igual a zero, então esse número e divisível por 3.

public class Exercicio15 {
    static final int divide = 3;
    public static void main(String[] args) {

        int[] numeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        int i = 0;
//        O que faz: Inicializa a variável i com o valor 0.
//        Por que é usado: i serve como índice para acessar os elementos do array.
//        Começamos com 0 porque o índice dos arrays em Java começa em 0.

//        length é um atributo que retorna o número total de elementos no array
//        O que faz: Cria um laço que continuará enquanto i for menor que o tamanho do array (numeros.length)
        while (i < numeros.length) {
//      A cada iteração, i é incrementado (i++), garantindo que o laço percorra todos os elementos.
            Integer numero = numeros[i];

//            O que faz: Obtém o elemento do array na posição i e o armazena na variável numero.
//            Observação: Mesmo que o array seja de tipo int,
//            o código utiliza a classe Integer para a variável numero,
//            permitindo o uso de métodos, como .equals(), posteriormente

            Integer dividePorTres = numero % divide;
//            Se o resto for 0, significa que numero é divisível por 3.

//            Condição: if (dividePorTres.equals(0)) verifica se o resto é igual a 0.
            if(dividePorTres.equals(0)){
//                Armazenamento do resultado: O resultado da operação é armazenado na variável dividePorTres.
                System.out.println("Número " + numero + " é divisível por 3.");
            }
            i++;
//            O que faz: Incrementa a variável i em 1, para passar para o próximo elemento do array.
//            Importância: Sem esse incremento, o laço seria infinito,
//            pois i nunca mudaria e a condição i < numeros.length continuaria verdadeira.

        }
        System.out.println("Fim.");
    }
}
