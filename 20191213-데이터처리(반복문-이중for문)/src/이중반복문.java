/*
 * 		형식
 *
 * 		for(초기값;조건식;증감식)		=> 1차 for문
 * 		{
 * 			for(초기값;조건식;증감식)	=> 2차 for문
 * 				{
 * 					실행문장(2차 for)
 * 				}
 * 				실행문장(1차 for)
 * 		}
 * 
 * 			*****		*			
 * 			*****		**			
 * 			*****		***			
 * 			*****		****		
 * 			*****		*****		
 * 		별을 모양별로 출력해보자 //복습
 * 	  i=1 j=5 k=0		j+k=5	k=5-j, j=5-k // i+j=6 , j=6-i
 * 		2	4	1
 * 		3	3	2
 * 		4	2	3
 * 		5	1	4
 * 
 */
public class 이중반복문 {

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
