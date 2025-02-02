import java.util.Scanner;

//Crie um sistema onde o usuário vai cadastrar, utilizando o console,
// as 5 tarefas mais importantes do dia dele. Armazene cada uma dessas tarefas em um vetor e,
// no final, imprima as tarefas novamente.


public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[5];

       System.out.println("Cadastre aqui as 5 tarefas do seu dia: ");
//        Lê as tarefas diretamente no array utilizando um laço
        for (int i = 0; i < tarefas.length; i++) {
            System.out.print("Tarefa " + (i + 1) + ": ");
            tarefas[i] = scanner.nextLine();
        }

        System.out.println("\nSuas tarefas do dia foram:");
//         Exibe todas as tarefas cadastradas
        for (int i = 0; i < tarefas.length; i++) {
            System.out.println((i + 1) + " - " + tarefas[i]);
        }

        scanner.close();
    }
}
