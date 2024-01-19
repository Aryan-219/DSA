#include <stdio.h>
#include <stdlib.h>
int main()
{
    // int a=19;
    // int *p;
    // p=&a;
    // printf("%d\n", a);
    // printf("%d\n", &a);
    // printf("%d\n", p);
    // printf("%d\n", *p);
    int *x;
    x = (int *)malloc(5 * sizeof(int));
    x[0]=21;
    x[1]=211;
    x[2]=2123;
    x[3]=2153;
    x[4]=241;
    // for (int i = 0; i < 5; i++)
    // {
    //     printf("Enter value %d", i);
    //     scanf("%d", x[i]);
    //     // x++;
    // }
     for(int i=0;i<5;i++){
        printf("%d\n", x[i]);
        // x++;
    }
}