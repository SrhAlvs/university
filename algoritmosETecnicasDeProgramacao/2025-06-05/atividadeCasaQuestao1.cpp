#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 1:
	Um professor da aula em uma turma de 15 alunos. Faca um programa que 
	leia o nome do aluno e as notas N1 e N2 e imprima o conceito tirado por ele. 
	Sabendo que os conceitos seguem a seguinte escala:
	A = 9.0 <= Media <= 10.0
	B = 7.5 <= Media < 9.0
	C = 6.0 <= Media < 7.5
	D = 4.0 <= Media < 6.0
	E = Media < 4.0 
	O programa deve:
	- Calcular a media aritmetica simples entre N1 e N2
	- Classificar o aluno conforme a tabela acima
	- Exibir o nome do aluno, sua media e o conceito obtido
	- Utilizar estruturas condicionais para determinar o conceito*/
	float n1, n2, media;
	string name;
	char conceito;
	for (int i=0; i<15; i++) {
		cout<<"Insira o nome do(a) aluno(a): ";
		cin>>name;
		cout<<"Insira as notas 1 e 2: "<<endl;
		cin>>n1>>n2;
		media = (n1 + n2)/2;
		if ((media >= 9) && (media <= 10)) {
			conceito = 'A';
		} else if ((media >= 7.5) && (media < 9)) {
			conceito = 'B';
		} else if ((media >= 6) && (media < 7.5)) {
			conceito = 'C';
		} else if ((media >= 4) && (media < 6)) {
			conceito = 'D';
		} else {
			conceito = 'E';
		}
		cout<<"O(A) aluno(a) "<<name<<" obteve media igual a "<<media<<", portanto, o conceito obtido foi: "<<conceito<<"\n"<<endl;
	}
}
