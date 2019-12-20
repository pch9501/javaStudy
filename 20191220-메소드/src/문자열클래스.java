/*
 * String: ���ڿ��� ����
 * 
 *	java.lang => import�� ������ �� �ִ�.
 *	���ڿ��� �����ϴ� ��
 *	1. String ������="Hello Java";
 *	2. String ������=new String("Hello Java");  // ���� ���ڿ�=> ������ ����
 *
 * 	String���� �����ϴ� ���
 * 
 * 	1. equals: ����� ���ڿ��� �������� ���� ����Ȯ�� (true/false)
 * 		ID, PWD => �α��� (��ҹ��� ����)
 * 		���ڿ��� (==)�� ����ϸ� �ȵȴ�.
 * 		
 * 		String s="Hello";
 * 		String s1="Hello";
 * 		String s2=new String("Hello");
 * 		if(s.equals(s1))
 * 
 * 		=> ����
 * 			boolean equals(String data)
 * 
 * 	2. substring: ���ڿ��� �ڸ� ��
 * 			ex)
 * 			String s="0123456789";
 * 			substring(3) => "3456789"
 * 
 * 			String s="112��, 15���̻� ������"
 * 			substring(0,3) => "112" / end-1�� ����? (0,1,2)
 * 		
 * 	3. length: ���ڿ� ����
 * 		String s="Hello ȫ�浿"; // s�� 9����.
 * 
 * 	4. trim: �¿��� ���鹮�� ����
 * 		String s=" Hello Java ";
 * 			=> s.trim.length // trim�� ��,�� ���鸸 ������ִ�. ���ڿ� ���� ������ ���������.
 * 	5. startsWith, endsWith
 * 
 * 
 * 	6. indexOf, lastIndexof
 * 		������ ��ġ(indexOf: �տ���, lastIndexOf: �ڿ���)
 * 		String s="Hello Java";
 * 				  0123456789
 * 		s.indexOf('a') => 7���� ã�ƿ´�(a)
 * 		s.lastIndexOf('a') => 9���� ã�ƿ´�(�� ���� a)
 * 
 * 	7. split
 * 		String s="�̺���, ������, ������, ������, ����";
 * 		String[] names=s.split(",")
 * 		
 * 	8. toUpperCase,toLowerCase
 * 		�빮�ڷ� ����  /  �ҹ��ڷ� ����
 * 		ex)
 * 		String s="Hello";
 * 		s.toUpperCase() => HELLO
 * 		s.toLowerCase() => hello
 * 
 * 	9. replace, replaceAll => ���Խ�
 * 				String s="113��";
 * 				s.replaceAll("[^0-9]","") ==> 113
 * 				s.replaceAll("^[0-9]","") => ��ȣ �տ� ^�� ������ ��ȣ�� ������
 * 				s.replaceAll("[^��-�R]","")
 * 				s.replaceAll("[^A-Za-z]","")
 * 
 * 		������ ��
 *		ex)
 *		String s="Hello Java"
 *		s.replace('a','b') => Hello Jbvb
 *
 *	10. contains(): ���Ե� ���ڸ� ã�� ���
 */
import java.util.Scanner;
public class ���ڿ�Ŭ���� {
	
	static String[] autoComplete(String data)
	{
		String[] ss= {
				"�ڹٿ� JSP","�ڹ� ���α׷���","������ 5","Ajax�� JSP","�������� ����Ʈ",
				"�ڹ� ����Ŭ","MVC ����","��Ʋ���� �ȵ���̵�",
				"��Ʋ�� ���α׷�","������ ������",
				"ȥ�ڹ��� �ڹ�","������ �� ���α׷�","�� ���α׷�","�ڹ� �� ���α׷�","����Ŭ �ڹ�"
		};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
			//if(ss[i].startsWith(data)) // �� �˻���� �����ϴ�
			if(ss[i].contains(data)) // �� �˻��� ����
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �Է�: ");
		String data=scan.next();
		
		String[] fd=autoComplete(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
			{
				System.out.println(fd[i]);
			}
		}
	}

}
