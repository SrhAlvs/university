#include <iostream>
#include <locale.h>
using namespace std;
int main () {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 03:
	Em uma prova com quatro questôes, faça um programa que:
	1. Leia o gabarito oficial da prova (4 respostas);
	2. Leia repetidamente:
	- A matrícula de um estudante (número inteiro);
	- As respostas dadas pelo estudante (4 respostas);
	3. Calcule a nota de cada estudante (cada questão correta vale 2.5 pontos);
	4. Ao final, imprima a matrícula do estudante com a maior nota.
	Condição de parada: O programa deve encerrar a leitura quando uma
	matrícula negativa for digitada.*/
	int matricula, melhorAluno=0, j=0;
	float notaFinal[4], maiorNota=0;
	char gabarito[4], resposta[4];
	
	for (int i = 0; i<4; i++){
		notaFinal[i] = 0;
	}
	
	cout<<"Insira as respostas do gabarito oficial (em letra maiúscula): ";
	for (int i = 0; i<4; i++){
		cin>>gabarito[i];
	}
	
	cout<<"\nMatrícula: ";
	cin>>matricula;
		
	while (matricula >= 0) {
		
		cout<<"Respostas: ";
		for (int i = 0; i<4; i++){
			cin>>resposta[i];
			
			if (gabarito[i] == resposta[i]) {
				notaFinal[j] += 2.5;
			}
		}
		
		if (notaFinal[j] > maiorNota) {
			maiorNota = notaFinal[j];
			melhorAluno = matricula;
		}
		
		j++;
		cout<<"\nMatrícula: ";
		cin>>matricula;
	}
	
	cout<<"\nAluno com maior nota: "<<melhorAluno<<endl;
	cout<<"Nota: "<<maiorNota<<endl;
}
