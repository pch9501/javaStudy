import java.util.Scanner;

/*
 * 		5개의 정수를 받아서 최대값과 최소값을 출력
 * 		
 * 		1) 변수 책정.
 * 
 * 		2)
 * 
 * 		3)
 */
public class 배열9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] total=new int[5];
		Scanner scan=new Scanner(System.in);
		// 값 입력
		for(int i=0;i<total.length;i++)
		{
			System.out.print("입력: ");
			total[i]=scan.nextInt();
		}
		
		int max=total[0];
		int min=total[0];
		
		
		//처리
		for(int i:total)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		
		for(int i:total)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println(max);
		System.out.println(min);
	}

}
