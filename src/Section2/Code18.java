package Section2;

import java.util.Scanner;

//사용자로부터 n개의 정수를 입력받은 후 오름차순으로 정렬(Sort)하여 출력하는 코드이다.
public class Code18 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		bubbleSort(n, data);//값을 return하지 않기 때문에 따로 변수에 저장할 필요가 없다.
		

		
		System.out.println("Sorted data: ");
		for(int i=0; i<n; i++)
			System.out.println(data[i]);
	}
	
	static void bubbleSort( int n, int [] data ) //void >> 아무것도 return하지 않는다.
	{
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if (data[j] > data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
					
				}
			}
		}
	}
}
