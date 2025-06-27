#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Quest�o 9:
	Fa�a um programa em C++ que leia 10 n�meros inteiros. O programa deve:
	� Identificar o maior n�mero entre os 5 primeiros valores lidos,
	� Identificar o menor n�mero entre os 5 �ltimos valores lidos,
	� Imprimir ambos os valores.*/
	int num, maior5pri, menor5ult;
	for(int i=1; i<=10; i++) {
		cout<<"Insira o valor: ";
		cin>>num;
		if(i==1) {
			maior5pri = num;
		}
		if(i==6) {
			menor5ult = num;
		}
		if(i<=5){
			if(num > maior5pri){
				maior5pri = num;
			}
		} else {
			if(num < menor5ult) {
				menor5ult = num;
			}
		}
	}
	cout<<"Maior n�mero entre os 5 primeiros: "<<maior5pri<<endl;
	cout<<"Menor n�mero entre os 5 �ltimos: "<<menor5ult<<endl;
}
