/*
 * 		���ǹ�
 * 		 = ���� ���ǹ�
 * 			1) ����
 * 			   if(���ǹ�)
 * 				   ���๮��
 * 
 * 			   if(���ǹ�) => 1���̻��� ���๮���� �ִ°��
 * 				{
 * 				���๮��1
 * 				���๮��2
 * 				}
 * 
 * 			   if(���ǹ�)
 * 				 ���๮��1 => if�Ҽӹ���
 * 				 ���๮��2 => if�� ���þ��� ���� (���ǿ� ������� ó���ȴ�.)
 * 
 * 			 2) ���ǹ� ó�����
 * 				true/false => ����,��,�� ������
 * 
 *  		 3) ���� => ������ true�� ��, ���� ����
 *  				     ������ false�� ��, ���� ������������
 *  		
 * 			�ڹٿ��� ������ ������ �κ�
 * 
 * 			1. import : ���̺귯�� Ŭ������ �ҷ��� �� ���.
 * 						java.lang�� ���°͵��� ��������
 * 						java.lang���� ��ǥ������ System,String,Math�� �ִ�.
 * 			2. return : ��� �޼ҵ�� return�� �������ִ�.
 * 			3. ��� : ��� Ŭ����(���������)�� Object���
 * 			4. ����ó�� : ��� Ŭ������ ����ó���� �������ִ�.
 * 						����ó����, ���������Ḧ �����ϰ� ������¸� ����
 * 								 (�̸� ������ �����ϴ� ���α׷�)
 *  
 */
import java.util.Scanner;
// import�� �̹� ������� Ŭ������ �ҷ��� �� ����Ѵ�.
// CBD => Component Based Development
public class ���_���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		//�Էµ� ���� ����
		int num = scan.nextInt();
		// ¦������ or Ȧ������
		if(num%2==0)
		
			System.out.println(num+"��(��) ¦���Դϴ�.");
		
		if(num%2!=0) // num%2==1 �� ����
		
			System.out.println(num+"��(��) Ȧ���Դϴ�.");
		
		
	}

}
