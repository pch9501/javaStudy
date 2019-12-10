/*
 * 		조건문
 * 		 = 단일 조건문
 * 			1) 형식
 * 			   if(조건문)
 * 				   실행문장
 * 
 * 			   if(조건문) => 1개이상의 실행문장이 있는경우
 * 				{
 * 				실행문장1
 * 				실행문장2
 * 				}
 * 
 * 			   if(조건문)
 * 				 실행문장1 => if소속문장
 * 				 실행문장2 => if와 관련없는 문장 (조건에 상관없이 처리된다.)
 * 
 * 			 2) 조건문 처리방법
 * 				true/false => 부정,비교,논리 연산자
 * 
 *  		 3) 실행 => 조건이 true일 때, 문장 수행
 *  				     조건이 false일 때, 문장 수행하지않음
 *  		
 * 			자바에서 생략이 가능한 부분
 * 
 * 			1. import : 라이브러리 클래스를 불러올 때 사용.
 * 						java.lang에 들어가는것들은 생략가능
 * 						java.lang에는 대표적으로 System,String,Math가 있다.
 * 			2. return : 모든 메소드는 return을 가지고있다.
 * 			3. 상속 : 모든 클래스(사용자정의)는 Object상속
 * 			4. 예외처리 : 모든 클래스는 예외처리를 가지고있다.
 * 						예외처리란, 비정상종료를 방지하고 정상상태를 유지
 * 								 (미리 에러를 방지하는 프로그램)
 *  
 */
import java.util.Scanner;
// import는 이미 만들어진 클래스를 불러올 때 사용한다.
// CBD => Component Based Development
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력: ");
		//입력된 값을 저장
		int num = scan.nextInt();
		// 짝수조건 or 홀수조건
		if(num%2==0)
		
			System.out.println(num+"는(은) 짝수입니다.");
		
		if(num%2!=0) // num%2==1 도 가능
		
			System.out.println(num+"는(은) 홀수입니다.");
		
		
	}

}
