#include <iostream>
using namespace std; 
int main(){
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 6:
	Faca um programa que leia os valores da base e altura 
	de um triangulo e imprima o valor da area deste triangulo. 
	PS: area do triangulo e a base vezes a altura dividido por 2.*/
	float b, h, area;
	
	cout<<"Insira o valor da altura: ";
	cin>>h;
	cout<<"Insira o valor da base: ";
	cin>>b;
	area = (b * h)/2;
	cout<<"A area do triangulo e: "<<area<<endl;
}
