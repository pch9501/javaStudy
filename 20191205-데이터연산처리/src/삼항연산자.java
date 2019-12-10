/*
 * 		(조건문?값1:값2) => 웹(React => 삼항연산자)
 * 		조건이 true일 때, 값1을 출력
 * 		조건이 false일 때, 값2를 출력
 * 
 */
import java.util.Scanner;
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in); System.out.print("국어 점수: "); int
		 * kor=scan.nextInt(); System.out.print("영어 점수: "); int eng = scan.nextInt();
		 * System.out.print("수학 점수: "); int math = scan.nextInt();
		 * 
		 * int avg = (kor+eng+math)/3;
		 * 
		 * String result = avg>=60?"Pass":"NonPass"; System.out.println("결과: "+result);
		 */
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.print("나이를 입력하세요. : ");
		 * 
		 * int age=scan.nextInt();
		 * 
		 * String result = age>=15?"영화 관람가능":"영화 관람불가"; System.out.println(result);
		 */
		System.out.print("좌석을 입력하세요(1~5): ");
		
		int seat = scan.nextInt();
		
		String result = seat==3 || seat==5?"예매 가능":"예매 불가능";
		System.out.println(result);
		
		
		
	}

}
