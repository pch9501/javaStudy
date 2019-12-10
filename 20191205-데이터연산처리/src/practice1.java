import java.util.*;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = Integer.toBinaryString(10); // °ıÈ£¾ÈÀÇ°ÍÀ» 2Áø¹ıÇØÁÜ!
		System.out.println(a1);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("¼ö ÀÔ·Â : ");
		
		int a = scan.nextInt();
		
		if(a%2!=0) {
			System.out.println("¿ÀÀ×");
		}
		else {
			System.out.println("¶ì¿ë");
		}
	}

}
