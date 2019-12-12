import java.util.Scanner;

/*
 * 		가위바위보 /  5 / 1승 3패 1무
 */
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i=1;
		int win=0, lose=0, same=0;
		while(i<=5)
		{
			// 컴퓨터가 가위바위보를 낸다.
			int com = (int)(Math.random()*3); // 0~2까지 나옴 / 0.0 ~ 0.99까지 난수이기때문
			// 사용자가 입력한다.
			System.out.print("가위(0), 바위(1), 보(2): ");
			int user = scan.nextInt();
			
			// 비교 => 승, 무, 패가 나옴.
			
			int res = com-user;
//			if (res==-1 || res==2)
//			{
//				win++; // 유저 승
//			}
//			else if (res==1 || res==-2)
//			{
//				lose++; // 컴 승
//			}
//			else
//			{
//				same++; // 비김
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
		System.out.println("사용자 전적: "+win+"승"+same+"무"+lose+"패");
	}

}
