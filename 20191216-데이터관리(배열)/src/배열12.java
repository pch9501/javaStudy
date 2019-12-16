
public class 배열12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수저장
		int[] arr=new int[10];
		// 초기값
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("정렬 후: ");
		// 정렬
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=(i+1);j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
