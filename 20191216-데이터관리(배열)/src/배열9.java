import java.util.Scanner;

/*
 * 		5���� ������ �޾Ƽ� �ִ밪�� �ּҰ��� ���
 * 		
 * 		1) ���� å��.
 * 
 * 		2)
 * 
 * 		3)
 */
public class �迭9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] total=new int[5];
		Scanner scan=new Scanner(System.in);
		// �� �Է�
		for(int i=0;i<total.length;i++)
		{
			System.out.print("�Է�: ");
			total[i]=scan.nextInt();
		}
		
		int max=total[0];
		int min=total[0];
		
		
		//ó��
		for(int i:total)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		
		for(int i:total)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println(max);
		System.out.println(min);
	}

}
