/*
 * 		�迭(Array)
 * 		1. ���� �����͸� ������ ��Ƽ� �� ���� ���������� ����
 * 		2. �迭 ����ÿ� �ڵ����� �������� �޸𸮸� ����
 * 
 * 							=> ���۰� ���� �ϰ������� �������ִ�.
 * 							=> 0 ~ �迭�� ����(�ݺ��� ������ ����)
 * 		3. ���� : ������
 * 		4. ���ó : ���õ� �����Ͱ� 3���̻��� ��
 * 		5. ���
 * 			1. ����
 * 				��������[] �迭��; // �ڹٿ����� �������
 * 				�������� �迭��[]; // C/C++���� �ַ� ���
 * 				ex)
 * 					����
 * 					int[] arr; => int arr[] �� ��밡��
 * 					�Ǽ�
 * 					double[] arr;
 * 					����
 * 					char[] arr;
 * 					���ڿ�
 * 					String[] arr;
 * 
 * 			2. �ʱⰪ ����
 * 				int a; a+=10; => ���� // �ʱⰪ�� ���������ʾұ� ����
 * 
 * 				int[] arr={10,20,30,40,50} => �ڵ����� �迭���� => 5
 *					arr[0] arr[1] arr[2] arr[3] arr[4]
 *					��
 *					�Ϲݺ����� �����ϰ� ��밡��
 *					ex) �� ������ ��� => arr[0]=100;
 *
 * 				�ּҸ� �����ؼ� ���渦 ����(�迭, Ŭ����) = ��������
 * 
 * 				int[] arr=new int[5];
 * 
 * 				new = �޸� �Ҵ� // int[5] = ����5���� ������ �� �ִ� ������ ������.
 * 											(�������� �޸� ������ �����.)
 * 
 * 				double[] arr=new double[3]; 0.0
 * 				String[] arr=new String[3]; null(���� ���������ʴ� ��)
 * 				char[] arr=new char[3]; '\0'
 * 				boolean[] arr=new boolean[3]; false
 * 
 * 			3. Ȱ��
 * 				=> ���� ����
 * 					÷�ڸ� �̿� => arr[1]=100, arr[4]=200...
 * 
 * 				=> ��� => �迭�� ��� ÷�ڴ� 0���� ���� =>
 * 							for(int i=0...)
 * 
 * 			4. �ʰ��ϰų� ���� �� ���� => ����
 * 				ArrayIndexOfBoundsException => �迭�� ������ �ʰ�
 * 			5. �迭�� ���� => �迭��.length
 */
//			������ 3���Է� => �Է¹��� �����͸� ���
import java.util.Scanner;
public class �迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		// ������ ó���ϱ����� ���� ä��� ������ �����ʴ´�.
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��϶�: ");
		a=scan.nextInt();
		
		System.out.print("�ι�° ������ �Է��϶�: ");
		b=scan.nextInt();
		
		System.out.print("����° ������ �Է��϶�: ");
		c=scan.nextInt();
		
		//���� => a,b,c�� ���� ū ���� ���
		int max=0;
		if(a>max)
			max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		System.out.println("���� ū ��: "+max);
	}

}
