import java.util.Scanner;

// 정수 2개를 입력받기, 연산자 1개, 사칙연산
// 자바는 입력받는경우에 char(캐릭터)로 받을수없다! 무조건 String!!
/*
 * String 은 equals로 같은지 알수있다!!
 */
public class 다중조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1=new String("Hello");
//		String s2=new String("Hello");
//		
//		if(s1.equals(s2))
//			System.out.println("s1==s2");
//		else
//			System.out.println("s1!=s2");  String에서 equals 활용법
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = scan.nextInt();
		
		System.out.print("연산자(+,-,*,/): ");
		String op = scan.next();
		
		if(op.equals("+"))
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if (op.equals("-"))
		{
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		else if (op.equals("*"))
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if (op.equals("/"))
		{
			if(num2==0)
				System.out.println("0으로는 못 나눔.");
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
		}
		else
		{
			System.out.println("잘못된 연산자입니다.");
		}
		
	}

}
