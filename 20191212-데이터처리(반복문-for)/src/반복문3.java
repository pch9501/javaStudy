import java.util.Scanner;

/*
 * 		��	��	��	��	��	��	��	��	��	��	��	��
 * 
 * 
 * 		UP DOWN GAME!
 * 		1. ���� �߻�
 * 		2. ����� �Է�
 * 		3. ������ ����ڸ� ��
 * 		4. ��Ʈ?
 * 		5. ���Ῡ�� Ȯ��
 * 
 * 		1 ~ 100������ �� / ���
 */
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i =1;i<=4;i++) { System.out.print("�� �� �� ��  "); }
		 */
		Scanner scan=new Scanner(System.in);
		
		int com = ((int)(Math.random()*100)+1); // 0.0 ~ 0.99/		
		while(true)
		{
			System.out.print("1 ~ 100 ������ ���ڸ� �Է��ϼ���: ");
			int user = scan.nextInt();
			
			if (user>com)
				System.out.println("Down");
			else if (user<com)
				System.out.println("Up");
			else
			{
				System.out.println("����");
				break;
			}
		}
		int a= 1,sum=0;
		for(a=1;a<=100;a++)
		{
			sum+=a;
		}
		System.out.println(sum);
	}

}
