#include <iostream>
#include <locale.h>
using namespace std;
int main () {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento
	Questão 02:
	Um professor está realizando uma atividade com seus alunos sobre 
	progressão aritmética (PA). Sabendo que, em uma PA, a diferença 
	entre o primeiro e o segundo termo (razão) é a mesma 
	entre quaisquer dois termos consecutivos, façaa um programa que:
	1. Leia os dois primeiros termos da PA;
	2. Leia as sequências fornecidas por 5 alunos (cada sequência deve ser 
	verificada até que um termo ultrapasse 90 ou esteja incorreto);
	3. Imprima quantos alunos acertaram a sequência.
	Observação: Um aluno erra a sequência se:
	- Os valores nâo corresponderem à PA definida inicialmente;
	- Um termo lido for maior que 90 (condição de parada).*/
	float termo1, termo2, razao, diferenca, sequencia, aux;
	int acertos=0;
	
	cout<<"Insira o primeiro termo da Progressão Aritmética: ";
	cin>>termo1;
	cout<<"Insira o segundo termo da Progressão Aritmética: ";
	cin>>termo2;
	
	razao = termo2 - termo1; 
	
	for (int i=0; i<5; i++) {
		cout<<"Insira a sequência (um termo por vez): ";
		cin>>sequencia;
		
		while (((termo2+razao) == sequencia) || ((razao == diferenca) && (sequencia < 90))) {	
			aux = sequencia;
			cin>>sequencia;
			diferenca = sequencia - aux;
		}
		
		if (razao == diferenca) {
			acertos++;
		}
	}
	
	cout<<"Quantidade de alunos que acertaram a PA: "<<acertos<<endl;
}
