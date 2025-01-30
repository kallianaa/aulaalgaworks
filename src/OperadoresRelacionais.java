
public class OperadoresRelacionais {

    public static void main(String[] args) {
        boolean tresMaiorQueDois = 3 > 2;
        System.out.println("3 > 2? " + tresMaiorQueDois);

        boolean tresMenorQueDois = 3 < 2;
        System.out.println("3 < 2? " + tresMenorQueDois);

        boolean tresMaiorQueTres = 3 > 3;
        System.out.println("3 > 3? " + tresMaiorQueTres);

        boolean tresMaiorOuIgualATres = 3 >= 3;
        System.out.println("3 >= 3? " + tresMaiorOuIgualATres);

        boolean tresMenorOuIgualATres = 3 <= 3;
        System.out.println("3 <= 3? " + tresMenorOuIgualATres);

        boolean doisIgualADois = 2 == 2;
        System.out.println("2 == 2? " + doisIgualADois);

        boolean doisDiferenteDeDois = 2 != 2;
        System.out.println("2 != 2? " + doisDiferenteDeDois);

        int quatro = 4;
        boolean quatroMaiorQueQuatro = quatro > quatro;
        System.out.println("quatro > quatro? " + quatroMaiorQueQuatro);

        boolean quatroMaiorOuIgualAQuatro = quatro >= quatro;
        System.out.println("quatro >= quatro? " + quatroMaiorOuIgualAQuatro);

        Integer cinco = 5;
        boolean cincoIgualACinco = cinco.equals(cinco);
        System.out.println("cinco.equals(cinco)? " + cincoIgualACinco);

        Integer seis = 6;
        boolean cincoIgualASeis = cinco.equals(seis);
        System.out.println("cinco.equals(seis)? " + cincoIgualASeis);

        Integer centoVinteOito = 128;
        Integer centoVinteOito02 = 128;
        boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
        System.out.println("centoVinteOito.equals(centoVinteOito02)? " + centoVinteOitoIgualCentoVinteOito);

//         Notas importantes de se lembrar sobre o operador "==":
//            * O Java só consegue comparar os tipos normais, através do operador "==", com números que
//        	estão no intervalo de "-128" até "127". Fora desse intervalo, o operador "==" pode causar muita
//          confusão quando utilizado com os tipos normais. Utilizado juntamente com os primitivos (que,
//          nesse caso, seria o "int" ao invés de "Integer") o operador "==" funciona para qualquer número.
//            * Caso você utilize a mesma variável, o operador "==" vai funcionar até para os tipos
//          normais. Isso porque o valor de uma variável sempre será igual a ele mesmo. Repare que, em nosso
//          exemplo, utilizamos duas variáveis com o mesmo valor, pois, isso é o que acontece no "mundo real".


        boolean centoVinteOitoIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02;
        System.out.println("centoVinteOito == centoVinteOito02? " + centoVinteOitoIgualCentoVinteOito02);
    }
}
