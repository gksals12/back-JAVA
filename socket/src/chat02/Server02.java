package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) {
//		서버 소켓
		ServerSocket serverSocket = null;
//		클라이언트 소켓
		Socket socket = null;
//		입력값
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다. 연결 대기중...");
			
			socket = serverSocket.accept();
			System.out.println("연결되었습니다");
			
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inMsg = bufferedReader.readLine();
				System.out.println("클라이언트가 보낸 메세지: " + inMsg);
				System.out.println("클라이언트로 메세지 전송: ");
				String outMsg = sc.nextLine();
				bufferedWriter.write(outMsg + "\n");
				bufferedWriter.flush();
			}
			
			
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
				if(bufferedReader != null) {
					bufferedReader.close();
				}
				if(bufferedWriter != null) {
					bufferedWriter.close();
				}
				if(sc != null) {
					sc.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
