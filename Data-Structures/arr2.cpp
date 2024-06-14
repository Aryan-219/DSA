#include <iostream>
using namespace std;
int main(){
    int arr[4]={3434,23,4,11};
    // for(int i=0;i<4;i++){
    //     cout<<arr[i]<<endl;
    // }
    for(int x:arr){
    cout<<x<<endl;

    }
    arr[5]=33;
    cout<<arr[5]<<endl;
    cout<<sizeof(arr)<<endl;
    cout<<sizeof(arr[5])<<endl;
    int s = sizeof(arr)/sizeof(arr[5]);
    cout<<s;
}