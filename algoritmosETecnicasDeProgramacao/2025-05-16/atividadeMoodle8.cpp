#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Lista de exercícios 1: questão 8
	Supondo que este ano, a soma das idades de Aang e Katara e igual a idade de Kyoshi.
	Faca um programa que leia a idade de tres pessoas
	(em ordem aleatoria, ou seja, nao sabemos quem e quem)
	e imprima se eles podem ser Aang, Katara e Kyoshi.*/
	int idade1, idade2, idade3, sum12, sum23, sum13;
	cout<<"Insira a primeira idade: ";
	cin>>idade1;
	cout<<"Insira a segunda idade: ";
	cin>>idade2;
	cout<<"Insira a terceira idade: ";
	cin>>idade3;
	sum12 = idade1 + idade2;
	sum23 = idade2 + idade3;
	sum13 = idade1 + idade3;
	
	if ((sum12 == idade3) || (sum23 == idade1) || (sum13 == idade2)) {
		cout<<"Com as idades inseridas, as tres pessoas podem ser Aang, Katara e Kyoshi!";
	} else {
		cout<<"Com as idades inseridas, as tres pessoas nao podem ser Aang, Katara e Kyoshi!";
	}
}
