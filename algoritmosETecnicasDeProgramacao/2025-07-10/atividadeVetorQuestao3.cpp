#include <iostream>
#include <locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 03:
	Faça um programa que leia as notas de 5 alunos da turma A
	e 5 alunos da turma B e imprima quantos da turma A tiveram
	nota maior, que o aluno com a maior nota da turma B.*/
	float A[5], B[5], maiorNotaB, bonsA=0;
	
	cout<<"Insira as notas dos alunos da turma A: ";
	for (int i=0; i<5; i++) {
		cin>>A[i];
	}
	
	cout<<"\nInsira as notas dos alunos da turma B: ";
	for (int i=0; i<5; i++) {
		cin>>B[i];
	}
	
	maiorNotaB = B[0];
	for (int i=1; i<5; i++) {
		if (B[i] > maiorNotaB) {
			maiorNotaB = B[i];
		}
	}
	
	for (int i=0; i<5; i++) {
		if (A[i]>maiorNotaB) {
			bonsA++;
		}
	}
	
	cout<<"\nQuantidade de alunos da turma A que tiraram nota maior que a maior nota da turma B: "<<bonsA<<endl;
}
