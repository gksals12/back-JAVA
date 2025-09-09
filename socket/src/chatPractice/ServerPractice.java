package chatPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPractice {
	public static void main(String[] args) {
//		sever socket
		ServerSocket serverSocket = null;
//		client socket
		Socket socket = null;
//		클라에서 보낸 메세지
		BufferedReader bufferedReader = null;
//		서버에서 보낸 메세지
		BufferedWriter bufferedWriter = null;
//		보낼때 필요한 인풋
		Scanner sc = new Scanner(System.in);
		
//		server socket에 포트 번호 지정하기
//		try catch 강제
		try {
			serverSocket = new ServerSocket(7777);
//			포트번호 지정함과 동시에 서버 시작
			System.out.println("서버가 시작되었습니다. 클라이언트 연결 대기중...");
			
//			클라가 같은 주소 포트번호로 들어왔으면 바로 바인드
			socket = serverSocket.accept();
			System.out.println("클라이언트가 연결되었습니다");
			
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String clientMsg = bufferedReader.readLine();
				String serverMsg = sc.nextLine();
				
				System.out.println("클라이언트가 보낸 메세지 : " + clientMsg);
				System.out.println("클라이언트로 보낼 메세지 : ");
				bufferedWriter.write(serverMsg + "\n");
				bufferedWriter.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			열린 stream 다 닫기
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
