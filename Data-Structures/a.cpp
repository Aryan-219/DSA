#include<stdio.h>
#include <iostream>
using namespace std;
int main(){
    // int a[5]={45,34,65,4343,2};
    int a[5];
    a[0]=634;
    a[1]=34;
    a[2]=3544;
    // cout<<a[1];
    // cout<<a[6];
    // printf("%d\n",a[1]);
    // printf("%d\n",a[4]);
    // printf("%d\n",a[6]);
    // printf("%d",sizeof(a));

    // for(int i=0;i<5;i++){
    //     cout<<a[i]<<endl;
    // }
    for(int x:a){
        cout<<x<<endl;
    }
}