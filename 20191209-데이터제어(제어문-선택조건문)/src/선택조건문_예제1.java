
public class 선택조건문_예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score =(int)(Math.random()*101); // Math.random()은 0.0 ~ 0.99의 숫자를 생성
		System.out.println("score: "+score);
		
		//90이상 a , 80이상 b, 70이상 c, 60이상 d, 60이하는 f
		
		if(score<60)
		{
			System.out.println("F학점입니다.");
		}
		else 
		{
			// 중첩 if => 이중 조건문
			// if문 여러개를 사용했을 경우에는 조건에 맞는 모든 문장을 수행할 수 있다.
			if (score>=90 && score<=100)
				System.out.println("A학점");
			if(score>=80 && score<90)
				System.out.println("B학점");
			if(score>=70 && score<80)
				System.out.println("C학점");
			if(score>=60 && score<70)
				System.out.println("D학점");
		}
	}

}