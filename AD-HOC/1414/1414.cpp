#include <iostream>

using namespace std;

int main()
{
    while(true) {
        string nome;
        int timesParticipantes;
        int qtdPartidas;
        int pontos;
        int totalPontos = 0;
        
        cin >> timesParticipantes;
        cin >> qtdPartidas;
        
        if(timesParticipantes == 0 && qtdPartidas == 0) break;
        
        for(int i=0; i<timesParticipantes; i++) {
            cin >> nome;
            cin >> pontos;
            totalPontos += pontos;
        }
        
        int empates = qtdPartidas - (totalPontos - (qtdPartidas * 2));
        
        cout << empates << "\n";
    }
    return 0;
}