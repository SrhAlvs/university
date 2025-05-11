#include <iostream>
using namespace std;
int main(){
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 5:
	Um sistema de equacoes lineares do tipo:
	{ax + by = c
	{dx + ey = f
	pode ser resolvido como:
	x = (ce - bf)/(ae - bd)
	y = (af - cd)/(ae - bd)
	Faca um programa que leia os coeficientes a, b, c, d, e e f 
	e imprime os valores de x e y.*/
	float a, b, c, d, e, f, x, y;
	
	cout<<"Insira o valor de a: ";
	cin>>a;
	cout<<"Insira o valor de b: ";
	cin>>b;
	cout<<"Insira o valor de c: ";
	cin>>c;
	cout<<"Insira o valor de d: ";
	cin>>d;
	cout<<"Insira o valor de e: ";
	cin>>e;
	cout<<"Insira o valor de f: ";
	cin>>f;
	if ((a*e - b*d) != 0) {
    	x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d); 
		cout<<"Valor de x: "<<x<<endl;
		cout<<"Valor de y: "<<y<<endl;
	} else {
	    cout<<"ERRO: nao existe divisao por zero."<< endl;
	}
}
