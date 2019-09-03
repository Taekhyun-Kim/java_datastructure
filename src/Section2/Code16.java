package Section2;

import java.util.Scanner;

//입력으로 두 정수 a,b를 받아 a의 b승을 계산한다. 이 때 b는 음이 아닌 정수(0포함)
public class Code16 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int result = power(a, b);
		
		System.out.println(result);
		kb.close();
	}

	static int power( int n, int m )
	{
		int prod = 1;
		for (int i=0; i<m; i++)
			prod = prod * n;
		
		return prod;
	}
	
}
