package �ڶ��ܴ���;

import java.util.Scanner;

public class ����01��������__�����������е����ֵ {
public static int compare(int a,int b,int c)
{
	int max;
	if(a>b){
		max=a;
	}
	else {
		max=b;
	}
	if(c>max) {
		max=c;
	}
	return max;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("��������ֱ�����Ҫ�Ƚϵ���������");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int max;
	max=compare(a,b,c);
	System.out.println("�������������Ϊ"+max);
}
}
