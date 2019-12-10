import java.util.Scanner;

/*
 * 		혼자 해볼것!!!
 * 
 * 		while(true) = for(;;) 둘 다 무한루프
 * 
 * 		반복문을 제어
 * 			continue => 특정내용을 제외
 * 			break => 반복문을 종료
 */
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자 입력해: ");
		int num = scan.nextInt();
		
		int sum=0,even=0,odd=0;
		int i=1;
		while(i<=num)
		{
			sum+=i;
			if(i%2==0)
			{
				even+=i;
			}
			else
			{
				odd+=i;
			}
			i++;
		}
		System.out.println("총합: "+sum);
		System.out.println("짝수 합: "+even);
		System.out.println("홀수 합: "+odd);
	}

}
