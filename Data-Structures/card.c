#include <stdio.h>
int main(){
    struct Card{
        int facevalue;
        char shape[20];
        char color[20];
    };

    struct Card c={3,"diamond", "red"};
    printf("the facevalue of card is %d and the shape is : %s and the color is %s ", c.facevalue, c.shape,c.color);

    struct Card C[52];//deck

}