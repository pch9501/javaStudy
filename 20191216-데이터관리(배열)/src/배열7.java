import java.util.Scanner;

//	5���� ������ �Է¹޾� ����ϰ�, �հ� ����� ���

public class �迭7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[5];
		int total=0;
		double avg;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ���: ");
			arr[i]=scan.nextInt();
		}
		
		for(double score:arr)
		{
			System.out.println(score);
			total+=score;
		}
		avg=total/(double)arr.length;
		
		System.out.println("����: "+total);
		System.out.printf("���: %.2f\n",avg);
	}

}
