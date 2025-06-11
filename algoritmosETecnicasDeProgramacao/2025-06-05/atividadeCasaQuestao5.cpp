#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 5:
	Faca um programa em C++ que leia dois numeros e 
	imprima todos os numeros pares daquele intervalo.*/
	int start, end, pOuI, num, aux;
	cout<<"Insira os valores de inicio e fim do intervalo: ";
	cin>>start>>end;
	pOuI = start%2;
	if (pOuI != 0) {
		num = start + 1;
	} else {
		num = start;
	}
	for (int i=start; num<end; i++) {
		cout<<num<<" "; 
		num = num + 2;
	}
}
