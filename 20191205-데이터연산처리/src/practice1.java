import java.util.*;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = Integer.toBinaryString(10); // ��ȣ���ǰ��� 2��������!
		System.out.println(a1);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		
		int a = scan.nextInt();
		
		if(a%2!=0) {
			System.out.println("����");
		}
		else {
			System.out.println("���");
		}
	}

}
