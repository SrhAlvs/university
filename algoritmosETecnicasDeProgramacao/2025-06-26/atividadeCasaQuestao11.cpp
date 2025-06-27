#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questão 11:
	Uma escola deseja fazer um levantamento sobre o desempenho dos alunos de 
	uma turma ao final do semestre. Para isso, é necessário criar um programa 
	que leia os dados de 25 alunos, considerando:
	• Nome do aluno (sem espaços),
	• Nota final (valor real de 0 a 10),
	• Frequência (valor percentual de 0 a 100).
	Seu programa deve calcular e imprimir:
	• A quantidade de alunos que tiraram nota máxima (nota igual a 10),
	• A quantidade de alunos reprovados.
	Critérios de reprovaçãao:
	• Nota final menor que 6, ou
	• Frequência menor que 75%.*/
	int frequencia, notaMax=0, quantReprovacoes=0;
	float nota;
	string nome;
	for (int i=1; i<=25; i++) {
		cout<<"\nNome do aluno: ";
		cin>>nome;
		cout<<"Nota final (de 0 a 10): ";
		cin>>nota;
		cout<<"Percentual de frequência (de 0 a 100): ";
		cin>>frequencia;
		if (nota<6 || frequencia<75){
			quantReprovacoes++;
		} else if (nota == 10) {
			notaMax++;
		}
		/*Fiquei em dúvida nessa parte, eu poderia colocar o programa para 
		contar quem tirou nota máxima mesmo que essa pessoa tenha uma 
		frequência baixa, de toda forma ela estaria reprovada. 
		Nesse caso faz o quê? Manda pro Conselho? kkkkkkkkkk*/
	}
	cout<<"\nQuantidade de alunos que tiraram nota máxima: "<<notaMax;
	cout<<"\nQuantidade de alunos reprovados: "<<quantReprovacoes;
}
