#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Quest�o 10:
	Para realizar uma visita t�cnica escolar, � necess�rio organizar os 
	documentos para cada aluno. Cada aluno deve entregar:
	� Um termo de responsabilidade (todos os alunos),
	� Uma autoriza��o dos pais (apenas se o aluno for menor de idade).
	Fa�a um programa em C++ que auxilie o professor na prepara��o desses 
	documentos. O programa deve:
	1. Ler a quantidade de folhas necess�rias para imprimir:
	� Uma autoriza��o dos pais,
	� Um termo de responsabilidade.
	2. Ler o n�mero de alunos.
	3. Para cada aluno, ler o nome e a idade.
	Ao final, o programa deve imprimir:
	� Quantos termos de responsabilidade devem ser impressos,
	� Quantas autoriza��es devem ser impressas (somente para menores de idade),
	� O total de folhas que ser�o necess�rias para a impress�o de todos os documentos.*/
	int folhasAut, folhasTermo, numAlunos, idade, quantAut=0, totalFolhas;
	string nome;
	cout<<"N�mero de folhas necess�rias para imprimir a 'Autoriza��o dos Pais': ";
	cin>>folhasAut;
	cout<<"N�mero de folhas necess�rias para imprimir o 'Termo de Responsabilidade': ";
	cin>>folhasTermo;
	cout<<"Quantidade de alunos que v�o � visita t�cnica: ";
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
	cout<<"Devem ser impressos "<<quantAut<<" 'Autoriza��o dos Pais'."<<endl;
	cout<<"Total de folhas necess�rias: "<<totalFolhas;
}
