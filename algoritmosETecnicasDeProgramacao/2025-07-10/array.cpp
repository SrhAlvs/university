#include <iostream>
#include <locale.h>
using namespace std;
int main () {
	setlocale(LC_ALL, "Portuguese");
	/*Fa�a um program que leia a nota de 5 alunos e imprima quantas notas 
	foram maiores que a m�dia de notas.*/
	float nota[4], media, soma=0, alunos=0;
	for (int i=0; i<5; i++) {
		cout<<"Digite a nota: ";
		cin>>nota[i];
		soma += nota[i];
	}
	media = soma/5;
	cout<<"\nM�dia: "<<media<<endl;
	cout<<"Notas maiores que a m�dia de notas: ";
	for (int i=0; i<5; i++) {
		if (nota[i] > media) {
			alunos++;
		}
	}
	cout<<alunos<<endl;
}
