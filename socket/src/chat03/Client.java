package chat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
//	포트번포 7777
//	192.168.161.18
	public static void main(String[] args) {
		String name = "윤한민";
		String ip = "192.168.161.18";
		
		try (
				Socket socket = new Socket(ip, 7777);
				PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
				BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedReader keyInput = new BufferedReader(new InputStreamReader(System.in));
			){
				System.out.println("서버와 연결 되었습니다");
				ClientThread clientThread = new ClientThread(input);
				clientThread.start();
				
				String msg = null;
				while((msg = keyInput.readLine()) != null) {
					output.println(name + ": " + msg);
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ClientThread extends Thread{
	private BufferedReader input;

	public ClientThread() {;}
	public ClientThread(BufferedReader input) {
		this.input = input;
	}
	
	@Override
	public void run() {
		String msg = null;
		try {
			while((msg = input.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(input != null) {
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
