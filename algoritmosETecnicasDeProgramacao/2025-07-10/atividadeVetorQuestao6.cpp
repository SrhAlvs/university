#include <iostream>
#include <locale.h>
using namespace std;
int main()
{
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 06:
	Em um mercado foi realizada a oferta para aniversariantes do mês e
	pessoas cujo nome começa com uma determinada letra.
	Faça um programa que leia o mês atual e a letra promocional.
	Após isso, leia também, para 10 pessoas:
	nome de uma pessoa, a data de nascimento (dia, mês e ano).
	Imprima, quantas pessoas serão beneficiadas pela promoção.*/
	int mesAtual, dataNascimento[3], beneficiados = 0;
	char letraPromocional;
	string nome;

	cout << "Digite o mês atual: ";
	cin >> mesAtual;
	cout << "Digite a letra promocional (maiúscula): ";
	cin >> letraPromocional;

	for (int i = 0; i < 10; i++)
	{
		cout << "\nNome do funcionário (comece por letra maiúscula): ";
		cin >> nome;
		cout << "Data de nascimento (dia mês ano): ";
		for (int j = 0; j < 3; j++)
			cin >> dataNascimento[j];
		if ((dataNascimento[1] == mesAtual) || (nome[0] == letraPromocional))
			beneficiados++;
	}

	cout << "\nBeneficiados: " << beneficiados;
}