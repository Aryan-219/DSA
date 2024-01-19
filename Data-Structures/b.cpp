#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    int n;
    // printf("enter a value: ");
    cout<<"Enter a value";
    // scanf("%d",&n);
    cin>>n;
    int a[n];
    // printf("enter the values of array:\n");
    cout<<"enter the values of array:";
    for(int i=0;i<n;i++){
    //    scanf("%d",&a[i]);
        cin>>a[i];
    }
    printf("the values of array:\n");
    for(int i=0;i<n;i++){
        printf("%d\n",a[i]);
    }
}