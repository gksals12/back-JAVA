package chat01;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) {
//		포트번포 1100
//		192.168.161.18
		Socket socket = null;
		PrintWriter writer = null;
		
		String serverIp = "192.168.161.18";
		String msg = null;
		try {
			socket = new Socket(serverIp, 1100);
			System.out.println("서버에 연결 되었습니다");
			writer = new PrintWriter(socket.getOutputStream(), true);
			msg = "클라이언트가 보내는 메세지";
			writer.println(msg);
			System.out.println("서버로 [" + msg + "]를 전송했습니다");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(writer != null) {
				writer.close();
			}
			if(socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
