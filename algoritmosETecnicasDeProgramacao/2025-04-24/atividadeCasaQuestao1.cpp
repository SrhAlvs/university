#include <iostream>
#include <string>
#define ANOATUAL 2025
using namespace std;
int main () {
	/*ENUNCIADO: Faca um programa que leia: idade e o nome de uma pessoa.
	Escreva qual ano que ela nasceu.
	Suponha que ela ja fez aniversario esse ano.*/
	
	string nomeUsuario;
	int idadeUsuario, anoNascimento;
	
	cout<<"Insira seu nome: "<<endl; //mostrar na tela
	cin>>nomeUsuario; //receber o nome do usuario
	cout<<nomeUsuario<<",supondo que ja tenha feito aniversario esse ano, insira a sua idade: "<<endl; //mostrar na tela
	cin>>idadeUsuario;
	anoNascimento = ANOATUAL - idadeUsuario;
	cout<<nomeUsuario<<", voce nasceu no ano de "<<anoNascimento<<"."<<endl;
}
