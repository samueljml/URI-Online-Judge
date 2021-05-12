#include <iostream>

using namespace std;

int main () {
    int qtdAlunos, qtdComputadores, qtdComputadoresQueimados, qtdComputadoresSemCompilador;
    cin >> qtdAlunos >> qtdComputadores >> qtdComputadoresQueimados >> qtdComputadoresSemCompilador;

    int qtdComputadoresFuncionais = qtdComputadores - qtdComputadoresQueimados - qtdComputadoresSemCompilador;
    
    if(qtdComputadoresFuncionais <= qtdAlunos) {
        if(qtdComputadoresQueimados > qtdComputadoresSemCompilador/2) {
            cout << "Caio, a culpa eh sua!\n";
        }
        else {
            cout << "Igor bolado!\n";
        }
    }
    else {
        cout << "Igor feliz!\n";
    }
    
    return 0;
}