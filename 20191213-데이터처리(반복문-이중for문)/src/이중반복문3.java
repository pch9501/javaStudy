/*
 * 		continue: Ư���κ��� ������ ��
 * 		break: �ݺ��� �ߴ��� ��
 * 
 * 		ex)  for(int i=1;i<=10;i++)
 * 			 {
 * 				if(i==5)
 * 				  break;				// i�� 5�� ��, ���̻� ���������ʰ� for���� �����. 
 * 				System.out.println(i);	// ����� 1���� 5����
 * 			 }
 * 
 * 
 * 			 for(int i=1;i<=10;i++)
 * 			 {
 * 				if(i==5)
 * 				  continue;				// i�� 5�� ��, ���������ʰ� ���������� �ö󰣴�.
 * 				System.out.println(i);	// ����� 5�� ������ 1���� 10����
 * 			 }
 * 
 * 
 */
public class ���߹ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=1;i<=10;i++)
			{
				if(i==5)
					break;
				System.out.println(i);
			}
			System.out.println("===== contiune ======");
			
			for(int i=1;i<=10;i++)
			{
				if(i%2!=0)
					continue;
				System.out.println(i);
			}
	}

}
