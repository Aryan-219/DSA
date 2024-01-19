// #include <stdio.h>
#include<iostream>
using namespace std;
int main()
{
    struct Rectangle
    {
        int length;
        int breadth;
    };
    struct Rectangle r;
    r.length = 10;
    r.breadth = 5;
    // printf("%d\n",sizeof(r));
    cout<<sizeof(r);
    // printf("area of rectangle is: %d",r.length*r.breadth);
    cout<<"area of rectangle is: "<<(r .length  )*(r.breadth);
}