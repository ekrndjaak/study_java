package example;

import java.net.ServerSocket;
import java.net.Socket;

public class Chatsever {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            Socket socket = serverSocket.accept();   //클라이언트와 통신하기위한 소켓

            ChatThread chatThread = new ChatThread(socket);
            chatThread.start();
        }
    }
}
class ChatThread extends Thread{
    private  Socket socket;

    public ChatThread(Socket socket){
        this.socket = socket;
    }

    public void run(){
        //1. 소켓으로부터읽어디를 수있는 객체를얻는다.
        //2. 소켓에게 쓰기위한 객체를 얻는다.

        //3. 클라이언트가 보낸메시지를 읽는다.
        //4. 접속된모든 클라이언트에게 메시지를 보낸다.
    }
}