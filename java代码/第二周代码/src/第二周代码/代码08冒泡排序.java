package 第二周代码;

public class 代码08冒泡排序 {
public static void main(String[] args) {
	int []arr= {4,12,5,3,2,17};
	int i,j;
	int t=0;
	System.out.println("冒泡排序前的数组为：");
	for(i=0;i<arr.length;i++) {
		if(i==arr.length-1) {
			System.out.println(arr[i]);
		}
		else {
			System.out.print(arr[i]+",");
		}
	}
	for(i=1;i<arr.length;i++) {
		for(j=0;j<arr.length-i;j++) {
			if(arr[j]>arr[j+1]) {
				t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
			}
		}
	}
	System.out.println();
	System.out.println("冒泡排序后的数组为：");
	for(i=0;i<arr.length;i++) {
		if(i==arr.length-1) {
			System.out.println(arr[i]);
		}
		else {
			System.out.print(arr[i]+",");
		}
	}
}
}
