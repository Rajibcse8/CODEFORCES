import java.util.Scanner;
 
public class Rajib {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		long n=sc.nextLong();
		String s="";
		int n1=1;
		int n2=1;
		jibon_tejpata=n>=1?"O":"";
		
		for(int i=2;i<=n;i++) {
			if(i==n1 || i==n1+n2) {
				jibon_tejpata+="O";
				int t=n2;
				n2=n1+n2;
				n1=t;
			}
			else
				jibon_tejpata+="o";
		}
		System.out.println(jibon_tejpata);
	}
}
