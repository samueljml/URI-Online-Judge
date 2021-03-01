#include <iostream>
 
using namespace std;

int chamadas, resultado;

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

int main()
{
    int casosDeTeste;
    cin >> casosDeTeste;
		
	while(casosDeTeste--) {
		int num;
		cin >> num;
			
		chamadas = -1;
		resultado = 0;
		resultado = fibonaci(num);
		 
		cout << "fib(" << num << ") = " << chamadas << " calls = " << resultado << "\n";
	}
}