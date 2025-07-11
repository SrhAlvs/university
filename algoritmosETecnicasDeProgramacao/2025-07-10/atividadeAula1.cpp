#include <iostream>
#include <locale.h>
using namespace std;
int main () {
	setlocale (LC_ALL, "Portuguese");
	/*O caixa de uma empresea realiza operações de débitos e créditos em dinheiro.
	Débitos (tipo 1) incluem saídas de caixa, como troco.
	Créditos (tipo 2) incluem entradas de caixa, como pagamentos.
	Implemente um programa que:
	1. Leia o valor inicial do caixa;
	2. Receba uma sequência de operações
	*/
	int operacao;
	float valorInicial, valorFinal, valor;
	cout<<"Valor inicial do caixa: ";
	cin>>valorInicial;
	valorFinal = valorInicial;
	cout<<"\nOperacao (1 para débito, 2 para crédito): ";
	cin>>operacao;
	while (operacao != -1) {
		cout<<"Valor: ";
		cin>>valor;
		if (operacao == 1) 
			valorFinal -= valor;
		if (operacao == 2)
			valorFinal += valor;
		cout<<"\nOperacao (1 para débito, 2 para crédito): ";
		cin>>operacao;
	}
	cout<<"Valor final do caixa: "<<valorFinal<<endl;
}
