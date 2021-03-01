#include <stdio.h>

int chamadas, resultado;

int main()
{
    int casosDeTeste;
    scanf("%d", &casosDeTeste);
		
	while(casosDeTeste--) {
		int num;
		scanf("%d", &num);
			
		chamadas = -1;
		resultado = 0;
		resultado = fibonaci(num);
			
		printf("fib(%d) = %d calls = %d\n", num, chamadas, resultado);
	}
}
	
int fibonaci (int num) {
	
	if(num < 0) {
		return 0;
	}
	else if(num<=1){
		chamadas++;
		return num;
	}
	
	chamadas++;
	return fibonaci(num-1) + fibonaci(num-2);
}