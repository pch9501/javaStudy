/*		�������
 * 
 * 
 * 		1. if ~ else
 * 			 ������ �Ѱ� �Է¹޾Ƽ� ¦��/Ȧ��
 * 		2. ������ ���ĺ��� �޾Ƽ� �빮�� / �ҹ���(if ~ else)
 * 		ex)	char a='A'
 * 		3. ���� 3���� �Է¹޾Ƽ� 
 * 			��� = 90�� �̻� 'A'
 * 				 80�� �̻� 'B'
 * 				 70�� �̻� 'C'
 * 				 60�� �̻� 'D'
 * 				       ���ϴ� 'F'
 */

package ������;

import java.util.Scanner;

public class practice1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1��
		Scanner scan=new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���: ");
//		int num = scan.nextInt();
//		
//		if(num%2==0)
//		{
//			System.out.println(num+"��(��) ¦��");
//		}
//		else
//		{
//			System.out.println(num+"��(��) Ȧ��");
//		}
//		
//		// 2��
//		
//		char a = 'B';
//		
//		if (a>='A' && a<='Z')
//		{
//			System.out.println(a+"�� �빮��");
//		}
//		if (a>='a' && a<='z')
//		{
//			System.out.println(a+"�� �ҹ���");
//		}
			
		//3��
		
		System.out.print("���� ������ �Է��ϼ���: ");
		int kor = scan.nextInt();
		
		System.out.print("���� ������ �Է��ϼ���: ");
		int eng = scan.nextInt();
		
		System.out.print("���� ������ �Է��ϼ���: ");
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
