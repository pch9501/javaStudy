import java.util.Scanner;

/*
 * 		���������� /  5 / 1�� 3�� 1��
 */
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i=1;
		int win=0, lose=0, same=0;
		while(i<=5)
		{
			// ��ǻ�Ͱ� ������������ ����.
			int com = (int)(Math.random()*3); // 0~2���� ���� / 0.0 ~ 0.99���� �����̱⶧��
			// ����ڰ� �Է��Ѵ�.
			System.out.print("����(0), ����(1), ��(2): ");
			int user = scan.nextInt();
			
			// �� => ��, ��, �а� ����.
			
			int res = com-user;
//			if (res==-1 || res==2)
//			{
//				win++; // ���� ��
//			}
//			else if (res==1 || res==-2)
//			{
//				lose++; // �� ��
//			}
//			else
//			{
//				same++; // ���
//			}
			switch(res)
			{
			case -1:
			case 2:
				win++;
				break;
			case 1:
			case -2:
				lose++;
				break;
			default: same++;
			}
			i++;
		}
		System.out.println("����� ����: "+win+"��"+same+"��"+lose+"��");
	}

}
