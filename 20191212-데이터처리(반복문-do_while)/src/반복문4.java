import java.util.Scanner;

/*
 * 		�ΰ��� ������ �Է¹޾�
 */
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,i=1;
		
		do 
		{
			if(i==1)
			{
				System.out.print("ù��° ����: ");
				num1=scan.nextInt();
			}
			else
			{
				System.out.print("�ι�° ����: ");
				num2=scan.nextInt();
			}
			i++;
		}while(i<3);
		
		System.out.println("�ִ밪: "+(num1>num2?num1:num2)+", �ּҰ�: "+(num1>num2?num2:num1));
		System.out.println((Math.max(num1, num2))+"\t"+(Math.min(num1, num2)));

		
	}

}
