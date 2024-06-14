#include <iostream>
// #include <bits/stdc++.h>
using namespace std;
int main(){
    // cout<<"hello";
    int n;
    cout<<"Enter the value of n:";
    cin>>n;
    int arr[n];
    cout<<"Enter the values of array"<<endl;
    for(int i = 0 ; i< n; i++){
        cin>>arr[i];
    }
    for(int i = 0 ; i< n; i++){
        cout<<arr[i];
        cout<<endl;
    }

    return 0;
}