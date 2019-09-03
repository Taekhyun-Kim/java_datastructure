
public class Code05 {
	
	public static void main(String[] args) {
		// in C, int grades[5];
		
		//declare the array
		int [] grades; //int는 배열의 타입 grades는 배열의 이름 
		//자바에서 배열을 만들려면 배열 이름을 생성
		//실제로 배열이 만들어지는 건 밑에 라인을 통해서...
		//allocate memory for 5 indices
		grades = new int[5];
		
//		double[] array;
//		array = new double [100]; 이 부분을 깜빡하지 말 것! 
		
//		char [] word;
//		word = new char [20]; 
		//char [] word = new char [20]; 이렇게도 쓸 수 있음 
		
		//assign some values to the array
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		//print out each value
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
		
	}

}


//동일한 타입의 데이터를 한 번에 여러개를 저장할 수 있는 특별한 형태의 변수를 배열이라 부른다.