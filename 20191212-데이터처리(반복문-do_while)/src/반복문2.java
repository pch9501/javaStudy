import java.util.Scanner;

/*
 * 		1) 3���� �л��� ���� ���� ���� ���� �Է¹޾�
 * 			���, ����, ������ ���
 * 			����, ����, ����, ����, ���, ����
 * 			80 / 240 / 80 / 'B'
 * 			70 / 210 / 70 / 'C'
 * 			90 / 270 / 90 / 'A'
 */
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int kor,eng,math,total,avg;
		String result="";
		int i=0;
		do {
			System.out.print("���� ����: ");
			kor=scan.nextInt();
			System.out.print("���� ����: ");
			math=scan.nextInt();
			System.out.print("���� ����: ");
			eng=scan.nextInt();
			
			total = kor+eng+math;
			
			avg = total/3;
			
			char c ='A';
			switch(avg/10) 
			{
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
			}
			result+=kor+"  "+eng+"  "+math+"  "+total+"  "+avg+"  "+c+"\n";
			
			i++;
		}while(i<3);
		
		System.out.println("����  ����  ����  ����  ���  ����");
		System.out.println(result);
	}

}
