/*
 * 		���ڿ��� ������ ����ȯ���ϰ�ʹٸ�
 * 		(int)"10" (X) , Integer.parseInt("10") (O)
 * 		������ ���ڿ��� ����ȯ�� �ϰ�ʹٸ�
 * 		(String)10 (X), String.valueOf(10) (O)
 */
public class ���׿�����_��2 {

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
