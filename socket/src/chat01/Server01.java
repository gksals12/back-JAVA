package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
//		서버 소켓
		ServerSocket serverSocket = null;
//		클라이언트 소켓
		Socket socket = null;
//		클라이언트의 입력 스트림을 읽기 위한 BufferedReader
		BufferedReader reader = null;
//		메세지
		String msg = null;
		
		try {
			serverSocket = new ServerSocket(1100);
			System.out.println("서버가 시작되었습니다. 클라이언트 기다리는중...");
//			요청이 들어오면 수락하는거
			socket = serverSocket.accept();
			System.out.println("클라이언트가 연결되었습니다");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			msg = reader.readLine();
			
			System.out.println("클라이언트로부터 받은 메세지: ");
			System.out.println(msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
