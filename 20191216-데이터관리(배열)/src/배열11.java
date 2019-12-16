
public class ¹è¿­11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5];
		for(int i=0;i<5;i++)
		{
			score[i]=(int)(Math.random()*100)+1;
		}
		for(int i=0;i<4;i++)
		{
			for(int j=(i+1);j<5;j++)
			{
				if(score[i]<score[j])
				{
					int temp= score[i];
					score[i]=score[j];
					score[j]=temp;
				}
				
			}
		}
		for(int i:score)
		{
			System.out.print(i+" ");
		}
	}

}
