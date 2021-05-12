#include <stdio.h>

int main()
{
    int metadeTamanhoBaralho, contador = 1, posicaoZero = 1, pos;
    scanf("%d", &metadeTamanhoBaralho);
    metadeTamanhoBaralho /= 2;
    
    while(1) {
        contador++;
        
        if(posicaoZero < metadeTamanhoBaralho) {
            pos = posicaoZero;
            posicaoZero = pos*2+1;
        }
        else {
            pos = posicaoZero - metadeTamanhoBaralho;
            if (pos == 0) {
                break;
            }
            posicaoZero = pos * 2;
        }
    }
    printf("%d\n", contador);
    return 0;
}