#include <iostream>
using namespace std;
main() {
	//Faca um programa em que o usuario informe (leia) tres números: A, B e C. O programa deve apresentar (escreva): A+B, A*C e B-C.
	float A, B, C, somaAB, subtracaoBC, multiplicacaoAC;
	
	cout<<"Digite o primeiro valor: "<<endl; //mostrar na tela
	cin>>A; //receber valor do usuario
	cout<<"Digite o segundo valor: "<<endl; //mostrar na tela
	cin>>B; //receber valor do usuario
	cout<<"Digite o terceiro valor: "<<endl; //mostrar na tela
	cin>>C; //receber valor do usuario
	somaAB = A + B; //calculo da soma
	subtracaoBC = B - C; //calculo da subtracao
	multiplicacaoAC = A * C; //calculo da multiplicacao
	cout<<"Resultado da soma entre o primeiro e o segundo valor: "<<somaAB<<endl; //mostrar na tela
	cout<<"Resultado da subtracao entre o segundo e o terceiro valor: "<<subtracaoBC<<endl; //mostrar na tela
	cout<<"Resultado da multiplicacao entre o primeiro e o terceiro valor: "<<multiplicacaoAC<<endl; //mostrar na tela
}
