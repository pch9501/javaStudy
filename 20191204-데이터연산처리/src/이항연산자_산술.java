/*
 * 
 */
public class 이항연산자_산술 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		byte c = 20;
		int d = b+c; // 그래도 바이트로 받고싶다면,
		byte d1 =(byte)(b+c);// 이렇게표현
		System.out.println(d1);
		byte b1 = (byte)127;
		System.out.println(b1);
		System.out.println("오"+55); // byte < short,char < int < long < float < double < String
		
		int a = 10 + 20*3;
		System.out.println(a);
	}

}
