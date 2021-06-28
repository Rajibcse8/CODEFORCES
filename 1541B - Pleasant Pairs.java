import java.util.*;
public class ttrryy {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=0;
	    if(sc.hasNextInt()) {
	    	t=sc.nextInt();
	    }
	    while(t>0) {
	    	t--;
	    	int n=sc.nextInt();
	    	int a[]=new int[n];
	    	for(int i=0;i<n;i++) {
	    		a[i]=sc.nextInt();
	    	}
	    	int max=n;
	    	max+=n-1;
	    	int ans=0,val=0,k=0,p=0;
	    	for(int i=0;i<n;i++) {
	    		val=a[i];
	    		k=i+1;
	    		for(int j=1;j<=max/val;j++) {
	    			p=val*j;
	    			p-=k;
	    			p--;
	    			if(p>=0 && p<n && p>i && a[p]==j)
	    				ans++;
	    		}
	    	}
	    	System.out.println(ans);
	    }
	}
 
}
