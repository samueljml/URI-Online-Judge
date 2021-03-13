#include <bits/stdc++.h>
#include <iostream>

using namespace std;

void primeiraPassada(string *, int);
void segundaPassada(string *);
void terceiraPassada(string *, int);

int main ()
{
	int qtd;
	string teste;
	cin >> qtd;
	getline (cin,teste);
	
	while(qtd--){
		string texto;

		getline (cin,texto);
		int size = texto.length();
		
		primeiraPassada(&texto, size);
		segundaPassada(&texto);
		terceiraPassada(&texto, size);

		cout << texto << endl;	
	}    

  return 0;
}

void primeiraPassada(string * texto, int size) {
    for(int i=0; i<size; i++) {
        int caractere = (*texto)[i];
        if ((caractere >= 65 && caractere <= 90) || (caractere >= 97 && caractere <= 122)) {
			(*texto)[i] += 3;
		}
    }
}

void segundaPassada(string * texto) {
    reverse((*texto).begin(), (*texto).end());
}

void terceiraPassada(string * texto, int size) {
    for(int i=size/2; i<size; i++) {
        (*texto)[i] -= 1;
    }
}