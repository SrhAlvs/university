#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Quest�o 8:
	A mediana de um conjunto de n�meros ordenados � o n�mero que ocupa a posi��o central.
	Fa�a um programa em C++ que leia uma sequ�ncia de 11 n�meros inteiros j� ordenados
	(em ordem crescente ou decrescente). O programa deve:
	� Calcular o valor da mediana,
	� Verificar se a mediana � maior ou igual � metade do maior valor da lista,
	� Imprimir o valor da mediana e o resultado da verifica��o.*/
	int num, mediana, numMaior;
	cout<<"Digite o n�mero: ";
	cin>>num;
	numMaior = num;
	for(int i=1; i<=10; i++) {
		cout<<"Digite o n�mero: ";
		cin>>num;
		if(num>numMaior) {
			numMaior = num;
		}
		if(i==5) {
			mediana = num;
		}
	}
	cout<<"Mediana: "<<mediana<<endl;
	if(mediana >= numMaior/2.) { //2.0: dividir um int por um float transforma o int em float, a� divis�es com n�meros �mpares dar�o certo
		cout<<"A mediana � maior ou igual a metade do maior valor."<<endl;
	} else {
		cout<<"A mediana � menor que a metade do maior valor."<<endl;
	}
}
