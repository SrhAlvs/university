#include<iostream>
#include<locale.h>
#define SENHA 0666
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	int tentativa, quantTentativas = 1;
	cout<<"Digite sua senha: ";
	cin>>tentativa;
	while ((tentativa != SENHA) && (quantTentativas < 4)) {
		quantTentativas++;
		cout<<"Senha incorreta. Digite sua senha novamente: ";
		cin>>tentativa;
	}
	if (tentativa == SENHA){ 
		cout<<"Senha correta.";
	}
	if (quantTentativas == 4) {
		cout<<"Senha expirada.";
	}
}
