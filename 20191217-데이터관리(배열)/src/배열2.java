/*
 * 		중복이 없는 난수
 * 		=> 배열을 잡고 시작
 * 
 * 		난수발생 =>
 * 
 */
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[9];
		int su=0; // 난수발생시 저장
		boolean bCheck=false; //중복여부를 확인
		
		for(int i=0;i<com.length;i++)
		{
			bCheck=true;
			//==========
			while(bCheck)
			{
				// 난수 발생
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				// 중복여부 확인
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
				
			}
			//==========
			com[i]=su;
		}
		// 출력
		for(int i:com)
		{
			System.out.print(i+" ");
		}
	}

}
