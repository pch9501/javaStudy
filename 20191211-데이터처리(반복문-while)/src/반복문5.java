/*
 * 			String 변수명. 쓰면 관련된거 나옴.
 * 			length는 문자열 길이? charAt도 저렇게 쓰는거야
 * 
 */
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaalkawnwklnwaaawknwlaaanlkaaaa";
		System.out.println("s="+s);
		
		int i = 0;
		int count = 0;
		while(i<s.length())
		{
			System.out.println((i+1)+"번째 문자"+s.charAt(i));
			char c= s.charAt(i);
			if(c=='a' || c=='A')
				count++;
			i++;
		}
		System.out.println("a의 갯수: "+count);
	}

}
