/*
 * 
 */
public class 단항연산자_부정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck = false;
		System.out.println("변경 전 : "+bCheck);
		bCheck=!bCheck;
		System.out.println("변경 후 : "+bCheck);
		
		int x = 10;
		int y = 9;
		if((x<y) || (++y==x));
		System.out.println(y);
			
		
	}

}
