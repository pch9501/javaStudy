/*
 * 		do ~ while
 * 
 * 			형식)
 * 				초기값	/1
 * 				do	
 * 				{
 * 					실행문장	/2
 * 					증감식	/3
 * 				} while(조건문);	/4
 * 
 * 		ex)		int i=1;
 * 				do
 * 				{
 * 					system.out.println(i);
 * 					i++; // i=2
 * 				} while(i<=10);
 * 
 * 
 * 		for
 * 			
 * 			형식)
 * 					  1    2     4
 * 				for(초기값;조건식;증가식)
 * 				{
 * 					실행문장	/3
 * 				}
 * 
 *			ex)
 *				for(int i=1;i<=10;i++)
 *				{
 *					System.out.println(i);
 *				}
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("while");
		
		int i = 1;
		while(i<=10)
		{
			System.out.print(i+"\t");
			if(i%3==0)
				System.out.println();
			i++;
		}
		
		System.out.println("\ndo ~ while");
		
		i=1;
		do
		{
			System.out.print(i+"\t");
			if(i%3==0)
				System.out.println();
			i++;
		}while(i<=10);
		
		System.out.println("\nfor");
		
		for(i=1;i<=10;i++)
		{
			System.out.print(i+"\t");
			if(i%3==0)
				System.out.println();
		}
	}

}
