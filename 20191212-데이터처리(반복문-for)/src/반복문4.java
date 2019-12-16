/*
 * 		1~100까지의 합!
 * 		짝수 홀수 의 합 출력해보자
 * 		
 * 		출력문
 * 		1~100까지의 합: ~~
 * 		1~100까지의 짝수의 합: ~~~
 * 		1~100까지의 홀수의 합: ~~~
 * 
 */
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,num1=0,num2=0;
		
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			if(i%2==0)
				num1+=i;
			else
				num2+=i;
		}
		System.out.println(sum);
		System.out.println(num1);
		System.out.println(num2);
	}

}
