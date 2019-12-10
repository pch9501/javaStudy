import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("년도를 입력해라: ");
		int year = scan.nextInt();
		
//		if((year%4==0 && year%100!=0) || year%400==0)
//			System.out.println("윤년");
//		if(!((year%4==0 && year%100!=0) || year%400==0))
//			System.out.println("평년");
		String result = ((year%4==0 && year%100!=0) || year%400==0)?"윤년":"평년";
		
		System.out.println(result);

	}

}
