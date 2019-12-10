/*
 *  변수가 여러개일 때, 
 *  
 *  int a,b,c; 가능 / int a=10,b=12,c=39; 와 같이 설정가능.
 *  a=b=c=100; 도 가능 / 단, 데이터형이 같아야한다.
 *  
 *  변수명에는 의미를 부여해주는것이 좋다. ex) 국어 = kor
 *  
 *  
 */
public class 일주차정리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=10, eng=32, math=33;
		
		
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		String first_name = "홍"; // firstName으로 쓰는것이 암묵적이다.
		String last_name = "길동"; // lastName (헝거리언식 표현이라고 함.)
		System.out.println("이름 : "+first_name+last_name);
//		문자열 결합
		
		/*
		 *  대개, 1. 클래스명 = 대문자로 시작.
		 *  	 2. 메소드, 변수명 = 소문자로 시작.
		 *  	 3. 상수 = 전체 대문자를 사용
		 *  	 4. 들여쓰기?
		 *  
		 */
	}

}
