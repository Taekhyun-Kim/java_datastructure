package Section2;
import java.io.File;
import java.io.FileNotFoundException;
//input.txt라는 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 출력한다.
import java.util.Scanner;

public class Code19 {
	public static void main(String[] args) {
		
		String[] name = new String[1000];
		String[] number = new String[1000];
		int n = 0; //n은 사람 수 
		
		try {
			Scanner inFile = new Scanner( new File("input.txt") );
			
			while( inFile.hasNext() ) {//detect End of File 더 읽을게 남아있으면 true, 없으면 false를 리턴
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(9);
		}
		for(int i=0; i<n; i++)
			System.out.println(name[i] + ": " + number[i]);
	}
}
