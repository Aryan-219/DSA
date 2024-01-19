#include <stdio.h>

struct Rectangle
{
    int length;
    int breadth;
}r1,r2;
// r1 and r2 are global variables whereas r is local variable of main function
int main()
{
    struct Rectangle r;
    r.length = 10;
    r.breadth = 5;
    printf("%d\n", sizeof(r));
    printf("area of rectangle is: %d", r.length * r.breadth);
}