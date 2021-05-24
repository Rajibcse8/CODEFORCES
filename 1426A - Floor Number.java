import java.util.Scanner;
 
public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            if (n < 3) System.out.println(1);
            else System.out.println((n - 3) / k + 2);
        }
    }
}
