package ������;

import java.util.Scanner;

/*
 * 		���� �ΰ��� �����ڸ� �޾Ƽ� ��Ģ����
 * 		ù��° ���� �Է� : 10
 * 		�ι�° ���� �Է� : 20
 * 		������ �Է�: +
 * 
 * 		�����
 * 		=> 10+20=30
 * 
 */
public class practice1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ���� �Է�: ");
		int first = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�: ");
		int second = scan.nextInt();
		
		System.out.print("������ �Է�: ");
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
