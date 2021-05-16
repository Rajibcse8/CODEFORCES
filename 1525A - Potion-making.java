import java.util.*;
public class PotionMaking {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int k=sc.nextInt();
			int i=1;
			while((100*i)%k!=0) {
				i++;
			}
			System.out.println((100*i)/k);
		}
	}
 
}
