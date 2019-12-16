import java.util.Scanner;

//	5개의 정수를 입력받아 출력하고, 합과 평균을 출력

public class 배열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[5];
		int total=0;
		double avg;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((i+1)+"번째 숫자를 입력하세요: ");
			arr[i]=scan.nextInt();
		}
		
		for(double score:arr)
		{
			System.out.println(score);
			total+=score;
		}
		avg=total/(double)arr.length;
		
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f\n",avg);
	}

}
