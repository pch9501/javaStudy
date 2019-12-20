/*
 * 정수 1개를 입력받아서 2진법으로 출력하기
 * 
 * ex) 10 => 16bit / 0000 0000 0000 1010
 * 
 */
import java.util.Scanner;
public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//변수
		int input=0; // 사용자가 입력한 값을 받는 변수
		System.out.print("정수 입력: ");
		input=scan.nextInt();
		System.out.println(Integer.toBinaryString(input));
		int[] binary = new int[16];
		// 배열의 위치
		int index=15; // 배열 => 값을 변경 => 위치(맨 뒤(length-1), 맨 앞(0))
		
		while(true) // 매개변수(입력값)이 매번 다르기때문에 반복문 횟수가 지정되어있지않다.
		{
			binary[index]=input%2;
			input = input/2; // == input/=2 같은의미.
			
			if(input==0)
				break;
			
			index--;
		}
		
		// 출력
		
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			
			System.out.print(binary[i]);
		}
		
		
	}

}
