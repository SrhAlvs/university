#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Lista de exercícios 1: questão 3
	Faca um programa em C++ que leia um numero x e imprima se ele e par ou impar.*/
	int x, pOuI;
	
	cout<<"Insira um valor: ";
	cin>>x;
	pOuI = x%2;
	
	if (pOuI == 0) {
		cout<<"Numero par."<<endl;
	} else {
		cout<<"Numero impar."<<endl;
	}
}
