#include <iostream>
#include <cmath> //para usar 'sqrt' que é a raiz quadrada
#include <locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	//Questão 4 da lista de 'vetor'
	float a[5], b[5], somainterna=0;
	cout<<"Digite os valores de a: "<<endl;
	//for(int i=0; i<5; cin>>a[i] i++)
	for(int i=0; i<5; i++)
		cin>>a[i]; 
	cout<<"Digite os valores de b: "<<endl;
	//for(int i=0; i<5; cin>>b[i] i++)
	/*for(int i=0; i<5; i++)
		cin>>b[i]; 
	for(int i=0; i<5; i++) 
		somainterna += (a[i] - b[i])*(a[i] - b[i]);*/ 
	//jeito bocó em cima, jeito melhor em baixo
	for(int i=0; i<5; i++) {
		cin>>b[i]; 
		somainterna += (a[i] - b[i])*(a[i] - b[i]);
		//somainterna += pow((a[i] - b[i]), 2); 
		//pow é potencia
	}
	float distancia = sqrt(somainterna);
	//float distancia = pow(somainterna, 1/2);
	cout<<"Distancia: "<<distancia<<endl;
}
