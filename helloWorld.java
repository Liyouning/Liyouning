package hello;

import java.util.Scanner;

public class helloWorld {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float a = in.nextFloat();
		System.out.println("请输入身高："+a+"米");
		int b = in.nextInt();
		System.out.println("请输入体重："+b+"kg");
		float c = b/(a*a);
		if(c<18.5)
		{
			System.out.println("当前体重过轻！"+"当前的BMI是："+c);
		}else if(c>=18.5 && c<24) 
		{
			System.out.println("当前正常体重！"+"当前的BMI是："+c);
		}else if(c>=27 && c<30)
		{
			System.out.println("当前轻度肥胖！"+"当前的BMI是："+c);
		}else if(c>=30 && c<35)
		{
			System.out.println("当前中度肥胖！"+"当前的BMI是："+c);
		}else if(c>=35)
		{
			System.out.println("当前重度肥胖！"+"当前的BMI是："+c);
		}
	}

}
