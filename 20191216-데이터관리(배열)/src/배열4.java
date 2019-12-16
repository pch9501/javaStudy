import java.util.Scanner;

/*
 * 	년도 월을 입력받아 월의 마지막날은 며칠인지
 * 	배열 => 일괄처리가 가능
 * 
 */
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month; // int[] data=new int[2]
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력: ");
		year=scan.nextInt();
		
		System.out.print("월 입력: ");
		month=scan.nextInt();

		int lastDay=0;
		switch(month)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay=30;
			break;
		case 2:
			if((year%4==0 && year%100!=0)||(year%400==0))
				lastDay=29;
			else
				lastDay=28;
			break;
		default:
			lastDay=31;
		}
		System.out.println(month+"월달의 마지막 날은 "+lastDay);
	}

}
