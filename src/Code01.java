
public class Code01 {
	
	static int num; //함수 밖에서 변수 선언 당분간 static으로 선언
	
	public static void main(String[] args) {
		int anotherNum = 5; //함수 안에서 변수 선언 static이 아니다.
		num = 2;
		
		System.out.println(num + anotherNum);
		System.out.println("Num:  " + num);
		System.out.println("AnotherNum: " + anotherNum);
		System.out.println("Sum : " + num + anotherNum); //left associativity 덧셈이 연속해서 나오면 왼쪽꺼부터. 
		System.out.println("Sum : " + (num + anotherNum)); //Sum: 7
		
		
	}
}