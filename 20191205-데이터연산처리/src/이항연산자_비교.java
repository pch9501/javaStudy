/*
 * 	�� ǥ��
 * 	char => ''
 * 	int => 10(10����), 010(8����), 0x12(16����), 0b1010101(2����)
 * 	long => 10l , 10L
 * 	float => 10.5f, 10.5F
 * 	double => 10.5, 10.5d or 10.5D
 * 	boolean => true or false
 * 	String => ""
 * 
 * 	�񱳿����� -> �����(boolean) : true, false
 * 		1. == ���� / ex) 6==7 (false), 6==6(true)
 * 		2. != �����ʴ�. / ex) 6!=7(true), 6!=6(false)
 * 		3. >,< ũ��, �۴�  / ex) 6>5 (true), 5<6(true)
 * 		4. >=,<= ũ�ų�����, �۰ų����� / ex) 6>=6(true), 7<=7(true)
 * 		if,while,for ���� �ַ� ��� / if = ���ǹ�, while, for = �ݺ��� 
 * 
 */
import java.util.Scanner; // util�ڿ� *�̿��� ���� �ҷ�����.
public class ���׿�����_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * boolean b1= 10==11; System.out.println(b1);
		 * 
		 * b1=10!=11; System.out.println(b1);
		 * 
		 * b1=10<11; System.out.println(b1);
		 * 
		 * b1=10>11; System.out.println(b1); // char => ��翬�꿡�� ������ ���� b1=65<='A'; //
		 * 65<=65; System.out.println(b1);
		 * 
		 * b1=65>='B'; System.out.println(b1);
		 * 
		 * System.out.println((int)'A'); // 65 System.out.println((int)'0'); // 48
		 * System.out.println((int)'a'); // 97
		 */		
		
		Scanner scan = new Scanner(System.in);
		// new = �޸𸮿� ������ ���ش�, ������ => �ʱⰪ �ο�
		/*
		 * 		scan.nextInt() = int
		 * 		scan.nextDouble() = double
		 * 		scan.next() = String
		 * 		scan.nextBoolean() = boolean
		 * 		���� �͵��� ���ֻ���Ѵ� char�� ����.
		 */
		int num1, num2;
		System.out.print("ù��° ���� �Է�: ");
		// �Է� ��, enter�� ġ�� �װ��� num1�� �ȴ�.
		num1=scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�: ");
		num2=scan.nextInt();
		
		int result=num1<num2?num2:num1; // �̰� ���׿������̴�. ����ǥ�ڰ� Ʈ��,�ݷеڴ� ����
		System.out.println("ū����"+result+"�Դϴ�.");
	}

}
