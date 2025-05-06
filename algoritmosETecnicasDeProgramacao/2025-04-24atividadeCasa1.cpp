#include <iostream>
#include <string>
#define ANOATUAL 2025
using namespace std;
main () {
	/*ENUNCIADO: Fa�a um programa que leia: idade e o nome de uma pessoa.
	Escreva qual ano que ela nasceu.
	Suponha que ela ja fez aniversario esse ano.*/
	string nomeUsuario;
	int idadeUsuario, anoNascimento;

	cout<<"Insira seu nome: "<<endl; //mostrar na tela
	cin>>nomeUsuario; //receber o nome do usuario
	cout<<nomeUsuario<<", insira a sua idade: "<<endl; //mostrar na tela
	cin>>idadeUsuario;
	anoNascimento = ANOATUAL - idadeUsuario;
	cout<<nomeUsuario<<", voce nasceu no ano de "<<anoNascimento<<"."<<endl;
}
