package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException, FileNotFoundException{
//		new FileWrite("경로", "이어쓰기 여부");

//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
//		bufferedWriter.write("버퍼로 보내고\n파일로 보내기");
////		bufferedWriter.flush();
//		bufferedWriter.close();
	
		BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
	}
}
