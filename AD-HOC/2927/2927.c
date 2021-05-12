#include <stdio.h>

int main () {
    int qtdAlunos, qtdComputadores, qtdComputadoresQueimados, qtdComputadoresSemCompilador;
    scanf("%d%d%d%d", &qtdAlunos, &qtdComputadores, &qtdComputadoresQueimados, &qtdComputadoresSemCompilador);
    
    int qtdComputadoresFuncionais = qtdComputadores - qtdComputadoresQueimados - qtdComputadoresSemCompilador;
    
    if(qtdComputadoresFuncionais <= qtdAlunos) {
        if(qtdComputadoresQueimados > qtdComputadoresSemCompilador/2) {
            printf("Caio, a culpa eh sua!\n");
        }
        else {
            printf("Igor bolado!\n");
        }
    }
    else {
        printf("Igor feliz!\n");
    }
    
    return 0;
}