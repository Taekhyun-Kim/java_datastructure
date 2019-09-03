import java.util.Scanner;

public class Code03 {
	public static void main(String[] args) {
		String str = "Hello";
		String input = null; //input 변수를 문자열로 받겠다. 아무것도 써주지 않은 변수의 값은 null로 초기화 해둔다.
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please type a string: ");
		input = kb.next(); // scanf("%s", ...) 하나의 문자열을 저장 next()는 공백을 기준으로 앞에 단어만 받는다.

		if( str.equals(input) ) { //문자열은 프리미티브 타입이 아니다. ==연산자로 동일한지 판단할 수 없다. input.equals(str)도 된다.
			System.out.println("Strings match! :-)");
		} //문자열은 .equals로! ==로 검사하면 안된다.
		else {
			System.out.println("Strings do not match! :-)");
		}
		kb.close();
	}
}

