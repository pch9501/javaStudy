
public class �������ǹ�_����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score =(int)(Math.random()*101); // Math.random()�� 0.0 ~ 0.99�� ���ڸ� ����
		System.out.println("score: "+score);
		
		//90�̻� a , 80�̻� b, 70�̻� c, 60�̻� d, 60���ϴ� f
		
		if(score<60)
		{
			System.out.println("F�����Դϴ�.");
		}
		else 
		{
			// ��ø if => ���� ���ǹ�
			// if�� �������� ������� ��쿡�� ���ǿ� �´� ��� ������ ������ �� �ִ�.
			if (score>=90 && score<=100)
				System.out.println("A����");
			if(score>=80 && score<90)
				System.out.println("B����");
			if(score>=70 && score<80)
				System.out.println("C����");
			if(score>=60 && score<70)
				System.out.println("D����");
		}
	}

}