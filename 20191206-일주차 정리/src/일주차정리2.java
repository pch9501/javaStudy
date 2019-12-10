/*
 *		자바에서 제공하는 특수문자
 *		1. \n = newLine = 다음줄에 출력
 *		2. \t = tab = 일정간격을 띄운 후 출력
 *		3. \" = " = 따옴표를 출력하고싶을때 사용.
 *		ex) System.out.println("\"hello java\"") = "hello java"가 출력된다.
 *		
 *
 *		System.out.println 은 다음줄에 출력 / \n과 같은역할
 *		System.out.print 는 가로로 쭉 출력 / 공백을 주기위해 \t를 같이 사용하기도함.
 *
 *
 *		System.out.printf
 *		1. %d	정수를 출력할 때
 *		ex) System.out.printf("국어점수:%d",10); 와 같이 사용, d에 10을 넣어라.
 *			d의 앞에 넣은 숫자만큼 칸을 차지한다. %5d는 다섯칸을 차지, 숫자는 오른쪽정렬
 *			("%5d",100)= 공백공백100 의 상태가 된다.
 *			만약 -5를 주게된다면, 숫자는 왼쪽정렬. ("%-5d",100) = 100공백공백.
 *		2. %f (float)	실수를 출력할 때
 *		3. %c (char)	문자를 출력할 때
 *		4. %s (String)	문자열을 출력할 때
 */
public class 일주차정리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-5d%-5d%-5d\n",10,50,60);
		System.out.printf("%-10.2f%-10.2f%-10.2f\n",99.9999,80.88,60.3);
		System.out.printf("%2c%2c%2c\n",'A','B','C');
		System.out.printf("%7s%7s%7s\n","Hello","Java","!!");
		System.out.printf("%7s%5d%5d%5d%7.2f%3c\n","홍길동",80,80,80,80.000,'B');
	}

}
