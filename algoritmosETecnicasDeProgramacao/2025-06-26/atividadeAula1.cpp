#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Determina��o da Maior Nota de um Conjunto de Alunos
	� O objetivo deste programa � identificar a maior nota de um conjunto de
	alunos em uma turma.
	� Requisitos do Programa:
	� O programa deve solicitar ao usu�rio que insira a nota de cada aluno.
	� A cada nova nota inserida, o programa deve verificar se a nota � v�lida.
	� Notas v�lidas: n�meros entre 0 e 10, inclusive.
	� Notas inv�lidas: qualquer valor que n�o esteja entre 0 e 10.
	� O programa deve continuar solicitando notas at� que uma nota inv�lida
	seja digitada.
	� Sa�da:
	� Ao final da execu��o, o programa deve imprimir:
	� A maior nota dentre todas as notas v�lidas digitadas.*/
	float nota, maiorNota;
	cout<<"Insira a nota do aluno: ";
	cin>>nota;
	maiorNota = nota;
	while ((nota>=0) && (nota<=10)) {
		if (nota > maiorNota) {
			maiorNota = nota;
		}
		cout<<"Insira a nota do aluno: ";
		cin>>nota;
	}
	cout<<"A maior nota �: "<<maiorNota;
}
