package chatPractice02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPractice02 {
	public static void main(String[] args) {
//		서버 소켓
		ServerSocket server = null;
//		클라 소켓
		Socket client = null;
//		클라에서 서버로 
		BufferedReader bufferedReader = null;
//		서버에서 클라로
		BufferedWriter bufferedWriter = null;
//		입력 받을 인풋
		Scanner sc = new Scanner(System.in);
		
//		서버 포트 번호 지정
//		try catch 강제
		try {
			server = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다. 클라이언트 기다리는중...");
			
//			클라이언트가 연결 되었을때 바로 바인드
			client = server.accept();
			System.out.println("클라이언트가 연결되었습니다");
			
			bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			while(true) {
//				클라이언트가 보낸 메세지
				String clMsg = bufferedReader.readLine();
				System.out.println("클라이언트가 보낸 메세지 : " + clMsg);
//				클라이언트에 보낼 메세지
				System.out.println("클라이언트로 보낼 메세지 : ");
				String svMsg = sc.nextLine();
				bufferedWriter.write(svMsg + "\n");
				bufferedWriter.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			열린 stream 다 닫기
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
