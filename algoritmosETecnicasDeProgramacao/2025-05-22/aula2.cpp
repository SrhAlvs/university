#include <iostream>
using namespace std;
int main () {
	/*Fliper (jogo).
	Mais detalher no slide da Aula 5, p. 25.*/
	bool P, R;
	cout<<"Jogo: Fliper"<<endl;
	cout<<"Insira '0' ou '1' para as portas a seguir:"<<endl;
	cout<<"Porta P: ";
	cin>>P;
	if (P == false){
		cout<<"A bolinha seguiu pelo caminho C."<<endl;
	} else if (P == true) {
		cout<<"Porta R: ";
		cin>>R;
		if (R == false) {
			cout<<"A bolinha seguiu pelo caminho B."<<endl;
		} else if (R == true) {
			cout<<"A bolinha seguiu pelo caminho A."<<endl;
		}
	}
}
