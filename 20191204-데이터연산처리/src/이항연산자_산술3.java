
public class ���׿�����_���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=10; double b = 3.0; double c=a/b; System.out.println("c="+c);
		 * 
		 * 
		 * //������ int d1 = 5%2; int d2 = -5%2; int d3 = -5%-2; int d4 = 5%-2;
		 * System.out.println(d1); System.out.println(d2); System.out.println(d3);
		 * System.out.println(d4);
		 * 
		 * int e= 369; int h100 = e/100; int h10 = (e%100)/10; int h1 = e%10;
		 * 
		 * System.out.print("100�ڸ� : "+h100+"\t"); System.out.print("10�ڸ� : "+h10+"\t");
		 * System.out.print("1�ڸ� : "+h1);
		 */
		int money = 65430;
		int m10000 = money/10000;
		int m1000 = (money%10000)/1000;
		int m100 = (money%1000)/100;
		int m10 = (money%100)/10;
		System.out.println(money+"��");
		System.out.println("���� : "+m10000);
		System.out.println("õ�� : "+m1000);
		System.out.println("��� : "+m100);
		System.out.println("�ʿ� : "+m10);
		
		
		String s=100+10.5+""+'A'+10f+100L;
		//		 110.5 + "" => "110.5" + 'A' => "110.5A" + 10
//				 "110.5A10"+100 => "110.5A10100"
		System.out.println(s);
				
	}

}
