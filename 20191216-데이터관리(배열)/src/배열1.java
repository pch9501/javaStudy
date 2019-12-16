/*
 * 		배열(Array)
 * 		1. 같은 데이터를 여러개 모아서 한 개의 변수며으로 제어
 * 		2. 배열 선언시에 자동으로 연속적인 메모리를 생성
 * 
 * 							=> 시작과 끝이 일관적으로 정해져있다.
 * 							=> 0 ~ 배열의 개수(반복문 조절이 가능)
 * 		3. 단점 : 고정적
 * 		4. 사용처 : 관련된 데이터가 3개이상일 때
 * 		5. 사용
 * 			1. 선언
 * 				데이터형[] 배열명; // 자바에서의 권장사항
 * 				데이터형 배열명[]; // C/C++언어에서 주로 사용
 * 				ex)
 * 					정수
 * 					int[] arr; => int arr[] 도 사용가능
 * 					실수
 * 					double[] arr;
 * 					문자
 * 					char[] arr;
 * 					문자열
 * 					String[] arr;
 * 
 * 			2. 초기값 설정
 * 				int a; a+=10; => 에러 // 초기값을 설정하지않았기 때문
 * 
 * 				int[] arr={10,20,30,40,50} => 자동으로 배열개수 => 5
 *					arr[0] arr[1] arr[2] arr[3] arr[4]
 *					↑
 *					일반변수와 동일하게 사용가능
 *					ex) 값 변경할 경우 => arr[0]=100;
 *
 * 				주소를 참조해서 데잍를 관리(배열, 클래스) = 참조변수
 * 
 * 				int[] arr=new int[5];
 * 
 * 				new = 메모리 할당 // int[5] = 정수5개를 저장할 수 있는 공간을 만들어라.
 * 											(연속적인 메모리 구조를 만드다.)
 * 
 * 				double[] arr=new double[3]; 0.0
 * 				String[] arr=new String[3]; null(실제 존재하지않는 값)
 * 				char[] arr=new char[3]; '\0'
 * 				boolean[] arr=new boolean[3]; false
 * 
 * 			3. 활용
 * 				=> 값을 변경
 * 					첨자를 이용 => arr[1]=100, arr[4]=200...
 * 
 * 				=> 출력 => 배열의 모든 첨자는 0부터 시작 =>
 * 							for(int i=0...)
 * 
 * 			4. 초과하거나 줄일 수 없다 => 에러
 * 				ArrayIndexOfBoundsException => 배열의 범위가 초과
 * 			5. 배열의 갯수 => 배열명.length
 */
//			정수를 3개입력 => 입력받은 데이터를 출력
import java.util.Scanner;
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		// 변수를 처리하기전에 값을 채우면 오류가 나지않는다.
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하라: ");
		a=scan.nextInt();
		
		System.out.print("두번째 정수를 입력하라: ");
		b=scan.nextInt();
		
		System.out.print("세번째 정수를 입력하라: ");
		c=scan.nextInt();
		
		//제어 => a,b,c중 가장 큰 수를 출력
		int max=0;
		if(a>max)
			max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		System.out.println("가장 큰 값: "+max);
	}

}
