import java.util.*; // Scanner
/*
 * 		�ڹ� = Ŭ���� ��� , C = �Լ� ���
 */
public class ���׿�����_���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a =(int)(Math.random()*100)+1; //���� : Math.random() = 0.0 ~ 0.99
		 * System.out.println(a);
		 * 
		 * Scanner scan=new Scanner(System.in); // System.in = Ű������ �Է°��� �޴´�.
		 * System.out.print("���� �Է� : "); int b=scan.nextInt();
		 * System.out.println("b="+b);
		 */
//		���� ����
		int kor,eng,math,total;
		double avg;
//		�Է��Ҽ��ִ� ����� Ŭ������ ��������
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ���� : ");
		kor=scan.nextInt();
		
		System.out.print("���� ���� : ");
		eng=scan.nextInt();
		
		System.out.print("���� ���� : ");
		math=scan.nextInt();
		
		total=kor+eng+math;
		
		avg = total/3.0;
		
		System.out.println("�������� : "+kor);
		System.out.println("�������� : "+eng);
		System.out.println("�������� : "+math);
		System.out.println("���� : "+total);
		System.out.printf("���:%.2f",avg);
	}

}
