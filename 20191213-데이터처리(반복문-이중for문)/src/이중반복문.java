/*
 * 		����
 *
 * 		for(�ʱⰪ;���ǽ�;������)		=> 1�� for��
 * 		{
 * 			for(�ʱⰪ;���ǽ�;������)	=> 2�� for��
 * 				{
 * 					���๮��(2�� for)
 * 				}
 * 				���๮��(1�� for)
 * 		}
 * 
 * 			*****		*			
 * 			*****		**			
 * 			*****		***			
 * 			*****		****		
 * 			*****		*****		
 * 		���� ��纰�� ����غ��� //����
 * 	  i=1 j=5 k=0		j+k=5	k=5-j, j=5-k // i+j=6 , j=6-i
 * 		2	4	1
 * 		3	3	2
 * 		4	2	3
 * 		5	1	4
 * 
 */
public class ���߹ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
		
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
