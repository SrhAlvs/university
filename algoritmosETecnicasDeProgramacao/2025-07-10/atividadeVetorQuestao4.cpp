#include <iostream>
#include <cmath>
#include <locale.h>
using namespace std;
int main()
{
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 04:
	Faça um programa que o vetor A e o vetor B, cada um com 5 dimensões e
	imprima a distância euclidiana entre eles. A distância euclidiana
	é a soma da diferença ao quadrado de cada uma das posições do vetor.
	Exemplo: vetor A {4, 2, 4} vetor B{1, 6, 4}
		distancia = raiz((4 - 1)^2 + (2 - 6)^2 + (4 - 4)^2)
				  = raiz((3)^2 + (-4)^2 + (0)^2)
				  = raiz(9 + 16 + 0)
				  = raiz(25)
				  = 5*/
	float A[5], B[5], soma = 0, distancia;

	cout << "Insira os valores do vetor A: ";
	for (int i = 0; i < 5; i++)
		cin >> A[i];

	cout << "Insira os valores do vetor B: ";
	for (int i = 0; i < 5; i++)
	{
		cin >> B[i];
		soma += pow((A[i] - B[i]), 2); //`pow` é potência
	}

	distancia = sqrt(soma); //`sqrt` é raiz quadrada
	cout << "A distância entre os vetores A e B é: " << soma;
}