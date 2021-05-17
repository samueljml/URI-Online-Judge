#include <iostream>
#include <bits/stdc++.h>

using namespace std;

struct Lista{
	short n[2000];
	short qtdTimes[30000];
	short tam = 0, pos;
	
	void insert(short val){
		if (estaContidoNaLista(val, pos)) qtdTimes[val] += 1;
		else {
			n[tam++] = val;
			qtdTimes[val] = 1;
		}
	}
	bool estaContidoNaLista(short val, short& pos){
		for(int i = 0; i<tam; i++){
			if(n[i] == val) {
				pos = i;
				return true;
			}
		}
		return false;
	}
	void showList(){
		for(int i = 0; i<tam; i++){
			printf("%hd aparece %hd vez(es)\n", n[i], qtdTimes[n[i]]);
		}
	}
	void sortList(){
		sort(n, n + tam);
	}
};

int main (){
	
	int qtdNum;
	short val;
	Lista lista;
	scanf("%d", &qtdNum);
	
	while(qtdNum--){
		scanf("%hd", &val);
		lista.insert(val);
	}
	lista.sortList();
	lista.showList();
}