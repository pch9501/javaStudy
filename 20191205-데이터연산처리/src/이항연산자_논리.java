/*
 * 		&& ����ó�� = a�� b�� �Ѵ� ���ƾ� true 
 * 		|| ����ó�� = a�� b�� �ϳ��� ���Ƶ� true
 * 
 * 		Ÿ��Ȯ��?
 * 		&& : �����ȿ� �ִ� ��� ���� ��.	
 * 		|| : ���� �ۿ� �ִ� ��� ���� ���.(����ó��)
 * 
 * 		ex) id password
 * 		id=="" && pw==""
 * 		id!="" || pw!=""
 * 
 * 		&&�� ���ǹ� �� ������ false���, �������� ���꿡�� ������.
 * 		||�� ���ǹ� �� ������ true���, �������� ���꿡�� ������.
 * 
 *		
 */
public class ���׿�����_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		
		char result =(c>=65 && c<=90)?(char)(c+32):(char)(c-32);
		System.out.println(c+"��(��)"+result);
		System.out.println((int)'A');
	}

}
