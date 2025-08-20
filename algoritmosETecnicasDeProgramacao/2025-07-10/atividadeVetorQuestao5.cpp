#include <iostream>
#include <locale.h>
using namespace std;
int main()
{
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 05:
	Faça um programa que leia as notas e matrículas (int) de 10 candidatos.
	Leia após isso, o ponto de corte e imprima a matrícula dos candidatos
	aprovados no concurso.*/
	int matriculas[10];
	float notas[10], notaCorte;

	for (int i = 0; i < 10; i++)
	{
		cout << "\nMatrícula do candidato: ";
		cin >> matriculas[i];
		cout << "Nota do candidato: ";
		cin >> notas[i];
	}

	cout << "\n----------------------\n";
	cout << "Nota de corte: ";
	cin >> notaCorte;
	cout << "----------------------\n";

	cout << "Candidatos aprovados: " << endl;
	for (int i = 0; i < 10; i++)
	{
		if (notas[i] >= notaCorte)
			cout << matriculas[i] << endl;
	}
}