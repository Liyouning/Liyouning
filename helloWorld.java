package hello;

import java.util.Scanner;

public class helloWorld {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float a = in.nextFloat();
		System.out.println("��������ߣ�"+a+"��");
		int b = in.nextInt();
		System.out.println("���������أ�"+b+"kg");
		float c = b/(a*a);
		if(c<18.5)
		{
			System.out.println("��ǰ���ع��ᣡ"+"��ǰ��BMI�ǣ�"+c);
		}else if(c>=18.5 && c<24) 
		{
			System.out.println("��ǰ�������أ�"+"��ǰ��BMI�ǣ�"+c);
		}else if(c>=27 && c<30)
		{
			System.out.println("��ǰ��ȷ��֣�"+"��ǰ��BMI�ǣ�"+c);
		}else if(c>=30 && c<35)
		{
			System.out.println("��ǰ�жȷ��֣�"+"��ǰ��BMI�ǣ�"+c);
		}else if(c>=35)
		{
			System.out.println("��ǰ�ضȷ��֣�"+"��ǰ��BMI�ǣ�"+c);
		}
	}

}
