#include <iostream>

using namespace std;

int abs(int val) {
	if(val < 0) return val*-1;
	return val;
}

int main () {
	
	int qtdTestes, ganhadorId=0;
	
	scanf("%d", &qtdTestes);
	
	while(qtdTestes--) {
		int qtdAlunos, numeroSorteado, valor, diferenca, menorDiferenca = 101;
		
		scanf("%d%d", &qtdAlunos, &numeroSorteado);
		
		for(int i=0; i<qtdAlunos; i++) {
			scanf("%d", &valor);
			diferenca = abs(valor - numeroSorteado);
			
			if(diferenca < menorDiferenca) {
				menorDiferenca = diferenca;
				ganhadorId = i+1;
			}
		}
		printf("%d\n", ganhadorId);
	}
	return 0;
}
