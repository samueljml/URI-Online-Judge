#include <iostream>

using namespace std;

int main () {
	int qtdDigitos;
	string digitos;
	
	while(scanf("%d ", &qtdDigitos) != EOF) {
		getline(cin, digitos);
		int algarismosSomados = 0;
		
		for(int i=0; i<qtdDigitos; i++) {
			algarismosSomados += digitos[i] - 48;
		}
		if(algarismosSomados%3 == 0) printf("%d sim\n", algarismosSomados);
		else printf("%d nao\n", algarismosSomados);
	}
}
