#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Lista de exercícios 1: questão 2
	Seja a equacao do segundo grau: ax^2 + bx + c = 0 
	Faca um programa em C++ que leia os valores dos coeficientes de uma equacao do segundo grau (a, b e c) e imprima:
	(a) Se essa equacao e do segundo grau.
	(b) Se a equacao possui raizes reais.*/
	float a, b, c, delta;
	
	cout<<"Digite o valor de a: ";
	cin>>a;
	cout<<"Digite o valor de b: ";
	cin>>b;
	cout<<"Digite o valor de c: ";
	cin>>c;
	
	if (a == 0) {
		cout<<"Os valores inseridos nao 'formam' uma equacao do segundo grau."<<endl;
	} else {
		delta = b*b - 4*a*c;
		if (delta > 0) {
			cout<<"A equacao eh uma equacao do segundo grau e possui raizes reais."<<endl;
		} else {
			cout<<"A equacao eh uma equacao do segundo grau, mas nao possui raizes reais."<<endl;
		}
	}
}
