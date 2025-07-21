#include <iostream>
#include <locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 01:
	Façaa um programa que leia o tamanho do vetor A e os elementos de A. 
	Leia também um número N e imprima: quantos elementos de A são maiores que N.*/
	int tamanho=1, maiorQueN=0;
	float N;
	
	cout<<"Insira o tamanho do vetor: ";
	cin>>tamanho;
	float A[tamanho];
	
	cout<<"Insira um número N: ";
	cin>>N;
	
	for (int i=0; i<tamanho; i++) {
		cout<<"Elemento "<<i+1<<": ";
		cin>>A[i];
		
		if (A[i]>N) {
			maiorQueN++;
		}
	}
	
	cout<<"Elementos maiores que o número N: "<<maiorQueN<<endl;
}
