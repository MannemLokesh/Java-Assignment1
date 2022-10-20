public class Program4
{
	public static void main(String[] args)
	{
		int num=14;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num; j++)
			{
				if((j==0) && (i>=(num-1)/2)|| i==num-1 || (j==(num-1)) && (i>=(num-1)/2) ||
					(i-j>=(num-1)/2) || (i+j>=(num+(num-3)/2))
						 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
			
		}
	}
}
