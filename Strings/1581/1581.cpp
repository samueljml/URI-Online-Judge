#include <iostream>
#include<string>

using namespace std;

int main() {

    int qtdTestes, qtdPessoas, i;
    string pessoa, aux;
    cin >> qtdTestes;

    while(qtdTestes--){
        cin >> qtdPessoas;
        bool idiomasDiferentes = false;

        for(i=0; i<qtdPessoas; i++){
            cin >> pessoa;

            if(!idiomasDiferentes){
                if(i == 0) aux.append(pessoa);
                else{
                    if(aux != pessoa) idiomasDiferentes = true;
                }
            }
        }
        aux.clear();
        if(idiomasDiferentes) cout << "ingles\n";
        else cout << pessoa << endl;
    }
    return 0;
}