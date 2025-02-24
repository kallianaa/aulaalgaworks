package leituraarquivos;

// exercicio de leitura de arquivos algaworks

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraListaTarefas {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\Kalliana\\OneDrive\\Área de Trabalho\\algaworks\\listaTarefas.txt"); //fica aqui o caminho da pasta

        List<String> linhas = Files.readAllLines(arquivo);

        System.out.println("Tomara que esteja pronta para mais um dia!");
        for(int i = 0; i < linhas.size(); i++) {
            String tarefas = linhas.get(i);

            System.out.println("Tarefas " + i + ": " + tarefas);
        }
        System.out.println("Parabéns por mais um dia!");
    }

    static List<String> lerDoArquivo(String arquivo) throws IOException {
        Path path = Paths.get(arquivo);
        return Files.readAllLines(path);
    }
}