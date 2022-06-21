package com.company.serializacao_de_objetos.enviando_objetos_na_rede;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(3333);
        System.out.println("Agurdando conexão...");
        Socket socket = server.accept();    // Ele para aqui e aguarda conexões
        System.out.println("Conectando a: " + socket.getRemoteSocketAddress());

        InputStream entrada = socket.getInputStream();
        ObjectInputStream objectStream = new ObjectInputStream(entrada);

        Pedido pedido = (Pedido) objectStream.readObject();
        System.out.println("Código: " + pedido.getCodigo());
        System.out.println("Descrição: " + pedido.getDescricao());
        System.out.println("Quantidade: " + pedido.getQuantidade());

        OutputStream saida = socket.getOutputStream();
        DataOutput dataOutPut = new DataOutputStream(saida);
        dataOutPut.writeUTF ("Recebido comsucessao!");

    }
}
