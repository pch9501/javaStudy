/*
 * 		조건문 : true/false일 때 별도로 자리를 따로 한다.
 *			형식)
 *				if(조건문)
 *					실행문장 => 조건문이 true
 *				else
 *					실행문장 => 조건문이 flase
 *
 *				ex) 사용자가 두개의 정수입력 / 처리(나누기)
 *
 */
public class 선택조건문_형식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10, b=2;
//		System.out.println((a/b));
		if(b==0)
			System.out.println("0으로 나눌 수 없음");
		else
			System.out.println((a/b));
	}

}
