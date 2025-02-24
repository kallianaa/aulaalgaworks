package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

    public static void main(String[] args) throws EmailException {
        Carteiro.enviar("seu-email@outlook.com",
                "Envio de email teste",
                "Se estiver vendo esse email é porque o nosso envio funcionou!");

        System.out.println("Fim...");
    }
}