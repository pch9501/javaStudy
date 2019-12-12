import java.util.Scanner;

/*
 * 		두개의 정수를 입력받아
 */
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,i=1;
		
		do 
		{
			if(i==1)
			{
				System.out.print("첫번째 정수: ");
				num1=scan.nextInt();
			}
			else
			{
				System.out.print("두번째 정수: ");
				num2=scan.nextInt();
			}
			i++;
		}while(i<3);
		
		System.out.println("최대값: "+(num1>num2?num1:num2)+", 최소값: "+(num1>num2?num2:num1));
		System.out.println((Math.max(num1, num2))+"\t"+(Math.min(num1, num2)));

		
	}

}
