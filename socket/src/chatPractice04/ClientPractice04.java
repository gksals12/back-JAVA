package chatPractice04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientPractice04 {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		Scanner input = new Scanner(System.in);
		
		try {
			client = new Socket("localhost", 7777);
			
			bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

			while(true) {
				System.out.println("Client : ");
				String clMSg = input.nextLine();
				bufferedWriter.write(clMSg + "\n");
				bufferedWriter.flush();
				
				String svMsg = bufferedReader.readLine();
				System.out.println("Server : " + svMsg);
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
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
				if(input != null) {
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
