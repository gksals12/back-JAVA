package chatPractice04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPractice04 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		Scanner input = new Scanner(System.in);
		
		try {
			server = new ServerSocket(7777);
			System.out.println("Server open...waiting for client");
			
			client = server.accept();
			System.out.println("Client connected");
			
			bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

			while(true) {
				String clMSg = bufferedReader.readLine();
				System.out.println("Client : " + clMSg);
				
				System.out.println("Server : ");
				String svMsg = input.nextLine();
				bufferedWriter.write(svMsg + "\n");
				bufferedWriter.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
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
				if(input != null) {
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
