#include <iostream>
#include <locale.h>
using namespace std;
int main () {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Quest�o 01:
	Fa�a um programa em C++ que leia uma sequ�ncia de n�meros e imprima o segundo maior. 
	Seu programa deve parar quando o �ltimo n�mero digitado for igual ao �ltimo.*/
	int num, ultimo, maior, segMaior;
	cout<<"Insira um n�mero: ";
	cin>>num;
	maior = num;
	while (num != ultimo) {
		ultimo = num;
		if (num > maior) {
			segMaior = maior;
			maior = num;
		}
		cout<<"Insira um n�mero: ";
		cin>>num;
	}
	cout<<"\nSegundo maior n�mero: "<<segMaior<<endl;
}
