#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Lista de exercícios 1: questão 6
	Faca um programa em C++ que leia as notas de 5 alunos e imprima a maior nota.
	(a) imprima tambem a segunda maior nota.*/
	float nota1, nota2, nota3, nota4, nota5, maior, segMaior;
	
	cout<<"Insira as notas dos 5 alunos: "<<endl;
	cin>>nota1>>nota2>>nota3>>nota4>>nota5;
	
	maior = nota1;
	if (maior < nota2)
		maior = nota2;
	if (maior < nota3)
		maior = nota3;
	if (maior < nota4)
		maior = nota4;
	if (maior < nota5)
		maior = nota5;
	cout<<"Maior nota: "<<maior<<endl;
	
	segMaior = nota1;
	if ((segMaior < nota2) && (nota2 != maior)) {
		segMaior = nota2;
	} 
	if ((segMaior < nota3) && (nota3 != maior)) {
		segMaior = nota3;
	} 
	if ((segMaior < nota4) && (nota4 != maior)) {
		segMaior = nota4;
	} 
	if ((segMaior < nota5) && (nota5 != maior)) {
		segMaior = nota5;
	}
	cout<<"Segunda maior nota: "<<segMaior<<endl;
}
