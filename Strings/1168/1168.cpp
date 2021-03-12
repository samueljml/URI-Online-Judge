#include <iostream>
#include <string>

using namespace std;

int main()
{
    int qtdTestes;
    int ledsNecessarios[10] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
    
    cin >> qtdTestes;
    while(qtdTestes--){
        char numeros [1000000];
        cin >> numeros;
        int total = 0;
        
        for(int i=0; numeros[i] != '\0'; i++) total += ledsNecessarios[numeros[i]-48];
        
        cout << total << " leds\n";
    }
    return 0;
}