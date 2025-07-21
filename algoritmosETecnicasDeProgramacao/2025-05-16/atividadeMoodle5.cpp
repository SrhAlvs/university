#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Lista de exercícios 1: questão 5
	Um professor aplica um prova de recuperacao substitutiva na turma, para alunos que tiram
	menos que 6 na prova regular. Faca um programa em C++ que leia o nome e a nota da
	prova regular de um aluno. Caso necessario, leia tambem a nota da prova substitutiva e
	imprima:
	(a) a nota final do estudante
	(b) a situacao: 'aprovado' ou 'reprovado'*/
	string nome;
	float prova;
	
	cout<<"Nome do aluno: ";
	cin>>nome;
	cout<<"Nota da prova: ";
	cin>>prova;
	
	if (prova < 6) {
		cout<<"Nota da prova substitutiva: ";
		cin>>prova;
	}
	cout<<"Nota final do estudante: "<<prova<<endl;
	
	if (prova >= 6) {
		cout<<"Aluno aprovado!"<<endl;
	} else {
		cout<<"Aluno reprovado!"<<endl;
	}
}
