package �ڶ��ܴ���;

public class ����09��ά������ֵ��� {
	public static void main(String[] args) {
		int [][]arr= {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int i,j;
		int sum=0;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
			System.out.println("��ά�����Ԫ�صĺ�Ϊ:"+sum);
	}
}
