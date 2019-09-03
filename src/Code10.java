
public class Code10 {
	public static void main(String[] args) {

		for (int n=2; n<= 100000; n++) {

			// 2, 3, ..., sqrt(n) = root(n) 
			// n의 약수 중에 root(n)보다 더 큰 게 있다면, 반드시 root(n)보다 작은 약수도 존재하게 된다.

			boolean isPrime = true;
			
			for (int i=2; i*i <= n && isPrime; i++) //&& isPrime이 false면 바로 빠져나옴
				if ( n % i == 0)
					// not prime
					isPrime = false;


			if (isPrime)
				System.out.println(n);
		}

	}
}
// 1~100000 사이의 모든 소수들을 찾아서 출력하는 프로그램이다.
// 각각의 정수 n에 대해서 for문을 돌면서 2보다 크거나 같은 약수가 있는지 검사한다.
//하나라도 약수가 있다면 이미 소수가 아니므로 더이상 검사할 필요가 없다. 변수 isPrime이
//어떤 역할을 하는지 잘 생각해봐라.