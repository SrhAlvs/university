#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questão 9:
	Faça um programa em C++ que leia 10 números inteiros. O programa deve:
	• Identificar o maior número entre os 5 primeiros valores lidos,
	• Identificar o menor número entre os 5 últimos valores lidos,
	• Imprimir ambos os valores.*/
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
	cout<<"Maior número entre os 5 primeiros: "<<maior5pri<<endl;
	cout<<"Menor número entre os 5 últimos: "<<menor5ult<<endl;
}
