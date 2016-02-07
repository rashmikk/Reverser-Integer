package test;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int N = Integer.parseInt(stdin.nextLine());
		int result = reverse(N);
		stdin.close();
		System.out.println(result);
	}

	public static int reverse(int x) {
		 double res = 0;
	     while(x != 0){
	         res = res*10 + x % 10;
	         x = x/10;
	     }
	     if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
	         res = 0;
	     return (int) res;
    }
}
