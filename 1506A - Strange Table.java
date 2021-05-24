import java.util.Scanner;
 
 
public class Main {
   public static void main(String[] args) {
     
      Scanner scanner = new Scanner(System.in);
      int t = scanner.nextInt();
      while (t-- > 0) {
         long n = scanner.nextLong();
         long m = scanner.nextLong();
         long x = scanner.nextLong();
         long r = x % n;
         if (r == 0)
            r = n;
         long c = (x - r) / n + 1;
         System.out.println((r - 1) * m + c);
      }
   }
}
