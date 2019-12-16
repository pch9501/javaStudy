
//정수 다섯개 랜덤, 정렬후 등수매기기.
public class 배열10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num=new int[5];
		int[] rank=new int[5];
		
		for(int i=0;i<5;i++)
		{
			num[i]=(int)(Math.random()*100)+1;
		}
		for(int i=0;i<5;i++)
		{
			rank[i]=1;
			for(int j=0;j<5;j++)
			{
				if(num[i]<num[j])
					rank[i]++;
			}
		}
		for(int i:num)
		{
			System.out.println(i+"\t");
		}
		for(int i:rank)
		{
			System.out.println(i);
		}
	}

}
