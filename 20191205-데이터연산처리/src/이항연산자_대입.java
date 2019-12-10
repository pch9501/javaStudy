/*
 * 		대입연산자(오른쪽->왼쪽)
 * 		= => a=10; / 10을  a에 넣어라.
 * 		복합 대입연산자
 * 		+= => int a=10, a+=10 , a=a+10 /
 * 		-= => int a=10, a-=5 , a= a-5 /
 * 		*= => int a=10, a*=3 , a= a*3 /
 * 		/= => int a=10, a/=2 , a= a/2 /
 * 
 *  	
 */
public class 이항연산자_대입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		a+=1; // a=a+1
		System.out.println(a);
		int b=10;
		b++;
		b++;
		b+=2;
		System.out.println(b);
	}

}
