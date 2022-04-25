package 第二周代码;

import java.util.Scanner;

public class 代码02方法案例 {
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
	    System.out.println("请输入你想要的星星图的行数:");
	    int x=sc.nextInt(); 
	    System.out.println("请输入你想要的星星图的行数:");
	    int y=sc.nextInt();
	stars(x,y);
}
}
