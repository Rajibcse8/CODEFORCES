import java.util.*;
 
public class Code {
 
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
			long r=scn.nextLong();
			long s=scn.nextLong();
			long p=scn.nextLong();
 
			if(r*(p+1)<s || s*(p+1)<r)
			{
				System.out.println("No");
			}
			else System.out.println("Yes");
			t--;
		}
	}
 
}
