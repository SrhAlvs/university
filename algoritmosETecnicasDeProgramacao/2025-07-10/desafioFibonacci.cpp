#include <iostream>
#include <locale.h>
using namespace std;
int main () {
	setlocale (LC_ALL, "Portuguese");
	int num, soma, aux1=1, aux2=1; 
	//curiosidade: no CodeBlocks, n�o entraria no `while`, porque "soma" n�o tem valor nenhum
	//a� l� precisaria colocar "soma=0" em algum local do c�digo
	cout<<"Digite o n�mero (maior que 5): ";
	cin>>num;
	if (num >= 5){
		cout<<aux1<<" ";
		while (soma <= num) {
			cout<<aux2<<" ";
			soma = aux1 + aux2;
			aux1 = aux2;
			aux2 = soma;
		}
	} else {
		cout<<"N�mero inv�lido."<<endl;
	}
}
