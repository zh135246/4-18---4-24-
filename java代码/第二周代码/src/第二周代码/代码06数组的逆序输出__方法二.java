package 第二周代码;

public class 代码06数组的逆序输出__方法二 {
public static void main(String[] args) {
	int []arr= {1,2,3,4,5,6};
	int begin,end;
	int t;
	System.out.println("逆序前的数组为：");
	for(begin=0,end=arr.length-1;begin<=end;begin++) {
		if(begin==end) {
			System.out.println(arr[begin]);
		}
		else {
			System.out.print(arr[begin]+",");
		}
	}
	for(begin=0;begin<=end;begin++,end--){
		t=arr[end];
		arr[end]=arr[begin];
		arr[begin]=t;
	}
	System.out.println("逆序后的数组为：");
	for(begin=0,end=arr.length-1;begin<=end;begin++) {
		if(begin==end) {
			System.out.println(arr[begin]);
		}
		else {
			System.out.print(arr[begin]+",");
		}
	}
}

}
