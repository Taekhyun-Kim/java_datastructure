package Section2;
// 1부터 100000사이의 소수를 찾아 출력한다
public class Code17 {
	public static void main(String[] args) {
		for (int n=2; n<=100000; n++) {
			if(isPrime(n))
				System.out.println(n);
		}
	}

	static boolean isPrime(int k) {
		if (k<2) 
			return false;
		for (int i=2; i*i<=k; i++) {


			if(k % i == 0)
				return false;
		}
		return true; //for문이 끝났다는건 한 번도 나누어 떨어지지 않았다는 뜻. 이 자리까지 왔다는 것 자체로 약수가 없는 소수라는 뜻.

	}
}
