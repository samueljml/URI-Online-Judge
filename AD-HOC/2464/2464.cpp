#include <iostream>
#include <string>

using namespace std;

int main() {

    string alfabeto, frase;
    cin >> alfabeto >> frase;
    
    for(int i=0; i<frase.size(); i++){
    	cout << alfabeto[frase[i] - 97];
	}
	cout << endl;
}