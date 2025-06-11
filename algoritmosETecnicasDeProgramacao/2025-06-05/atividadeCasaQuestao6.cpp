#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 6:
	Faca um programa em C++ que leia tres numeros e imprima 
	os intervalos entre o primeiro e o segundo e o primeiro e o terceiro.
	
	Fiquei em duvida se era para imprimir todos os numeros inteiros 
	entre o primeiro e o segundo e o primeiro e o terceiro, ou se
	era para imprimir o "tamanho" do intervalo. Como a segunda opcao 
	não precisaria usar o 'for', fiz de acordo com a primeira!*/
	int num1, num2, num3;
	cout<<"Insira os 3 valores: ";
	cin>>num1>>num2>>num3;
	cout<<"Numeros entre "<<num1<<" e "<<num2<<": ";
	for (int i=num1; i<(num2-1); i++) {
		num1 = num1 + 1;
		cout<<num1<<" ";
	}
	cout<<"\nNumeros entre "<<num2<<" e "<<num3<<": ";
	for (int i=num2; i<(num3-1); i++) {
		num2 = num2 + 1;
		cout<<num2<<" ";
	}
}
