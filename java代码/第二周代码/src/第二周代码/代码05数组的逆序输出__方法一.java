package �ڶ��ܴ���;

public class ����05������������__����һ {
public static void main(String[] args) {
	int []arr= {1,2,3,4,5,6};
	int i,t;
	System.out.println("����ǰ������Ϊ��");
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
	System.out.println("����������Ϊ��");
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
