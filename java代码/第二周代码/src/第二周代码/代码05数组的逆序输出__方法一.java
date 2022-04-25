package 第二周代码;

public class 代码05数组的逆序输出__方法一 {
public static void main(String[] args) {
	int []arr= {1,2,3,4,5,6};
	int i,t;
	System.out.println("逆序前的数组为：");
	for(i=0;i<arr.length;i++) {
		if(i==arr.length-1) {
			System.out.println(arr[i]);
		}
		else {
			System.out.print(arr[i]+",");
		}
	}
	for(i=0;i<=arr.length/2;i++){
		t=arr[arr.length-i-1];
		arr[arr.length-i-1]=arr[i];
		arr[i]=t;
	}
	System.out.println("逆序后的数组为：");
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
