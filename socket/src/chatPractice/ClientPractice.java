package chatPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientPractice {
	public static void main(String[] args) {
//		client socket
		Socket clientSocket = null;
//		서버에서 보낸 메세지
		BufferedReader bufferedReader = null;
//		서버로 보낼 메세지
		BufferedWriter bufferedWriter = null;
//		입력할 인풋
		Scanner sc = new Scanner(System.in);
		
//		localhost = 현재 아이피
//		client socket 연결할 아이피 포트번호 입력
//		try catch 강제
		try {
			clientSocket = new Socket("localhost", 7777);
			
			bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			
			while(true) {
				System.out.println("클라이언트에서 서버로 보내기");
				String clientMsg = sc.nextLine();

				bufferedWriter.write(clientMsg + "\n");
				bufferedWriter.flush();
				
				String serverMsg = bufferedReader.readLine();
				System.out.println("서버에서 보낸 메세지 : " + serverMsg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			열린 stream 닫기
			try {
				if(clientSocket != null) {
					clientSocket.close();
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
