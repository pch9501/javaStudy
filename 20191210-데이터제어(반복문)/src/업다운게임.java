import java.util.Scanner;

/*
 * 		��ǻ�� = 1~100������ ������ ���� ����
 * 
 * 		��Ʈ = UP / DOWN
 * 
 */
public class ���ٿ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int com = (int)(Math.random()*100)+1;
		while(true) //  �̰��� ���ѷ��� ����Ѵ�.
		{
			System.out.print("1~100������ ���� �Է�: ");
			int user = scan.nextInt();
			// ����ó���ϱ�.
			if(user<1 || user>100)
			{
				System.out.println("�߸� ��.");
				continue; // while ���ǽ����� �̵�
			}
			// ó������
			if(com>user)
			{
				System.out.println("�Է°����� ū ���� �Է��ض�");
			}
			else if (com<user)
			{
				System.out.println("�Է°����� ���� ���� �Է��ض�");
			}
			else
			{
				System.out.println("Game Over b");
				break; // break�� continue �Ʒ����� ������ ������ �ȵ� / break�� main�� �����Ŵ.
//				System.exit(0); /�������� ��Ű��
			}
		}
		

	}

}
