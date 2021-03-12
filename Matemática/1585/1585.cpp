#include <iostream>

using namespace std;

int main()
{
    int qtdTestes;
    cin >> qtdTestes;
    
    while(qtdTestes--) {
        short x, y;
        cin >> x >> y;
        
        cout << (x*y) / 2 << " cm2\n";
    }
    return 0;
}