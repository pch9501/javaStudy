import java.util.Scanner;

/*
 * 		ȥ�� �غ���!!!
 * 
 * 		while(true) = for(;;) �� �� ���ѷ���
 * 
 * 		�ݺ����� ����
 * 			continue => Ư�������� ����
 * 			break => �ݺ����� ����
 */
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է���: ");
		int num = scan.nextInt();
		
		int sum=0,even=0,odd=0;
		int i=1;
		while(i<=num)
		{
			sum+=i;
			if(i%2==0)
			{
				even+=i;
			}
			else
			{
				odd+=i;
			}
			i++;
		}
		System.out.println("����: "+sum);
		System.out.println("¦�� ��: "+even);
		System.out.println("Ȧ�� ��: "+odd);
	}

}
