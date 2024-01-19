#include<stdio.h>
int main(){
    int n;
    printf("enter a value: ");
    scanf("%d",&n);
    int a[n];
    printf("enter the values of array:\n");
    for(int i=0;i<n;i++){
       scanf("%d",&a[i]);
    }
    printf("the values of array:\n");
    for(int i=0;i<n;i++){
        printf("%d\n",a[i]);
    }
}