import java.util.Scanner;

/*
 * 		구구단
 * 		dan을 입력을 받아서
 * 
 *		mvnrepository.com 외부오픈소스 
 */
public class 반복문8 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int dan= 2;
		
		int i=1;
		while(i<=9)
		{
			System.out.printf("%2d *%2d = %2d\n",dan,i,dan*i);
			i++;
		}
	}

}
