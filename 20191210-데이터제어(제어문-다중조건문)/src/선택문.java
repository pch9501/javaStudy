import java.util.Scanner;

/*
 * 		���ù� : �� ���� ���� �޾Ƽ� ó�� (�� ���� ���� => break)
 * 				����, ��Ʈ��ũ���� ���� ���?
 * 		����)
 * 			switch(��) => ����, ����, ���ڿ�
 * 			{
 * 				case 1:
 * 				 ó��
 * 				case 2:
 * 				 ó��
 * 				case 3:
 * 				 ó��
 * 				default:
 * 				 ó��
 * 			}
 * 				default�� �������� (if ���ǹ��� else�� ���)
 * 
 * 
 * 
 * 
 */
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° ����: ");
		int num2 = scan.nextInt();
		
		System.out.print("������(+,-,*,/): ");
		String op = scan.next();
		
		// switch �� ���� int, char, String ����!
		
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
			System.out.println("�߸��� �������Դϴ�.");
		}
	}

}
