package 第二周代码;

public class 代码07数组指定位置插入数据 {
public static void main(String[] args) {
	int []arr= {10,11,13,14,15};
	int []arr2= new int[arr.length+1];
	int i;
	System.out.println("插入数据前的数组为：");
	for(i=0;i<arr.length;i++) {
		if(i==arr.length-1) {
			System.out.println(arr[i]);
		}
		else {
			System.out.print(arr[i]+",");
		}
	}
	for(i=0;i<2;i++) {
		arr2[i]=arr[i];
	}
	arr2[2]=12;
	for(i=3;i<arr2.length;i++) {
		arr2[i]=arr[i-1];
	}
	System.out.println("插入数据后的数组为：");
	for(i=0;i<arr2.length;i++) {
		if(i==arr2.length-1) {
			System.out.println(arr2[i]);
		}
		else {
			System.out.print(arr2[i]+",");
		}
	}
}	
}
