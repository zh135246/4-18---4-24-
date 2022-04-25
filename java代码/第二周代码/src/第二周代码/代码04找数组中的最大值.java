package 第二周代码;

public class 代码04找数组中的最大值 {
public static void main(String[] args) {
	int []arr= {4,5,7,9,0,3};
	int max=arr[0]; //先假定数组第一个元素为最大值
	int i;
	for(i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
		System.out.println("max="+max);
}
}
