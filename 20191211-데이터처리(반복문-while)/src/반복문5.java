/*
 * 			String ������. ���� ���õȰ� ����.
 * 			length�� ���ڿ� ����? charAt�� ������ ���°ž�
 * 
 */
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaalkawnwklnwaaawknwlaaanlkaaaa";
		System.out.println("s="+s);
		
		int i = 0;
		int count = 0;
		while(i<s.length())
		{
			System.out.println((i+1)+"��° ����"+s.charAt(i));
			char c= s.charAt(i);
			if(c=='a' || c=='A')
				count++;
			i++;
		}
		System.out.println("a�� ����: "+count);
	}

}
