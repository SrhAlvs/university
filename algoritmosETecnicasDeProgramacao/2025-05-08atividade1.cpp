#include <iostream>
#define TAXASERVICO 0.1
using namespace std;
main() {
	/*Faca um programa que leia a soma dos itens de um pedido e diga: o valor da taxa de servico (10%) e o valor total da conta*/
	float totalCompra, taxa, totalComTaxa;
	
	cout<<"Olá, digite o valor total da sua compra: "<<endl; //mostrar na tela
	cin>>totalCompra; //receber valor total da compra do usuario
	taxa = totalCompra * TAXASERVICO; //calculo da taxa de servico da compra
	totalComTaxa = totalCompra + taxa; //calculo do total da compra somado ao valor da taxa de servico
	cout<<"Valor da taxa de servico: "<<taxa<<endl; //mostrar na tela
	cout<<"Valor final da compra: "<<totalComTaxa<<endl; //mostrar na tela
}
