package Section2;
import java.io.File;
import java.io.FileNotFoundException;
//input.txt라는 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 출력한다.
import java.util.Scanner;

public class Code20 {
	static String[] name = new String[1000];
	static String[] number = new String[1000];
	static int n = 0; //n은 사람 수 
	
	public static void main(String[] args) {	
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
		
		bubbleSort();
		
		
		for(int i=0; i<n; i++)
			System.out.println(name[i] + ": " + number[i]);
	}
	
	static void bubbleSort() {
		for (int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) { //name[j]가 name[j+1]보다 큰 지(사전식 순서로 더 뒤쪽인지)가 궁금하면 compareTo가 return값이 0보다 큰 지 검사하면됨.
				if(name[j].compareTo(name[j+1]) > 0) {//str1.equals(str2) str1 == str2로 하면 안된다.
					//swap name[j] and name[j+1]
					String tmp = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
					
					//이름이 자리를 바꿨으니 번호도...
					tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;

				}
			}
		}
	}
}


