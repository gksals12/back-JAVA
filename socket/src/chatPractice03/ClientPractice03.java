package chatPractice03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientPractice03 {
	public static void main(String[] args) {
//		클라소켓
		Socket client = null;
//		서버에서 클라
		BufferedReader bufferedReader = null;
//		클라에서 서버
		BufferedWriter bufferedWriter = null;
//		인풋
		Scanner sc = new Scanner(System.in);
		
//		ip 포트번호 지정
		try {
			client = new Socket("localhost", 7777);
			
			bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			while(true) {
//				클라에서 서버로 보내기
				System.out.println("클라에서 서버로 보내기");
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
//			stream 닫기
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
