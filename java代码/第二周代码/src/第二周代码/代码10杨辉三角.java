package �ڶ��ܴ���;

import java.util.Scanner;

public class ����10������� {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("��������Ҫ�������������ǣ�");
	int length=sc.nextInt();
	System.out.println(length+"�е��������������ʾ��");
	int i,j;
    int [][]arr=new int[length][length];
    for(i=0;i<length;i++) {
    	arr[i][0]=1;
    	arr[i][i]=1;
    }
    for(i=2;i<length;i++) {
    	for(j=0;j<i;j++) {
    		arr[i][j+1]=arr[i-1][j]+arr[i-1][j+1];
    	}
    }
    for(i=0;i<length;i++) {
    	for(j=0;j<=i;j++)
    	{
    		System.out.print(arr[i][j]+"\t");
    	}
    	System.out.println();
    }
    	
}
}
