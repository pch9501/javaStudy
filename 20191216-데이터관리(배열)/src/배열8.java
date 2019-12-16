/*
 * 		3명의 학생 => 국어,영어,수학 점수를 입력받아서 출력
 * 		ex) 80 80 80 240 80.0 같이
 */
import java.util.Scanner;
public class 배열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3];
		int[] math=new int[3];
		int[] eng=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] grade=new char[3];
		Scanner scan=new Scanner(System.in);
		//점수 입력
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"번째 국어 점수: ");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 영어 점수: ");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 수학 점수: ");
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
