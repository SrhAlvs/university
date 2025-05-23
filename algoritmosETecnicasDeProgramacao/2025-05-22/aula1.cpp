#include <iostream>
using namespace std;
int main () {
	/*Faca um program que leia 3 numeros n1, n2 e n3 e: 
	a) Imprima se esses valores formam um triangulo.
	b) Tipo do triangulo: equilatero (3 lados iguais), escaleno (todos diferentes) ou isoceles (2 lados iguais).*/
	float n1, n2, n3, sum12, sum23, sum13;
	
	cout<<"Insira o primeiro valor: ";
	cin>>n1;
	cout<<"Insira o segundo valor: ";
	cin>>n2;
	cout<<"Insira o terceiro valor: ";
	cin>>n3;
	sum12 = n1 + n2;
	sum23 = n2 + n3;
	sum13 = n1 + n3;
	
	if ((sum12 > n3) && (sum23 > n1) && (sum13 > n2)) {
		cout<<"Os valores inseridos formam um triangulo."<<endl;
		if ((n1 == n2) && (n2 == n3)) {
			cout<<"Tipo do triangulo: equilatero."<<endl;
		} else if ((n1 != n2) && (n2 != n3)) {
			cout<<"Tipo do triangulo: escaleno."<<endl;
		} else {
			cout<<"Tipo do triangulo: isoceles."<<endl;
		}
	} else {
		cout<<"Os valores inseridos nao formam um triangulo."<<endl;
	}
}
