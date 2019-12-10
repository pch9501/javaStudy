/*
 * 		문자열을 정수로 형변환을하고싶다면
 * 		(int)"10" (X) , Integer.parseInt("10") (O)
 * 		정수를 문자열로 형변환을 하고싶다면
 * 		(String)10 (X), String.valueOf(10) (O)
 */
public class 이항연산자_논리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s = String.valueOf(10); System.out.println(s);
		 */
		boolean b1=(6<7) && (7==7);
		System.out.println(b1);
		
		b1=(6>7) &&(7==7);
		System.out.println(b1);
		
		b1=(6>7) || (7==7);
		System.out.println(b1);
		
		b1=(6<7) || (7==7);
		System.out.println(b1);
		b1=(6>7) || (7!=7);
		System.out.println(b1);
		
	}

}
