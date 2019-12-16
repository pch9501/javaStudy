/*
 * 		continue: 특정부분을 제외할 때
 * 		break: 반복을 중단할 때
 * 
 * 		ex)  for(int i=1;i<=10;i++)
 * 			 {
 * 				if(i==5)
 * 				  break;				// i는 5일 때, 더이상 실행하지않고 for문을 벗어난다. 
 * 				System.out.println(i);	// 결과는 1부터 5까지
 * 			 }
 * 
 * 
 * 			 for(int i=1;i<=10;i++)
 * 			 {
 * 				if(i==5)
 * 				  continue;				// i는 5일 때, 실행하지않고 증감식으로 올라간다.
 * 				System.out.println(i);	// 결과는 5를 제외한 1부터 10까지
 * 			 }
 * 
 * 
 */
public class 이중반복문3 {

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
