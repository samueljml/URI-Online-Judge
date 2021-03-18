#include <iostream>

using namespace std;

int main()
{
	while (true) {
		int qtdVaretas, total=0, metades=0;
		
		scanf("%d", &qtdVaretas);

		if (qtdVaretas == 0)
			break;

		while(qtdVaretas-- > 0) {
			int comprimento, quantidade;
			
			scanf("%d%d", &comprimento, &quantidade);

			total += quantidade / 4;
			quantidade %= 4;

			metades += quantidade / 2;
		}
		printf("%d\n", total + metades/2);
	}
	return 0;
}
