package java0731;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:/Temp/text/file2.txt");
		
		char[] buf = new char[100];
		int readNum = reader.read(buf);
		if(readNum != -1) { // End Of File이 아니면 반복문 실행
			for (char ch : buf) {
				System.out.print(ch);
			}
			System.out.println();
		}
		reader.close();
		
	}

}
// p.634 Reader