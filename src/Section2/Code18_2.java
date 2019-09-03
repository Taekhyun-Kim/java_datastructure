package Section2;

import java.util.Scanner;

//사용자로부터 n개의 정수를 입력받은 후 오름차순으로 정렬(Sort)하여 출력하는 코드이다.
public class Code18_2 {
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
					// swap data[j] and data[j+1]
					// swap함수를 만들어서 
					swap(data[j], data[j+1]);

				}
			}
		}
	}
	static void swap(int a, int b)
	{
		int tmp = a;
		a = b;
		b = tmp;
	}
}
//actual parameter: data[j], data[j+1]/ formal parameter: a, b
//값에 의한 호출: 함수를 호출할 때 호출문에 있는 actual parameter와 formal parameter는 별개의 변수이다. 메모리에서 전혀 다른 자리를 차지하는 변수. 호출문(메서드가)이 실행되는 순간 actual parameter의 값이 formal parameter에 복사된다. 그 뿐이다.
//따라서 a와 b의 값을 변경하여도 data[j]와 data[j+1]의 값은 변하지 않는다.
//참조에 의한 호출: 변수의 값은 같으나 변수의 이름이 2개. 이 경우에는 swap메서드가 정상적으로 작동할 것이다. 
//프리미티브 타입의 매개변수는 호출된 메서드에서 값을 변경하더라도 호출한 쪽에 영향을 주지 못한다. 값에 의한 호출 이기 때문이다.하지만 배열은 그렇지 않다.