#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Quest�o 11:
	Uma escola deseja fazer um levantamento sobre o desempenho dos alunos de 
	uma turma ao final do semestre. Para isso, � necess�rio criar um programa 
	que leia os dados de 25 alunos, considerando:
	� Nome do aluno (sem espa�os),
	� Nota final (valor real de 0 a 10),
	� Frequ�ncia (valor percentual de 0 a 100).
	Seu programa deve calcular e imprimir:
	� A quantidade de alunos que tiraram nota m�xima (nota igual a 10),
	� A quantidade de alunos reprovados.
	Crit�rios de reprova��ao:
	� Nota final menor que 6, ou
	� Frequ�ncia menor que 75%.*/
	int frequencia, notaMax=0, quantReprovacoes=0;
	float nota;
	string nome;
	for (int i=1; i<=25; i++) {
		cout<<"\nNome do aluno: ";
		cin>>nome;
		cout<<"Nota final (de 0 a 10): ";
		cin>>nota;
		cout<<"Percentual de frequ�ncia (de 0 a 100): ";
		cin>>frequencia;
		if (nota<6 || frequencia<75){
			quantReprovacoes++;
		} else if (nota == 10) {
			notaMax++;
		}
		/*Fiquei em d�vida nessa parte, eu poderia colocar o programa para 
		contar quem tirou nota m�xima mesmo que essa pessoa tenha uma 
		frequ�ncia baixa, de toda forma ela estaria reprovada. 
		Nesse caso faz o qu�? Manda pro Conselho? kkkkkkkkkk*/
	}
	cout<<"\nQuantidade de alunos que tiraram nota m�xima: "<<notaMax;
	cout<<"\nQuantidade de alunos reprovados: "<<quantReprovacoes;
}
