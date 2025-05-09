#include <iostream>
#define UMALGODAODOCE 50
using namespace std;
main (){
	/*Joaninha comprou muito acucar para fazer algodao doce.
	Faca um programa que leia quantos gramas de acucar ela comprou e imprima quantos algodoes doces ela consegue fazer com aquela quantidade. 
	Sabendo que cada algodao doce gasta 50 gramas de acucar.*/
	int quantidadeAcucarKG, quantidadeAcucarG, quantidadeTotal;
	
	cout<<"Insira a quantidades de acucar comprado (em quilogramas): "<<endl; //mostrar na tela
	cin>>quantidadeAcucarKG; //receber do usuario
	quantidadeAcucarG = quantidadeAcucarKG*1000; //calculo da conversao de KG para G
	quantidadeTotal = quantidadeAcucarG/UMALGODAODOCE; //calculo da quantidade de algodao doce que pode ser feito
	cout<<"Com essa quantidade de acucar sera possivel fazer "<<quantidadeTotal<<" algodoes doces."<<endl; //mostrar na tela
}
