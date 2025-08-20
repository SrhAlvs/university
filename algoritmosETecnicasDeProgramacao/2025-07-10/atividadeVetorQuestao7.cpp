#include <iostream>
#include <locale.h>
using namespace std;
int main()
{
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 07:
	Faça um programa que leia 2 vetores A e B e verifique
	quantos elementos de A aparecem em B.*/

	float a[5], b[5];
	int cont = 0;

	cout << "Digite os 5 valores do vetor a: ";
	for (int i = 0; i < 5; i++)
		cin >> a[i];

	cout << "Digite os 5 valores do vetor b: ";
	for (int i = 0; i < 5; i++)
		cin >> b[i];

	for (int i = 0; i < 5; i++)
	{
		bool achou = false;

		for (int j = 0; j < 5; j++)
			if (a[i] == b[j])
				achou = true;
		// conta quantas vezes o 'a' aparece em 'b'
		//(a[j] == b[i]) conta quantas vezes o 'b' aparece em 'a'

		if (achou == true)
			cont++;
	}

	cout << "Número de elementos: " << cont << endl;
}