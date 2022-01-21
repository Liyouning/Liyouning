package hello;

import java.util.Scanner;

public class helloWorld {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("今天是周几？");
		if(a>7 || a<1)
		{
			System.out.println("请输入正确的数字！！！");
		}else 
		{
		    String b = a==6|| a==7  ? "今天是周末！":"今天是周"+a+"!"+"今天是工作日！";
		    System.out.println(b);
		}
	}

}
