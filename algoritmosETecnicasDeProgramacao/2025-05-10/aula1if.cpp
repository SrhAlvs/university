#include <iostream>
#define ANOATUAL 2025
using namespace std;
int main(){
	/*Faca um program que leia o ano de nascimento de uma pessoa e se ela ja fez aniversario ou n�o. Apos isso, imprima a idade dela.*/
	int anoNasc, idade;
	bool fezAniversario;
	
	cout<<"Digite o ano de nascimento da pessoa: "; //mostrar na tela
	cin>>anoNasc; //receber do usuario
	cout<<"Agora digite: "<<endl; //mostrar na tela
	cout<<"0 - caso a pessoa ainda nao tenha feito aniversario esse ano;"<<endl; //mostrar na tela
	cout<<"1 - caso a pessoa ja tenha feito aniversario esse ano."<<endl; //mostrar na tela
	cin>>fezAniversario; //receber do usuario
	idade = ANOATUAL - anoNasc; //calculo da idade, considerando que a pessoa fez aniversario esse ano
	if(!fezAniversario) //condicao para realizar o calculo, caso a pessoa ainda nao tenha feito aniversario esse ano
		//a condicao poderia ser 'fezAniversario == 0' tambem
		idade = ANOATUAL - anoNasc - 1; //calculo da idade, considerando que a pessoa ainda nao tenha feito aniversario
	cout<<"A idade da pessoa eh: "<<idade; //mostrar na tela
}
