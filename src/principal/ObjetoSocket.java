package principal;

import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class ObjetoSocket {

    public static void main(String[] args) throws IOException {
    
        Socket socket = new Socket("localhost", 1245);
        OutputStream DadosDeSaida = socket.getOutputStream();
        ObjectOutputStream Saida = new ObjectOutputStream(DadosDeSaida);
        System.out.println("Cliente Iniciou");
        
        int Escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção "
                + "\n 1 para Ler  Objeto "
                + "\n ou a"
                + "\n 2 Para Sair"));
        
        switch (Escolha) {
            case 1:
                Cliente cliente = new Cliente();
                cliente.leitura();
                Saida.writeObject(cliente);
                break;
            default:
                throw new AssertionError();
        }
        
    }

}
