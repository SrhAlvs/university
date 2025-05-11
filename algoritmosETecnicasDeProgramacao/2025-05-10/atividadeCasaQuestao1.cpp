#include <iostream>
using namespace std;
int main(){
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 1:
	Faca um programa em C++ que leia 
	a quantidade de horas de trabalho de uma maquina 
	e converta em quantos dias e meses.*/
	int horasTrabalhadas, diasTotais, mesesTrabalhados, diasTrabalhados;
	
	cout<<"Digite a quantidade de horas trabalhadas: ";
	cin>>horasTrabalhadas;
	diasTotais = horasTrabalhadas/24;
	mesesTrabalhados = diasTotais/30; //considerando que todos os meses tenham 30 dias
	diasTrabalhados = diasTotais%30;
	cout<<"A maquina em questao trabalhou por "<<mesesTrabalhados<<" meses e "<<diasTrabalhados<<" dias."<<endl;
}
