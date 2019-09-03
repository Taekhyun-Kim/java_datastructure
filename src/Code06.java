
public class Code06 {
	public static void main(String[] args) {
		int [] grades = new int[5]; // in C, #define MAX 5
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
			//초기화		//검사할 조건		//실행
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Grade " +(i+1)+": "+grades[i]);
		//grades.length(배열의 크기), C언어 for문하고 동일하다	
		}
	}

}
