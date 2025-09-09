package chatPractice03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPractice03 {
	public static void main(String[] args) {
//		서버소켓
		ServerSocket server = null;
//		클라소켓
		Socket client = null;
//		클라에서 서버
		BufferedReader bufferedReader = null;
//		서버에서 클라
		BufferedWriter bufferedWriter = null;
//		인풋
		Scanner sc = new Scanner(System.in);
		
//		서버포트번호
//		try catch
		try {
			server = new ServerSocket(7777);
			System.out.println("서버가 열렸습니다. 클라이언트 기다리는중...");
//			클라이언트가 ip 포트 번호로 접속시 bind
			client = server.accept();
			
			bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			while(true) {
//				리더로 클라가 보낸 메세지 받기
				String clMsg = bufferedReader.readLine();
				System.out.println("클라이언트가 보낸 메세지: " + clMsg);
				System.out.println("클라이은트로 보낼 메세지: ");
				String svMsg = sc.nextLine();
				bufferedWriter.write(svMsg + "\n");
				bufferedWriter.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			stream 닫기
			try {
				if(server != null) {
					server.close();
				}
				if(client != null) {
					client.close();
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
