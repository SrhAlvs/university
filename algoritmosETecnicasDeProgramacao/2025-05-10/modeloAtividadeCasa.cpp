#include <iostream>
using namespace std;
int main(){
	/*Faca um programa que leia a quantidade de minutos que uma pessoa passou jogando e converta para horas e minutos.*/
	int minutosJogando, calcHoras, calcMinutos; //minutos jogados
	
	cout<<"Digite a quantidade de minutos jogando: "; //mostrar na tela
	cin>>minutosJogando; //receber do usuario
	calcHoras = minutosJogando/60; //calculo das horas jogadas
	calcMinutos = minutosJogando%60; //calculo dos minutos restantes jogados
	cout<<"Total de horas jogadas: "<<calcHoras<<endl; //mostrar na tela
	cout<<"Total de minutos jogados: "<<calcMinutos<<endl; //mostrar na tela
}
