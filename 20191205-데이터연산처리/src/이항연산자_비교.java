/*
 * 	값 표현
 * 	char => ''
 * 	int => 10(10진법), 010(8진법), 0x12(16진법), 0b1010101(2진법)
 * 	long => 10l , 10L
 * 	float => 10.5f, 10.5F
 * 	double => 10.5, 10.5d or 10.5D
 * 	boolean => true or false
 * 	String => ""
 * 
 * 	비교연산자 -> 결과값(boolean) : true, false
 * 		1. == 같다 / ex) 6==7 (false), 6==6(true)
 * 		2. != 같지않다. / ex) 6!=7(true), 6!=6(false)
 * 		3. >,< 크다, 작다  / ex) 6>5 (true), 5<6(true)
 * 		4. >=,<= 크거나같다, 작거나같다 / ex) 6>=6(true), 7<=7(true)
 * 		if,while,for 에서 주로 사용 / if = 조건문, while, for = 반복문 
 * 
 */
import java.util.Scanner; // util뒤에 *이오면 전부 불러오기.
public class 이항연산자_비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * boolean b1= 10==11; System.out.println(b1);
		 * 
		 * b1=10!=11; System.out.println(b1);
		 * 
		 * b1=10<11; System.out.println(b1);
		 * 
		 * b1=10>11; System.out.println(b1); // char => 모든연산에서 정수로 변경 b1=65<='A'; //
		 * 65<=65; System.out.println(b1);
		 * 
		 * b1=65>='B'; System.out.println(b1);
		 * 
		 * System.out.println((int)'A'); // 65 System.out.println((int)'0'); // 48
		 * System.out.println((int)'a'); // 97
		 */		
		
		Scanner scan = new Scanner(System.in);
		// new = 메모리에 저장을 해준다, 생성자 => 초기값 부여
		/*
		 * 		scan.nextInt() = int
		 * 		scan.nextDouble() = double
		 * 		scan.next() = String
		 * 		scan.nextBoolean() = boolean
		 * 		위의 것들을 자주사용한다 char는 없음.
		 */
		int num1, num2;
		System.out.print("첫번째 정수 입력: ");
		// 입력 후, enter를 치면 그값이 num1이 된다.
		num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		num2=scan.nextInt();
		
		int result=num1<num2?num2:num1; // 이게 삼항연산자이다. 물음표뒤가 트루,콜론뒤는 폴스
		System.out.println("큰값은"+result+"입니다.");
	}

}
