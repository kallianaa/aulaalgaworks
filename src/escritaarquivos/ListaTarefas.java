package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<String>();

        String stop = "";
        int i = 0;
        while (!stop.equals("X")) {
            System.out.println("Faça sua lista de tarefas e quando quiser sair, digite X!");
            System.out.print("Tarefa " + i + ": ");
            String tarefas = scanner.nextLine();

            linhas.add(tarefas);

            System.out.println("Quer adicionar outra atividade? [S - CONTINUAR / X - PARAR]");
            stop = scanner.nextLine();
            i++;
        }

        Path arquivo = Paths.get("C:\\Users\\....\\algaworks\\listaTarefas.txt"); //fica aqui o caminho da pasta
        Files.write(arquivo, linhas);
        System.out.println("Arquivo criado com sucesso!");
        scanner.close();
    }
}
