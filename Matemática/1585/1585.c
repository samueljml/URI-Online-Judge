#include <stdio.h>

int main()
{
    int qtdTestes;
    scanf("%d", &qtdTestes);
    
    while(qtdTestes--) {
        short x, y;
        scanf("%hd%hd", &x, &y);
        
        printf("%hd cm2\n", (x*y) / 2);
    }
    return 0;
}