/*
 * 		1~100������ ��!
 * 		¦�� Ȧ�� �� �� ����غ���
 * 		
 * 		��¹�
 * 		1~100������ ��: ~~
 * 		1~100������ ¦���� ��: ~~~
 * 		1~100������ Ȧ���� ��: ~~~
 * 
 */
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,num1=0,num2=0;
		
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			if(i%2==0)
				num1+=i;
			else
				num2+=i;
		}
		System.out.println(sum);
		System.out.println(num1);
		System.out.println(num2);
	}

}
