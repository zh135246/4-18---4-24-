#include <iostream>
using namespace std;
int a[]={1,3,5,7,9};
int& index(int i)
{
	return a[i];
}
int main()
{
	index(2)=25;  //�����ֶ�index(2)����ֵ 
	cout<<index(2)<<endl;  //���Խ������25��������5 
	return 0;
}
