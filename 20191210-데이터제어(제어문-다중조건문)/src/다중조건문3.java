import java.util.Scanner;

// ���� 2���� �Է¹ޱ�, ������ 1��, ��Ģ����
// �ڹٴ� �Է¹޴°�쿡 char(ĳ����)�� ����������! ������ String!!
/*
 * String �� equals�� ������ �˼��ִ�!!
 */
public class �������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1=new String("Hello");
//		String s2=new String("Hello");
//		
//		if(s1.equals(s2))
//			System.out.println("s1==s2");
//		else
//			System.out.println("s1!=s2");  String���� equals Ȱ���
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° ����: ");
		int num2 = scan.nextInt();
		
		System.out.print("������(+,-,*,/): ");
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
				System.out.println("0���δ� �� ����.");
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
		}
		else
		{
			System.out.println("�߸��� �������Դϴ�.");
		}
		
	}

}
