/*
 * 			
 */
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		// 여러개의 실행문장을 동시에 제어할 때 사용하는 조건문
		int b=100;
		if (num%2==0)
		{
			System.out.println("b는 "+b+"입니다.");
			System.out.println(num+"는(은) 짝수입니다.");
			System.out.println("프로그램 종료");
			b++;
		} // if안의 b는 if절 안에서만 존재한다. if절을 벗어나면 없어짐.
//			 ex) if 괄호아래에 sysout b를 한다면 에러가 난다. 없는 변수이기때문.
//		 System.out.println("프로그램 종료"); // if와 별개이기때문에 무조건 수행.
		System.out.println(b);
		int c= 10;
		c++;
		c++;
		c++;
		c++;
		c++;
		System.out.println(c);
		
		int d=10;
		d+=5;
		System.out.println(d);
	}

}
