#include <iostream>
#include <locale.h>
using namespace std;
int main () {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 01:
	Faça um programa em C++ que leia uma sequência de números e imprima o segundo maior. 
	Seu programa deve parar quando o último número digitado for igual ao último.*/
	int num, ultimo, maior, segMaior;
	cout<<"Insira um número: ";
	cin>>num;
	maior = num;
	while (num != ultimo) {
		ultimo = num;
		if (num > maior) {
			segMaior = maior;
			maior = num;
		}
		cout<<"Insira um número: ";
		cin>>num;
	}
	cout<<"\nSegundo maior número: "<<segMaior<<endl;
}
