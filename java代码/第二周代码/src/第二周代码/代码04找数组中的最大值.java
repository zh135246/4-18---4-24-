package �ڶ��ܴ���;

public class ����04�������е����ֵ {
public static void main(String[] args) {
	int []arr= {4,5,7,9,0,3};
	int max=arr[0]; //�ȼٶ������һ��Ԫ��Ϊ���ֵ
	int i;
	for(i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
		System.out.println("max="+max);
}
}
