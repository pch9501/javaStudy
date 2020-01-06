package 연습장;

import java.util.Scanner;

/*
 * 		정수 두개와 연산자를 받아서 사칙연산
 * 		첫번째 정수 입력 : 10
 * 		두번째 정수 입력 : 20
 * 		연산자 입력: +
 * 
 * 		결과값
 * 		=> 10+20=30
 * 
 */
public class practice1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int first = scan.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int second = scan.nextInt();
		
		System.out.print("연산자 입력: ");
		String op = scan.next();
		char c = op.charAt(0);
		
		if (c=='+') 
		{
			System.out.println(first+"+"+second+"="+(first + second));
		}
		if (c=='-') 
		{
			System.out.println(first+"-"+second+"="+(first - second));
		}
		if (c=='*') 
		{
			System.out.println(first+"*"+second+"="+(first * second));
		}
		if (c=='/') 
		{
			System.out.println(first+"/"+second+"="+(first / second));
		}
			
	}

}
