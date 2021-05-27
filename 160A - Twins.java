import java.util.*;
 
public class Rajib{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(), coins[]=new int[n], sum=0, part_sum=0;
		for(int i=0; i<n; i++)
		{
			coins[i]=s.nextInt();
			sum+=coins[i];
		}
		int i;
		Arrays.sort(coins);
		for(i=coins.length-1; part_sum<=sum/2; i--)
		{
			part_sum+=coins[i];
		}
		System.out.println(coins.length-i-1);
		s.close();
	}
}
