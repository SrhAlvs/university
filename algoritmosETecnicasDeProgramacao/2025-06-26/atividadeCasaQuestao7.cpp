#include<iostream>
#include<locale.h>
using namespace std; 
int main() {
	setlocale (LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questão 7:
	Faça um programa em C++ que leia 15 números inteiros e verifique 
	se o primeiro numero lido é múltiplo do último número lido. 
	Ao final, o programa deve imprimir uma mensagem indicando 
	o resultado da verificação.*/
	int num, primeiro, ultimo, multiplo;
	for (int i=1; i<=15; i++) {
		cout<<"Digite o "<<i<<"º número: ";
		cin>>num;
		if (i==1) {
			primeiro = num;
		}
		if (i==15) {
			ultimo = num;
		}
	}
	multiplo = primeiro%ultimo;
	if (multiplo == 0) {
		cout<<"O primeiro número é múltiplo do último número."<<endl;
	} else {
		cout<<"O primeiro número não é múltiplo do último número."<<endl;
	}
}
