
public class OperadoresIncrementoDecremento {

    public static void main(String[] args) {
		int numero = 10;
		System.out.println("Número antes: " + numero);
        numero++;
		System.out.println("Número depois: " + numero);

//		int numero02 = 10;
//		int numero02 = ++numero; // Primeiro incrementa e depois passa o valor para a variável "numero02"
//		int numero02 = numero++; // Passa o valor para a variável "numero02" e depois incrementa.
//		System.out.println("Número: " + numero + ", " + "Número02: " + numero);

        int numero03 = 10;
        --numero03;
        System.out.println("Número: " + numero03);
    }

}
