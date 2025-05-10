#include <iostream>
using namespace std;
#define PRECOSUCO 5
#define PRECOBALINHA 10
#define LUCROSUCO 0.2
#define LUCROBALINHA 0.5
int main() {
	/*A empresa COMPRE MAIS decidiu fazer um programa para auxiliar nos calculos das compras dos seus principais produtos no dia: suco de jabuticaba e balinha de gengibre. 
	Faca um programa que leia: a quantidade de sucos de jabuticaba vendidos a quantidade de balinhas de gengibre vendidas. 
	Apos isso, calcule e escreva o valor total de lucro na venda desses	dois produtos. 
	A empresa tem uma margem de lucro de 20% nos sucos e 50% nas balinhas.
	1. Valor do suco de jabuticaba:5 reais
	2. Valor da balinha de gengibre: 10 reais*/
	int sucoJabuticaba, balinhaGengibre;
	float lucroTotalSuco, lucroTotalBalinha, lucroTotal;
	
	cout<<"Ola, qual a quantidade de 'suco de jabuticaba' vendidos?"<<endl; //mostrar na tela
	cin>>sucoJabuticaba; //receber do usuario
	cout<<"Qual a quantidade de 'balinha de gengibre' vendidos?"<<endl; //mostrar na tela
	cin>>balinhaGengibre; //receber do usuario
	lucroTotalSuco = (sucoJabuticaba * PRECOSUCO) * LUCROSUCO; //calculo do lucro da venda dos sucos
	lucroTotalBalinha = (balinhaGengibre * PRECOBALINHA) * LUCROBALINHA; //calculo do lucro da venda das balinhas
	lucroTotal = lucroTotalSuco + lucroTotalBalinha; //calculo do lucro total das vendas
	cout<<"O valor do lucro arrecadado na venda dos sucos foi de "<<lucroTotalSuco<<" reais."<<endl; //mostrar na tela
	cout<<"O valor do lucro arrecadado na venda das balinhas foi de "<<lucroTotalBalinha<<" reais."<<endl; //mostrar na tela
	cout<<"O valor total do lucro arrecadado foi de "<<lucroTotal<<" reais."<<endl; //mostrar na tela
}
