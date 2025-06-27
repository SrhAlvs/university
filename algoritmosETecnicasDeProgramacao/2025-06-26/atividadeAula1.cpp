#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Determinação da Maior Nota de um Conjunto de Alunos
	• O objetivo deste programa é identificar a maior nota de um conjunto de
	alunos em uma turma.
	• Requisitos do Programa:
	• O programa deve solicitar ao usuário que insira a nota de cada aluno.
	• A cada nova nota inserida, o programa deve verificar se a nota é válida.
	• Notas válidas: números entre 0 e 10, inclusive.
	• Notas inválidas: qualquer valor que não esteja entre 0 e 10.
	• O programa deve continuar solicitando notas até que uma nota inválida
	seja digitada.
	• Saída:
	• Ao final da execução, o programa deve imprimir:
	• A maior nota dentre todas as notas válidas digitadas.*/
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
	cout<<"A maior nota é: "<<maiorNota;
}
