import java.util.Scanner;

/*
 * 		선택문 : 한 개의 값을 받아서 처리 (한 번만 수행 => break)
 * 				게임, 네트워크에서 자주 사용?
 * 		형식)
 * 			switch(값) => 정수, 문자, 문자열
 * 			{
 * 				case 1:
 * 				 처리
 * 				case 2:
 * 				 처리
 * 				case 3:
 * 				 처리
 * 				default:
 * 				 처리
 * 			}
 * 				default는 생략가능 (if 조건문의 else와 비슷)
 * 
 * 
 * 
 * 
 */
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = scan.nextInt();
		
		System.out.print("연산자(+,-,*,/): ");
		String op = scan.next();
		
		// switch 의 값은 int, char, String 가능!
		
		switch(op) 
		{
		case "+":
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			break;
		case "/":
			System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
	}

}
