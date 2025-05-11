#include <iostream>
using namespace std; 
int main(){
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 3:
	Faca um programa em C++ que leia dois numeros inteiros (a e b) e imprima:
	(a) a + b^2
	(b) a^2 - b
	(c) (resto da divisao) a mod b*/
	int a, b, resultadoA, resultadoB, resultadoC;
	
	cout<<"Digite o valor do primeiro numero: ";
	cin>>a;
	cout<<"Digite o valor do segundo numero: ";
	cin>>b;
	resultadoA = a + (b * b);
	resultadoB = (a * a) - b;
	cout<<"Resultado (a): "<<resultadoA<<endl;
	cout<<"Resultado (b): "<<resultadoB<<endl;
	if (b != 0) {
    	resultadoC = a % b;
    	cout<<"Resultado (c): "<<resultadoC<<endl;
	} else {
	    cout<<"Resultado (c): ERRO: nao existe divisao por zero."<< endl;
	}
}
