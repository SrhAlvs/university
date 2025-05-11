#include <iostream>
#define PI 3.1415
using namespace std; 
int main(){
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 7:
	Faca um programa que leia o raio de um circulo e imprima 
	seu diametro, perimetro e area.*/
	float r, d, p, a;
	
	cout<<"Insira o valor do raio do circulo: ";
	cin>>r;
	d = r * 2;
	p = 2 * PI * r;
	a = PI * r * r;
	cout<<"Diametro do circulo: "<<d<<endl;
	cout<<"Perimetro do circulo: "<<p<<endl;
	cout<<"Area do circulo: "<<a<<endl;
}
