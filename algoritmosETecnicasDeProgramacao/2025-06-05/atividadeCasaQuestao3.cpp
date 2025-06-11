#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 3:
	Uma Progressao Aritmetica (PA) e uma sequencia numerica em que a 
	diferenca entre dois termos consecutivos e sempre constante. Essa diferenca 
	e chamada de razao da PA. Os elementos de uma PA sao definidos por:
	• a1: primeiro termo da sequencia
	• r: razao (diferenca entre termos consecutivos)
	Faca um programa em C++ que:
	• Leia o valor inicial (a1) e a razao (r) da PA
	• Calcule e imprima os 10 proximos termos da progressao*/
	float a1, r, an;
	cout<<"Insira o valor do primeiro termo da sequencia: ";
	cin>>a1;
	cout<<"Insira o valor da razao da Progressao Aritmetica: ";
	cin>>r;
	for (int n=1; n<=10; n++) {
		an = a1 + (n-1)*r;
		cout<<"Termo "<<n<<": "<<an<<endl;
	}
}
