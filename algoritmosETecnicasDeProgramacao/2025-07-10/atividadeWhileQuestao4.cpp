#include <iostream>
#include <locale.h>
using namespace std;
int main () {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 04:
	Faça um programa que:
	1. Leia sequências de três valores (representando possíveis lados 
	de um triângulo);
	2. Para cada sequância lida, verifique se os valores podem formar 
	um triângulo (imprimindo "SIM" ou "NÃO"); 
	3. Repita o processo até que um valor negativo seja lido em qualquer 
	uma das sequências (condição de parada).
	Observação: Lembre-se que para formar um triângulo, a soma de quaisquer 
	dois lados deve ser maior que o terceiro lado (condição triangular).*/
	float lado1, lado2, lado3, soma12, soma23, soma13;

	cout<<"Insira os 3 lados do triângulo: ";
	cin>>lado1>>lado2>>lado3;
		
	while ((lado1>=0) || (lado2>=0) || (lado3>=0)) {
		soma12 = lado1 + lado2;
		soma23 = lado2 + lado3;
		soma13 = lado1 + lado3;
		
		if((soma12<lado3) || (soma23<lado1) || (soma13<lado2)){
			cout<<"Forma um triângulo? NÃO"<<endl;
		} else {
			cout<<"Forma um triângulo? SIM"<<endl;
		}
		
		cout<<"\nInsira os 3 lados do triângulo: ";
		cin>>lado1>>lado2>>lado3;
	}
}
