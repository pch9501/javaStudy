
public class 선택조건문_예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= (int)(Math.random()*100)+1;
		int b= (int)(Math.random()*100)+1;
		
		// a와 b를 비교하여 큰 값, 작은 값 출력하기.
		
		System.out.println("a="+a+", b="+b);
		if(a>b)
		{
			System.out.println("큰 값은 "+a+"입니다.");
			System.out.println("작은 값은"+b+"입니다.");
		}
		if(a<b)
		{
			System.out.println("큰 값은"+b+"입니다.");
			System.out.println("작은 값은"+a+"입니다.");
		}
		if(a==b)
		{
			System.out.println("같다.");
		}
	}

}
