/*
 * String: 문자열을 제어
 * 
 *	java.lang => import를 생략할 수 있다.
 *	문자열을 저장하는 법
 *	1. String 변수명="Hello Java";
 *	2. String 변수명=new String("Hello Java");  // 같은 문자열=> 별도로 저장
 *
 * 	String에서 제공하는 기능
 * 
 * 	1. equals: 저장된 문자열이 같은지에 대한 여부확인 (true/false)
 * 		ID, PWD => 로그인 (대소문자 구분)
 * 		문자열은 (==)을 사용하면 안된다.
 * 		
 * 		String s="Hello";
 * 		String s1="Hello";
 * 		String s2=new String("Hello");
 * 		if(s.equals(s1))
 * 
 * 		=> 원형
 * 			boolean equals(String data)
 * 
 * 	2. substring: 문자열을 자를 때
 * 			ex)
 * 			String s="0123456789";
 * 			substring(3) => "3456789"
 * 
 * 			String s="112분, 15세이상 관람가"
 * 			substring(0,3) => "112" / end-1과 같다? (0,1,2)
 * 		
 * 	3. length: 문자열 개수
 * 		String s="Hello 홍길동"; // s는 9글자.
 * 
 * 	4. trim: 좌우의 공백문자 제거
 * 		String s=" Hello Java ";
 * 			=> s.trim.length // trim은 좌,우 공백만 지울수있다. 문자열 사이 공백은 지울수없음.
 * 	5. startsWith, endsWith
 * 
 * 
 * 	6. indexOf, lastIndexof
 * 		문자의 위치(indexOf: 앞에서, lastIndexOf: 뒤에서)
 * 		String s="Hello Java";
 * 				  0123456789
 * 		s.indexOf('a') => 7번을 찾아온다(a)
 * 		s.lastIndexOf('a') => 9번을 찾아온다(맨 뒤의 a)
 * 
 * 	7. split
 * 		String s="이병헌, 하정우, 마동석, 전혜진, 수지";
 * 		String[] names=s.split(",")
 * 		
 * 	8. toUpperCase,toLowerCase
 * 		대문자로 변경  /  소문자로 변경
 * 		ex)
 * 		String s="Hello";
 * 		s.toUpperCase() => HELLO
 * 		s.toLowerCase() => hello
 * 
 * 	9. replace, replaceAll => 정규식
 * 				String s="113분";
 * 				s.replaceAll("[^0-9]","") ==> 113
 * 				s.replaceAll("^[0-9]","") => 괄호 앞에 ^가 있으면 괄호를 제외한
 * 				s.replaceAll("[^가-힣]","")
 * 				s.replaceAll("[^A-Za-z]","")
 * 
 * 		변경할 때
 *		ex)
 *		String s="Hello Java"
 *		s.replace('a','b') => Hello Jbvb
 *
 *	10. contains(): 포함된 문자를 찾는 경우
 */
import java.util.Scanner;
public class 문자열클래스 {
	
	static String[] autoComplete(String data)
	{
		String[] ss= {
				"자바와 JSP","자바 프로그래밍","스프링 5","Ajax와 JSP","리덕스와 리액트",
				"자바 오라클","MVC 구조","코틀린과 안드로이드",
				"코틀린 프로그램","스프링 데이터",
				"혼자배우는 자바","지능형 웹 프로그램","웹 프로그램","자바 웹 프로그램","오라클 자바"
		};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
			//if(ss[i].startsWith(data)) // 들어간 검색어로 시작하는
			if(ss[i].contains(data)) // 들어간 검색어 전부
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
		System.out.print("검색어 입력: ");
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
