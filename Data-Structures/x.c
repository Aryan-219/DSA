#include<stdio.h>
#include<stdlib.h>
int main(){

    int *p;
    p=(int *)malloc(5*sizeof(int));

    // p[0]=12;
    // p[1]=121;
    // p[2]=124;
    // p[3]=123;
    // p[4]=112;
    printf("Enter the values of array:\n");
    for(int i=0;i<5;i++){
        printf("%d :",i);
       scanf("%d", &p[i]);
    }
    printf("The values of array are as follows:\n");
    for(int i=0;i<5;i++){
        printf("%d\n", p[i]);
    }

    free(p);
}