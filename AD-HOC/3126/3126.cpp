#include <iostream>

int main() {
    int qtdParticipantes, total=0;
    scanf("%d", &qtdParticipantes);
    
    while(qtdParticipantes--) {
        int presente;
        scanf("%d", &presente);
        total += presente;
    }
    printf("%d\n", total);

    return 0;
}
