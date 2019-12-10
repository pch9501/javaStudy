/*
 * 		반복문
 * 		/ 선 조건
 * 		= for: 반복횟수가 지정될 때
 * 		= while: 반복횟수가 지정되지 않았을 때
 * 
 * 		ex) 초기값
 * 			while(조건문)
 * 			{
 * 				실행문장
 * 				증가식
 * 			}
 * 
 * 		/ 후 조건
 * 		= do ~ while: 한 번 이상은 '반드시' 수행
 * 
 * 		ex) 초기값
 * 			do
 * 			{
 * 				실행문장
 * 				증가식
 * 			}while(조건문)
 * 
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] s= {"a","b","c","d","e","f","g","h","i","k"};
//		int[] ss = {3,4,5,6,7,8,9,10,11,4,5};
//		int i=0;
//		while (i<10)
//		{
//			System.out.println(s[i]+"-"+ss[i]);
//			i++;
//		}
//		int i =1; // 1
//		int sum=0;
//		while(i<=100) // 2
//		{
//			sum+=i; // 3
//			System.out.println("i="+i+", sum: "+sum);
//			i++; // 4  3 5 7배수의 합 1부터 100까지
//		}
//		System.out.println("1~100의 합: "+sum);
//		
//		int a=1;
//		int sum3=0, sum5=0, sum7=0;
//		while (a<=100)
//		{
//			if(a%3==0)
//				sum3+=a;
//			if(a%5==0)
//				sum5+=a;
//			if(a%7==0)
//				sum7+=a;
//			a++;
//		}
//		System.out.println(sum3);
//		System.out.println(sum5);
//		System.out.println(sum7);
		
		// 알파벳 대문자 출력
		char c = 'A';
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}
		
	}

}
