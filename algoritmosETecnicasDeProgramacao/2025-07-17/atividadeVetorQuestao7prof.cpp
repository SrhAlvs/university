#include <iostream>
#include <locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	//Questão 7 da lista de 'vetor'
	float valor, a[5], b[5];
	int cont = 0;
	
	cout<<"Digite um valor: ";
	cin>>valor;
	
	cout<<"Digite os valores do vetor a: ";
	for(int i=0; i<5; i++){
		cin>>a[i];
	}
	
	cout<<"Digite os valores do vetor b: ";
	for(int i=0; i<5; i++){
		cin>>b[i];
	}
	
	for(int i=0; i<5; i++) {
		bool achou = false;
		
		for(int j=0; j<5; j++) {
			if(a[i] == b[j]) { //conta qunatas vezes o 'a' aparece em 'b'; (a[j] == b[i]) conta quantas vezes o 'b' aparece em 'a'
				achou = true;
			}
		}
		
		if(achou==true) {
			cont++;
		}
	}
	
	
	
	cout<<"Número de elementos: "<<cont<<endl;
}
