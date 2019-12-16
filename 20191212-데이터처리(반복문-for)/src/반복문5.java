import java.util.Scanner;
/*
 * 
 * 			복습해라
 * 
 * 		알파벳 대문자 입력받아
 * 			DDD => AAA
 * 			ZZZ => WWW
 */
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("대문자 입력: ");
		String data = scan.next();
		
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			
			System.out.print((char)(c-3));
		}
		
		
	}

}
