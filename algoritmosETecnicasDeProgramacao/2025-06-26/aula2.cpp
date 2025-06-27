#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Faça um programa que leia, para um grupo de amigos, a idade
	da pessoa e o nome dela. Imprima uma mensagem para as
	pessoas maiores de idade. Calcule a média de idade deste
	grupo de amigos. Seu programa deve parar quando uma idade
	menor que 13 for digitada.*/
	int idade, quant = 0;
	float soma = 0;
	string nome;
	cout<<"Digite a idade: ";
	cin>>idade;
	while (idade>=13) {
		cout<<"Digite o nome: ";
		cin>>nome;
		quant++;
		soma = soma + idade;
		if(idade >= 18) {
			cout<<"Let's get the party started!"<<endl;
		}
		cout<<"Digite a idade: ";
		cin>>idade;
	}
	cout<<"Média das idades: "<<soma/quant;
}
