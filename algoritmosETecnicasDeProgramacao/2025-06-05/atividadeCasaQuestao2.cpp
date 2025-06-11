#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 2:
	Faca um programa em C++ que leia o horario de entrada (horas, minutos e 
	segundos) e saida (horas, minutos e segundos) de uma lista de competidores 
	e imprima para cada um deles o tempo (em minutos e segundos) gasto no percurso.
	• O programa deve ler o numero total de competidores
	• Para cada competidor, ler:
		– Nome (ou numero de identificacao)
		– Horario de entrada (no formato HH MM SS)
		– Horario de saida (no formato HH MM SS)
	• Calcular a diferenca entre os horarios de saida e entrada
	• Exibir para cada competidor:
		– Nome/Identificacao
		– Tempo total no formato MM:SS
	• Considerar que nenhum competidor levara mais de 24 horas 
	para completar o percurso*/
	int e, identifyNumber, startH, startM, startS, endH, endM, endS, totalTime, totalM, totalS;
	cout<<"Insira o numero total de competidores: ";
	cin>>e;
	for (i=0; i<e; i++) {
		cout<<"Insira o numero de identificacao do competidor: ";
		cin>>identifyNumber;
		cout<<"Insira o horario de entrada (no formato HH MM SS): ";
		cin>>startH>>startM>>startS;
		cout<<"Insira o horario de saida (no formato HH MM SS): ";
		cin>>endH>>endM>>endS;
		totalTime = ((endH - startH)*3600) + ((endM - startM)*60) + (endS - startS);
		totalM = totalTime/60;
		totalS = totalTime%60;
		cout<<"Competidor "<<identifyNumber<<": "<<totalM<<":"<<totalS<<"\n"<<endl;
	}
}
