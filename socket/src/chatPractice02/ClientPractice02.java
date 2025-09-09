package chatPractice02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientPractice02 {
	public static void main(String[] args) {
//		클라이언트 소켓
		Socket client = null;
//		서버에서 받을 메세지
		BufferedReader bufferedReader = null;
//		서버에 보낼 메세지
		BufferedWriter bufferedWriter = null;
//		입력을 받을 인풋
		Scanner sc = new Scanner(System.in);
		
//		서버에 연결할 ip 포트번호
//		try catch 강제
		try {
			client = new Socket("localhost", 7777);
			
			bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			while(true) {
//				클라에서 서버로 보내기
				System.out.println("서버로 보낼 메세지");
				String clMsg = sc.nextLine();
				
				bufferedWriter.write(clMsg + "\n");
				bufferedWriter.flush();
				
				String svMsg = bufferedReader.readLine();
				System.out.println("서버에서 보낸 메세지 : " + svMsg);
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			열려있는 steram 닫기
			try {
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
