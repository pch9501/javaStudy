import java.util.Scanner;

/*
 * 	�⵵ ���� �Է¹޾� ���� ���������� ��ĥ����
 * 	�迭 => �ϰ�ó���� ����
 * 
 */
public class �迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month; // int[] data=new int[2]
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�: ");
		year=scan.nextInt();
		
		System.out.print("�� �Է�: ");
		month=scan.nextInt();

		int lastDay=0;
		switch(month)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay=30;
			break;
		case 2:
			if((year%4==0 && year%100!=0)||(year%400==0))
				lastDay=29;
			else
				lastDay=28;
			break;
		default:
			lastDay=31;
		}
		System.out.println(month+"������ ������ ���� "+lastDay);
	}

}
