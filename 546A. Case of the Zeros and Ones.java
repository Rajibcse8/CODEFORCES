 

/*
..................
******************
*................*
*.....RAJIB......* 
*................* 
******************
..................
*/


import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import static java.lang.Integer.min;
import static java.lang.Integer.max;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.lang.*;


public class Codeforces {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
   
      int n=scan.nextInt();
      String s=scan.next();
       int one=0,zero=0;
      for(int i=0;i<n;i++){
         if(s.charAt(i)=='1')one++;
         if(s.charAt(i)=='0')zero++;
      }
 
      System.out.println(n-(min(zero,one)*2));
        
    }}
