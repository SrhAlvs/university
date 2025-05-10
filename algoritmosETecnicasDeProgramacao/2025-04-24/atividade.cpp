#include <iostream>
#define PRECO 3.99
using namespace std;
int main(){
	//ENUNCIADO: faca um programa em C++ que leia o nome do produto e a quantidade de produtos comprados. No final, imprima o valor da compra. Todo produto, neste mercado, custa 3.99.
	string nomeProduto;
	int quantidade;
	float total;
	
	cout<<"Insira o nome do produto que se deseja comprar: "<<endl; //mostrar na tela
	cin>>nomeProduto; //receber o nome do produto do usuario
	cout<<"Insira a quantidade de produtos que se deseja comprar: "<<endl; //mostrar na tela
	cin>>quantidade; //receber a quantidade de produtos do usuario
	
	total = quantidade * PRECO; //calculo do total a ser pago
	cout<<"O valor total a ser pago do produto '"<<nomeProduto<<"' sera: "<<total<<endl; //mostrar na tela
}
