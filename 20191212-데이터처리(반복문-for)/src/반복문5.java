import java.util.Scanner;
/*
 * 
 * 			�����ض�
 * 
 * 		���ĺ� �빮�� �Է¹޾�
 * 			DDD => AAA
 * 			ZZZ => WWW
 */
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�빮�� �Է�: ");
		String data = scan.next();
		
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			
			System.out.print((char)(c-3));
		}
		
		
	}

}
