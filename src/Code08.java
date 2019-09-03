import java.util.Scanner;

public class Code08 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[]data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close(); //여기까지 배열을 입력받는 코드
		
		int sum = 0, max = data[0]; //max = 0으로 할 경우 음수로 배열을 만들 때 논리적 오류가 생긴다.
		for(int i=0; i<n; i++) {
			sum += data[i]; // sum = sum + data[i]
			if(data[i]>max) max = data[i]; //max를 구하는 과정. [2, 4, 5, 3, 2]일 경우  초기 max값은 2 차례대로 비교 후 5가 max에 저장됨.
			
		}
		System.out.println("The sum is " + sum + " and the maximum is " + max);
	}

}
//사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여 출력하는 코드