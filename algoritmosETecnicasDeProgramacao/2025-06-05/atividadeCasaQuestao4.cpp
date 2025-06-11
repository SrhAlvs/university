#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 4:
	Faca um programa em C++ que leia um conjunto de 
	10 elementos e imprima a soma deles.*/
	float num, aux, total;
	aux = 0;
	cout<<"Insira 10 valores: "<<endl;
	for(int i=0; i<10; i++) {
		cin>>num;
		total = aux + num;
		aux = total;
	}
	cout<<"Total: "<<aux<<endl;
}
