/*
 * 		3���� �л� => ����,����,���� ������ �Է¹޾Ƽ� ���
 * 		ex) 80 80 80 240 80.0 ����
 */
import java.util.Scanner;
public class �迭8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3];
		int[] math=new int[3];
		int[] eng=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] grade=new char[3];
		Scanner scan=new Scanner(System.in);
		//���� �Է�
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"��° ���� ����: ");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"��° ���� ����: ");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"��° ���� ����: ");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			switch((int)avg[i]/10)
			{
			case 10:
			case 9:
				grade[i]='A';
				break;
			case 8:
				grade[i]='B';
				break;
			case 7:
				grade[i]='C';
				break;
			case 6:
				grade[i]='D';
				break;
			default:
				grade[i]='F';
			}
				
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println(kor[i]+" "+eng[i]+" "+math[i]+" "+total[i]+" "+avg[i]+" "+grade[i]);
		}
		
	}

}
