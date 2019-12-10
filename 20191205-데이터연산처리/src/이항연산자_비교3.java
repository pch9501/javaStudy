// 1,2 => 난수 발생 => 홀(1), 짝(2)
import java.util.Scanner;
public class 이항연산자_비교3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Math.random() => 0.0 ~ 0.99 까지 발생함 => 2를 곱하면 0.0 ~ 1.999까지
//		because => only 0~1
		int com=(int)(Math.random()*2)+1; // 1~2
		Scanner scan= new Scanner(System.in);
		System.out.print("입력(홀,짝): ");
		String input = scan.next();
		
		String result = com%2==0?"짝":"홀";
		
		String dap = input.equals(result)?"정답":"오답";
		// 문자열비교는 .equals를 사용해야한다. 위처럼
		System.out.println("com="+com);
		System.out.println("dap="+dap);
		
		
	}

}
