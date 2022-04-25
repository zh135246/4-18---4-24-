#include<iostream>
using namespace std;
int main()
{
	int arr[]={4,12,5,3,2,17};
	int length;
	int i,j,t; 
    length=sizeof(arr)/sizeof(int);
    cout<<"冒泡排序前的数组为:"<<endl; 
    	for(i=0;i<length;i++)
    	{
    		if(i==length-1)
    		{
    			cout<<arr[i];
			}
			else{
					cout<<arr[i]<<",";
			}
		}
	for(i=1;i<length;i++)
	{		for(j=0;j<length-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
			   t=arr[j];
			   arr[j]=arr[j+1];
			   arr[j+1]=t;	
			}
		}
	}
	cout<<endl;
	   cout<<"冒泡排序后的数组为:"<<endl;
	   	for(i=0;i<length;i++)
    	{
    			if(i==length-1)
    		{
    			cout<<arr[i];
			}
			else{
					cout<<arr[i]<<",";
			}
		}
} 
