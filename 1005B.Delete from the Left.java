/*
..................
******************
*................*
*.....RAJIB......* 
*................* 
******************
..................
*/

import java.util.*;
 
public class A {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String s1 = in.next();
		char[] arr1 = s.toCharArray();
		char[] arr2 = s1.toCharArray();
		int lcs = 0;
		for (int i = arr1.length - 1, j = arr2.length - 1; i >= 0 && j >= 0; i--, j--) {
			if (arr1[i] == arr2[j]) {
				lcs++;
			} else {
				break;
			}
		}
		int sum = arr1.length + arr2.length;
		System.out.println(sum - 2 * lcs);
	}
 
}
