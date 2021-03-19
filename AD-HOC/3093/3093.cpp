#include <iostream>
#include <string>

using namespace std;

int main () {
	int qtdTestes;
	scanf("%d ", &qtdTestes);
	
	while(qtdTestes--) {
		string cartasNecessarias ("QJKA");
		string cartas;
		int total=0;
		
		getline(cin, cartas);
		
		for(int i=0; i<cartas.length(); i++) {
			for(int j=0; j<cartasNecessarias.length(); j++) {
				if(cartas[i] == cartasNecessarias[j]) {
					cartasNecessarias[j] = '0';
					total++;
				}
			}
		}
		
		if(total == 4) printf("Aaah muleke\n");
		else printf("Ooo raca viu\n");
	}
	return 0;
}
