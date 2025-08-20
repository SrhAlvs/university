#include <iostream>
#include <locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 02:
	Faça um programa que leia as notas de 20 alunos e
	imprima quantos tiraram nota acima da média da turma.*/
	float nota[20], media=0;
	int maiorQueMedia=0;
	
	for (int i=0; i<20; i++) {
		cout<<"Nota "<<i+1<<": ";
		cin>>nota[i];
		media += nota[i];
	}
	
	media = media/20;
	
	for (int i=0; i<20; i++) {
		if (nota[i] > media) {
			maiorQueMedia++;
		}
	}
	
	cout<<"Média da turma: "<<media<<endl;
	cout<<"Alunos com nota acima que a média da turma: "<<maiorQueMedia<<endl;
}
