/*
 * 		(���ǹ�?��1:��2) => ��(React => ���׿�����)
 * 		������ true�� ��, ��1�� ���
 * 		������ false�� ��, ��2�� ���
 * 
 */
import java.util.Scanner;
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in); System.out.print("���� ����: "); int
		 * kor=scan.nextInt(); System.out.print("���� ����: "); int eng = scan.nextInt();
		 * System.out.print("���� ����: "); int math = scan.nextInt();
		 * 
		 * int avg = (kor+eng+math)/3;
		 * 
		 * String result = avg>=60?"Pass":"NonPass"; System.out.println("���: "+result);
		 */
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.print("���̸� �Է��ϼ���. : ");
		 * 
		 * int age=scan.nextInt();
		 * 
		 * String result = age>=15?"��ȭ ��������":"��ȭ �����Ұ�"; System.out.println(result);
		 */
		System.out.print("�¼��� �Է��ϼ���(1~5): ");
		
		int seat = scan.nextInt();
		
		String result = seat==3 || seat==5?"���� ����":"���� �Ұ���";
		System.out.println(result);
		
		
		
	}

}
