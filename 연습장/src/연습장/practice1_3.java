/*		복습요망
 * 
 * 
 * 		1. if ~ else
 * 			 정수를 한개 입력받아서 짝수/홀수
 * 		2. 임의의 알파벳을 받아서 대문자 / 소문자(if ~ else)
 * 		ex)	char a='A'
 * 		3. 정수 3개를 입력받아서 
 * 			평균 = 90점 이상 'A'
 * 				 80점 이상 'B'
 * 				 70점 이상 'C'
 * 				 60점 이상 'D'
 * 				       이하는 'F'
 */

package 연습장;

import java.util.Scanner;

public class practice1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번
		Scanner scan=new Scanner(System.in);
//		System.out.print("정수를 입력하세요: ");
//		int num = scan.nextInt();
//		
//		if(num%2==0)
//		{
//			System.out.println(num+"는(은) 짝수");
//		}
//		else
//		{
//			System.out.println(num+"는(은) 홀수");
//		}
//		
//		// 2번
//		
//		char a = 'B';
//		
//		if (a>='A' && a<='Z')
//		{
//			System.out.println(a+"는 대문자");
//		}
//		if (a>='a' && a<='z')
//		{
//			System.out.println(a+"는 소문자");
//		}
			
		//3번
		
		System.out.print("국어 점수를 입력하세요: ");
		int kor = scan.nextInt();
		
		System.out.print("영어 점수를 입력하세요: ");
		int eng = scan.nextInt();
		
		System.out.print("수학 점수를 입력하세요: ");
		int math = scan.nextInt();
		
		int avg = (kor+eng+math)/3;
		
		int res = avg/10;
		
		if(res==10 || res==9)
			System.out.println("A");
		if(res==8)
			System.out.println("B");
		if(res==7)
			System.out.println("c");
		if(res==6)
			System.out.println("d");
		if(res<6)
			System.out.println("f");
		
	}

}
