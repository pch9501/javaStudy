import java.util.Scanner;

/*
 * 		♠	♥	♣	◆	♠	♥	♣	◆	♠	♥	♣	◆
 * 
 * 
 * 		UP DOWN GAME!
 * 		1. 난수 발생
 * 		2. 사용자 입력
 * 		3. 난수와 사용자를 비교
 * 		4. 힌트?
 * 		5. 종료여부 확인
 * 
 * 		1 ~ 100까지의 합 / 출력
 */
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i =1;i<=4;i++) { System.out.print("♠ ♥ ♣ ◆  "); }
		 */
		Scanner scan=new Scanner(System.in);
		
		int com = ((int)(Math.random()*100)+1); // 0.0 ~ 0.99/		
		while(true)
		{
			System.out.print("1 ~ 100 사이의 숫자를 입력하세요: ");
			int user = scan.nextInt();
			
			if (user>com)
				System.out.println("Down");
			else if (user<com)
				System.out.println("Up");
			else
			{
				System.out.println("정답");
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
