
public class �޼ҵ�5 {
	static int[] random()
	{
		int[] com=new int[6];
		
		int su=0;
		
		boolean bCheck=false;
		
		for(int i=0;i<6;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			
			com[i]=su;
			
		}
		return com;
	}
	static void print(int[] com)
	{
		for(int i:com) // ����� �����͸� �Ѱ��� �о�´� (for-each)
		{
			System.out.print(i+" ");
		}
	}
	static void process()
	{
		int[] com = random();
		print(com);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
