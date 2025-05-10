#include <iostream>
using namespace std;
int main(){
	/*Faca um programa que leia o gasto em roupa e em sapatos.
	Calcule o valor final da compra.
	A loja da 10% de desconto quando o valor supera 500 reais.*/
	float vRoupas, vSapatos, vTotal;
	
	cout<<"Digite o valor gasto em roupas: "; //mostrar na tela
	cin>>vRoupas; //receber do usuario
	cout<<"Digite o valor gasto em sapatos: "; //mostrar na tela
	cin>>vSapatos; //receber do usuario
	vTotal = vRoupas + vSapatos; //calculo do valor total
	if (vTotal > 500) //condicao com desconto
		vTotal = vTotal * 0.9; //calculo do desconto
	cout<<"Valor total da compra: "<<vTotal<<endl; //mostrar na tela
}
