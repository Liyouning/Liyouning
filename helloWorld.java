package hello;

import java.util.Scanner;

public class helloWorld {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("�������ܼ���");
		if(a>7 || a<1)
		{
			System.out.println("��������ȷ�����֣�����");
		}else 
		{
		    String b = a==6|| a==7  ? "��������ĩ��":"��������"+a+"!"+"�����ǹ����գ�";
		    System.out.println(b);
		}
	}

}
