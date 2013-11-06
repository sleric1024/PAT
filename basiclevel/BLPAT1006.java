package biaobiaoqi.algorithm.oj.pat.basiclevel;

import java.util.Scanner;

/**
 * 
 * 让我们用字母B来表示“百”、字母S表示“十”，用“12...n”来表示个位数字n（<10），换个格式来输出任一个不超过3位的正整数。例如234应该被输出为BBSSS1234，因为它有2个“百”、3个“十”、以及个位的4。

输入格式：每个测试输入包含1个测试用例，给出正整数n（<1000）。

输出格式：每个测试用例的输出占一行，用规定的格式输出n。

输入样例1：
234
输出样例1：
BBSSS1234
输入样例2：
23
输出样例2：
SS123


 * @author biaobiaoqi
 *
 */
public class BLPAT1006 {
	public static void main(String args[]) {
		int n = 0;
		Scanner cin = new Scanner(System.in);
		
		while (cin.hasNextInt())
        {
			n = cin.nextInt();
			int tmp = n;
			
			tmp /= 100;
			for (int i = 0; i < tmp; i ++) {
				print('B');
			}
			
			n -= tmp * 100;
			tmp = n;
			tmp /= 10;
			for (int i = 0; i < tmp; i ++) {
				print('S');
			}
			
			n -= tmp*10;
			for (int i = 0; i < n; i ++) {
				System.out.print(i+1);
			}
        }
	}
	
	public static void print(char ch) {
		System.out.print(ch);
	}
	
}
