#include<iostream>
#include<locale.h>
using namespace std; 
int main() {
	setlocale (LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Quest�o 7:
	Fa�a um programa em C++ que leia 15 n�meros inteiros e verifique 
	se o primeiro numero lido � m�ltiplo do �ltimo n�mero lido. 
	Ao final, o programa deve imprimir uma mensagem indicando 
	o resultado da verifica��o.*/
	int num, primeiro, ultimo, multiplo;
	for (int i=1; i<=15; i++) {
		cout<<"Digite o "<<i<<"� n�mero: ";
		cin>>num;
		if (i==1) {
			primeiro = num;
		}
		if (i==15) {
			ultimo = num;
		}
	}
	multiplo = primeiro%ultimo;
	if (multiplo == 0) {
		cout<<"O primeiro n�mero � m�ltiplo do �ltimo n�mero."<<endl;
	} else {
		cout<<"O primeiro n�mero n�o � m�ltiplo do �ltimo n�mero."<<endl;
	}
}
