#include <iostream>
#include <locale.h>
using namespace std;
int main () {
	setlocale (LC_ALL, "Portuguese");
	/*O caixa de uma empresea realiza opera��es de d�bitos e cr�ditos em dinheiro.
	D�bitos (tipo 1) incluem sa�das de caixa, como troco.
	Cr�ditos (tipo 2) incluem entradas de caixa, como pagamentos.
	Implemente um programa que:
	1. Leia o valor inicial do caixa;
	2. Receba uma sequ�ncia de opera��es
	*/
	int operacao;
	float valorInicial, valorFinal, valor;
	cout<<"Valor inicial do caixa: ";
	cin>>valorInicial;
	valorFinal = valorInicial;
	cout<<"\nOperacao (1 para d�bito, 2 para cr�dito): ";
	cin>>operacao;
	while (operacao != -1) {
		cout<<"Valor: ";
		cin>>valor;
		if (operacao == 1) 
			valorFinal -= valor;
		if (operacao == 2)
			valorFinal += valor;
		cout<<"\nOperacao (1 para d�bito, 2 para cr�dito): ";
		cin>>operacao;
	}
	cout<<"Valor final do caixa: "<<valorFinal<<endl;
}
