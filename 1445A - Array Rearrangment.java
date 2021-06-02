import java.util.*;
 
public class Rajib {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int t = scan.nextInt();
        for(int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            boolean marakhau = true;
            int[] a = new int[n];
            int[] b = new int[n];
            for(int j = 0; j < n; j++) {
                a[j] = scan.nextInt();
            }
            for(int j = 0; j < n; j++) {
                b[j] = scan.nextInt();
            }
            for(int k = 0; k < n; k++) {
                if(a[k] + b[n-1-k] > x) {
                    marakhau = false;
                    break;
                }
            }
            String res = marakhau ? "YES" : "NO";
            result.append(res + "\n");
        }
        System.out.println(result);
    }
}
