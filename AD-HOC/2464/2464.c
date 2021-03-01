#include <stdio.h>

int main() {

    char alfabeto[27], frase[10001];
    unsigned short int i;

    scanf("%s %s", &alfabeto, &frase);
    
    for(i=0; frase[i] != '\0'; i++){
        printf("%c", alfabeto[frase[i] - 97]);
	}
    printf("\n");

    return 0;
}