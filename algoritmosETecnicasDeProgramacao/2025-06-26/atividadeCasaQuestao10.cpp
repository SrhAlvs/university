#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questão 10:
	Para realizar uma visita técnica escolar, é necessário organizar os 
	documentos para cada aluno. Cada aluno deve entregar:
	• Um termo de responsabilidade (todos os alunos),
	• Uma autorização dos pais (apenas se o aluno for menor de idade).
	Faça um programa em C++ que auxilie o professor na preparação desses 
	documentos. O programa deve:
	1. Ler a quantidade de folhas necessárias para imprimir:
	• Uma autorização dos pais,
	• Um termo de responsabilidade.
	2. Ler o número de alunos.
	3. Para cada aluno, ler o nome e a idade.
	Ao final, o programa deve imprimir:
	• Quantos termos de responsabilidade devem ser impressos,
	• Quantas autorizações devem ser impressas (somente para menores de idade),
	• O total de folhas que serão necessárias para a impressão de todos os documentos.*/
	int folhasAut, folhasTermo, numAlunos, idade, quantAut=0, totalFolhas;
	string nome;
	cout<<"Número de folhas necessárias para imprimir a 'Autorização dos Pais': ";
	cin>>folhasAut;
	cout<<"Número de folhas necessárias para imprimir o 'Termo de Responsabilidade': ";
	cin>>folhasTermo;
	cout<<"Quantidade de alunos que vão à visita técnica: ";
	cin>>numAlunos;
	for (int i=1; i<=numAlunos; i++) {
		cout<<"Nome do(a) aluno(a): ";
		cin>>nome; 
		cout<<"Idade: ";
		cin>>idade;
		if (idade < 18) {
			quantAut++;
		}
	}
	totalFolhas = numAlunos*folhasTermo + quantAut*folhasAut;
	cout<<"Devem ser impressos "<<numAlunos<<" 'Termo de Responsabilidade'."<<endl;
	cout<<"Devem ser impressos "<<quantAut<<" 'Autorização dos Pais'."<<endl;
	cout<<"Total de folhas necessárias: "<<totalFolhas;
}
