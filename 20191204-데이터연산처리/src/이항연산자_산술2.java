import java.util.*; // Scanner
/*
 * 		자바 = 클래스 기반 , C = 함수 기반
 */
public class 이항연산자_산술2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a =(int)(Math.random()*100)+1; //난수 : Math.random() = 0.0 ~ 0.99
		 * System.out.println(a);
		 * 
		 * Scanner scan=new Scanner(System.in); // System.in = 키보드의 입력값을 받는다.
		 * System.out.print("정수 입력 : "); int b=scan.nextInt();
		 * System.out.println("b="+b);
		 */
//		변수 선언
		int kor,eng,math,total;
		double avg;
//		입력할수있는 기능의 클래스를 가져오기
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수 : ");
		kor=scan.nextInt();
		
		System.out.print("영어 점수 : ");
		eng=scan.nextInt();
		
		System.out.print("수학 점수 : ");
		math=scan.nextInt();
		
		total=kor+eng+math;
		
		avg = total/3.0;
		
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+total);
		System.out.printf("평균:%.2f",avg);
	}

}
