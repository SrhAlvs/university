#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Lista de exercícios 1: questão 1
	Faca um programa em C++ que leia 3 numeros: A, B e C. E imprima:
	(a) Se eles fazem um triangulo: soma de dois lados quaisquer eh maior que o outro lado.
	(b) Se o triaangulo eh equilatero.*/
	float num1, num2, num3, sum12, sum23, sum13;
	
	cout<<"Digite o primeiro numero: ";
	cin>>num1;
	cout<<"Digite o segundo numero: ";
	cin>>num2;
	cout<<"Digite o terceiro numero: ";
	cin>>num3;
	
	sum12 = num1 + num2;
	sum23 = num2 + num3;
	sum13 = num1 + num3;
	
	if ((sum12, sum23, sum13) == 0) {
		cout<<"Os valores inseridos nao formam um triangulo."<<endl;
	} else if ((sum12 == sum23) && (sum23 == sum13) && (sum12 == sum13)) {
		cout<<"Os valores inseridos formam um triangulo equilatero."<<endl;
	} else if ((sum12 > num3) && (sum23 > num1) && (sum12 > num3)) {
		cout<<"Os valores inseridos formam um triangulo."<<endl;
	} else {
		cout<<"Os valores inseridos nao formam um triangulo."<<endl;
	}
}
