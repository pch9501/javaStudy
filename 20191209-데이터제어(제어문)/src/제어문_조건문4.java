import java.util.Scanner;
public class ���_���ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("�⵵�� �Է��ض�: ");
		int year = scan.nextInt();
		
//		if((year%4==0 && year%100!=0) || year%400==0)
//			System.out.println("����");
//		if(!((year%4==0 && year%100!=0) || year%400==0))
//			System.out.println("���");
		String result = ((year%4==0 && year%100!=0) || year%400==0)?"����":"���";
		
		System.out.println(result);

	}

}
