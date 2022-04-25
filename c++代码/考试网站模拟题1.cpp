#include <iostream>
using namespace std;
int a[]={1,3,5,7,9};
int& index(int i)
{
	return a[i];
}
int main()
{
	index(2)=25;  //这里又对index(2)赋了值 
	cout<<index(2)<<endl;  //所以结果就是25，而不是5 
	return 0;
}
