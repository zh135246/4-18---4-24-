package �ڶ��ܴ���;

import java.util.Scanner;

public class ����02�������� {
public static void stars (int x,int y) {
	int i,j;
	for(i=0;i<x;i++) {
		for(j=0;j<y;j++) {
			System.out.print("*");
		}
		System.out.println();
	}	
}
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	    System.out.println("����������Ҫ������ͼ������:");
	    int x=sc.nextInt(); 
	    System.out.println("����������Ҫ������ͼ������:");
	    int y=sc.nextInt();
	stars(x,y);
}
}
