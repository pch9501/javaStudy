/*
 * 	배열 => 여러데이터를 한 개의 이름으로 제어 => 인덱스(첨자)를 이용한다
 * 			** 인덱스는 0부터 시작
 * 
 * 	1) 형식
 * 		1. 선언
 * 			데이터형[] 배열명
 * 			= 기본타입(int, long, float, double...)
 * 				int[] arr
 * 				long[] arr
 * 				char[] arr
 * 			= 사용자정의 타입(클래스)
 * 				class Movie
 * 				Movie[] arr
 * 				String[] names
 * 				스트링도 사용자정의 클래스! 다!
 * 
 * 		2. 초기값
 * 			=> arr={1,2,3,4,5,6}
 * 			=> arr=new int[6] => 자체 초기값(int:0, long:0L, String:null)
 * 				null = 메모리에 저장된 주소값이 존재하지않는다.
 * 		3. 데이터 읽기
 * 			= arr[index number] => 갯수보다 하나가 적다.
 * 		4. 데이터 저장
 * 			= arr[1]=10;
 * 
 * 			숫자야구게임 만들기
 * 			Strike Ball?
 * 			=> 난수 => 729
 * 			=> 사용자입력 => 567 => 0S-1B
 * 					  => 785 => 1S-0B
 * 					  => 793 => 1S-1B
 * 						 279 => 1S-2B
 * 						 729 => 3S-0B => break;
 */
import java.util.Scanner;
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		중복없는 난수 발생 / 사용자가 입력 / 힌트 / 종료여부 확인 / 3S가 나오면 종료
		int[] com=new int[3];
		int su=0; // 난수발생시 저장
		boolean bCheck=false; //중복여부를 확인
		
		for(int i=0;i<com.length;i++)
		{
			bCheck=true;
			//==========
			while(bCheck)
			{
				// 난수 발생
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				// 중복여부 확인
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
				
			}
			//==========
			com[i]=su;
		}
		int[] user=new int[3];
		
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("3자리 정수 입력: ");
			// 값을 받는다.
			int input=scan.nextInt();
			// 오류처리.
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}
			
			// 배열의 값을 변경 // 백의자리, 십의자리, 일의자리 구하기.
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 오류처리 => 중복된 숫자 사용불가, 0을 사용할 수 없다.
			// 유효성 검사
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			if (user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없는 숫자입니다.");
				continue;
			}
			// 비교시작
			int s=0, b=0;
			for(int  i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			// 힌트
			System.out.printf("Input Number: %d, Result: %dS-%dB\n",input,s,b);
			System.out.println("==============");
			System.out.print("S: ");
			for(int i=0;i<s;i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB: ");
			for(int i=0;i<b;i++)
			{
				System.out.print("○");
			}
			System.out.println("\n==============");
			// 종료여부 확인
			if(s==3)
			{
				System.out.println("Game Over");
				break;
			}
		}
	}

}
