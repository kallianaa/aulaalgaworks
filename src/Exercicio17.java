
//Os quatro primeiros vetores estão guardando o faturamento diário de cada semana e o último vetor,
// que é de 2 dimensões, guarda o faturamento mensal separado por semanas.
//
//Crie um algoritmo que encontre qual a semana teve o maior faturamento.
// No final mostre qual foi essa semana e de quanto foi esse faturamento.

public class Exercicio17 {

    public static void main(String[] args) {

        double[] semanaUm = new double[]{1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0};
        double[] semanaDois = new double[]{1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0};
        double[] semanaTres = new double[]{1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0};
        double[] semanaQuatro = new double[]{2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0};

        double[][] mes = new double[][]{semanaUm, semanaDois, semanaTres, semanaQuatro};

        double maiorFaturamento = 0.0; //guarda o maior valor de faturamento semanal encontrado até o momento.
        Integer semanaGanhadora = null; //rmazenará o número da semana (de 1 a 4) que apresentou esse maior faturamento.

//        Loop Externo (for com índice i): percorre cada semana do mês.
//        mes.length retorna 4, pois temos 4 semanas.

        for (int i = 0; i < mes.length; i++) {
            double[] semana = mes[i]; //Atribui à variável semana o array correspondente à semana atual.

            double faturamentoSemana = 0.0; //Inicializa faturamentoSemana com 0.0, que servirá para somar o faturamento de cada dia da semana.

            for (int y = 0; y < semana.length; y++) { //Percorre cada dia da semana (cada elemento do array semana).
                // Em cada iteração, soma o valor do dia ao faturamentoSemana.
                faturamentoSemana += semana[y];
            }

//            Cria uma variável booleana esseFaturamentoEOMaior que verifica se o faturamentoSemana é maior que o maiorFaturamento atual.
            boolean esseFaturamentoEOMaior = faturamentoSemana > maiorFaturamento;
//            Se for verdadeiro, atualiza maiorFaturamento com o faturamento da semana atual e define semanaGanhadora como i + 1.
//            (A soma de 1 é feita para que a contagem das semanas comece em 1, e não em 0.)

            if (esseFaturamentoEOMaior) {
                maiorFaturamento = faturamentoSemana;
                semanaGanhadora = i + 1; // Estou somando com um, pois, não quero mostrar de 0 a 3 e sim de 1 a 4.
            }
        }

        System.out.println("A semana " + semanaGanhadora + " teve o maior faturamento que foi de R$ " + maiorFaturamento + ".");
    }

}
