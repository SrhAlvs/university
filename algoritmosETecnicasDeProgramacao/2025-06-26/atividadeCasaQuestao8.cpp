#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questão 8:
	A mediana de um conjunto de números ordenados é o número que ocupa a posição central.
	Faça um programa em C++ que leia uma sequência de 11 números inteiros já ordenados
	(em ordem crescente ou decrescente). O programa deve:
	• Calcular o valor da mediana,
	• Verificar se a mediana é maior ou igual À metade do maior valor da lista,
	• Imprimir o valor da mediana e o resultado da verificação.*/
	int num, mediana, numMaior;
	cout<<"Digite o número: ";
	cin>>num;
	numMaior = num;
	for(int i=1; i<=10; i++) {
		cout<<"Digite o número: ";
		cin>>num;
		if(num>numMaior) {
			numMaior = num;
		}
		if(i==5) {
			mediana = num;
		}
	}
	cout<<"Mediana: "<<mediana<<endl;
	if(mediana >= numMaior/2.) { //2.0: dividir um int por um float transforma o int em float, aí divisões com números ímpares darão certo
		cout<<"A mediana é maior ou igual a metade do maior valor."<<endl;
	} else {
		cout<<"A mediana é menor que a metade do maior valor."<<endl;
	}
}
