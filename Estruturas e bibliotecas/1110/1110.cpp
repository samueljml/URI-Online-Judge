#include <iostream>
#include <vector>

using namespace std;

int main() {
	int tam, i;
	vector<int>::iterator it; 
    while(1){
    	
    	cin >> tam;
	    if(tam == 0) return 0;
	    
	    vector<int> pilha;
    	
	    for(i = 1; i<=tam; i++) pilha.push_back(i);
	    
	    it = pilha.begin();
	    
	    cout << "Discarded cards: ";
	    while(tam != 2){
	    	cout << *it << ", ";
	    	pilha.erase(it);
	    	it += 1;
	    	if(it > pilha.end()) it = pilha.begin()+1;
	    	else if(it == pilha.end()) it = pilha.begin();
	    	tam--;
		}
		cout << *it << endl;
		pilha.erase(it);
		cout << "Remaining card: " << pilha[0] << endl;
	}
}