import java.util.Scanner;

/*
 * 		컴퓨터 = 1~100사이의 임의의 수를 추출
 * 
 * 		힌트 = UP / DOWN
 * 
 */
public class 업다운게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int com = (int)(Math.random()*100)+1;
		while(true) //  이것을 무한루프 라고한다.
		{
			System.out.print("1~100사이의 정수 입력: ");
			int user = scan.nextInt();
			// 오류처리하기.
			if(user<1 || user>100)
			{
				System.out.println("잘못 씀.");
				continue; // while 조건식으로 이동
			}
			// 처리과정
			if(com>user)
			{
				System.out.println("입력값보다 큰 수를 입력해라");
			}
			else if (com<user)
			{
				System.out.println("입력값보다 작은 수를 입력해라");
			}
			else
			{
				System.out.println("Game Over b");
				break; // break와 continue 아래에는 문장이 있으면 안돼 / break는 main을 종료시킴.
//				System.exit(0); /강제종료 시키는
			}
		}
		

	}

}
