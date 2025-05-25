#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Lista de exercícios 1: questão 7
	Faca um programa em C++ que leia duas datas e imprima a maior.
	O que seria uma data maior? Fica aqui meu questionamento kkkkk*/
	int dia1, dia2, dia, mes1, mes2, mes, ano1, ano2, ano;
	
	cout<<"Insira a primeira data: ";
	cin>>dia1>>mes1>>ano1;
	cout<<"Insira a segunda data: ";
	cin>>dia2>>mes2>>ano2;
	
	dia = dia1;
	mes = mes1;
	ano = ano1;
	
	if (ano < ano2) {
		ano = ano2;
		mes = mes2;
		dia = dia2;
	} else if (ano1 == ano2) {
		if (mes < mes2) {
			ano = ano2;
			mes = mes2;
			dia = dia2;
		} else if (mes1 == mes2) {
			if (dia < dia2) {
				ano = ano2;
				mes = mes2;
				dia = dia2;
			}
		}
	}
	cout<<"Data mais atual: "<<dia<<"/"<<mes<<"/"<<ano;
}
