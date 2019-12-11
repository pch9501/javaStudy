/*
 * 		다중조건문 : 여러개의 조건을 제시하고 해당 조건 1개만 수행이 되게 만든다
 * 		1) 형식
 * 			if(조건문)
 * 				실행문장1 => true / 실행문장1을 수행 후 종료
 * 						=> false / 다음 조건문으로 이동
 * 			else if(조건문)
 * 				실행문장2
 * 			else if(조건문)
 * 				실행문장3
 * 			else
 * 				실행문장4 => 해당조건이 없는 경우에 처리 (생략 가능)
 */
//			성적처리
//			3개의 점수를 받아서 총점, 평균, 학점을 출력
import java.util.Scanner;
public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
//		new : 메모리 할당 / Scanner(System.in) : 변수에 대한 초기화 (생성자)
//		클래스란, 사용자정의 데이터형 (변수 + 메소드)
//		(System.in)은 스태틱, 따로 지정하지않아도 어떤 클래스에서도 불러올수있음
		
		int kor,eng,math,total,temp; // temp는 임시변수?
		double avg;
		char score;
		
		System.out.print("국어점수 입력: ");
		kor = scan.nextInt();
		System.out.print("영어점수 입력: ");
		eng = scan.nextInt();
		System.out.print("수학점수 입력: ");
		math = scan.nextInt();
		//총점
		total = kor+eng+math;
		//평균
		avg = total/3.0;
		
		temp = (int)avg; // = total/3;
		//학점
		
		if(temp>=90)
			score = 'A';
		else if (temp>=80)
			score = 'B';
		else if (temp>=70)
			score = 'C';
		else if (temp>=60)
			score = 'D';
		else
			score = 'F';
		
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f\n",avg);
		System.out.println("학점: "+score);
		
	}

}
