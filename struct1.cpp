#include <iostream>
using namespace std;
struct Rectangle
{
    int length;
    int breadth;
    char x;
// }r1,r2,r3; // Declaring variables along with structure definition
}; // normal definition of structure 

int main()
{
    // Rectangle r1 = {34,343}; // Declaration cum initialization
    Rectangle r1;
    cout << r1.breadth << endl; // Garbage values will be printed
    cout << r1.length << endl;
    r1.length = 21;
    r1.breadth = 344;
    cout << r1.breadth << endl; //Actual values are printed
    cout << r1.length << endl;

    // Modifying the values of structure through dot operator
    r1.length = 89;
    r1.breadth = 900;
    cout<< "Modified values are:"<<endl;
    cout << r1.breadth << endl; 
    cout << r1.length << endl;

    // The user defined structure Rectangle here is taking 8 bytes : 4 for length, 4 for breadth
    cout<<sizeof(r1)<< endl; 
    printf("%d\n",sizeof(r1)); // although char takes 1 byte. Here 4 bytes will be allocated because it is easy for compiler to read 4 bytes at a time . Also, here only 1 byte will be used by the structure
    // Note: the sizeof returns long unsigned int
    printf("%lu", sizeof(r1)); // lu stands for long unsigned int 

    // This adjustment in the memory is called as padding
}