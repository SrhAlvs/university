#include <iostream>
#include <string>
#define ANOPASSADO 2024
using namespace std;
int main () {
	/*ENUNCIADO: Faca um programa que leia: a idade e o nome de uma pessoa.
	Escreva o ano que ela nasceu. 
	Suponha que ela ainda nao fez aniversario esse ano.*/
	
	string nomeUsuario;
	int idadeUsuario, anoNascimento;
	
	cout<<"Insira seu nome: "<<endl; //mostrar na tela
	cin>>nomeUsuario; //receber o nome do usuario
	cout<<nomeUsuario<<", supondo que ainda nao fez aniversario esse ano, insira a sua idade: "<<endl; //mostrar na tela
	cin>>idadeUsuario;
	anoNascimento = ANOPASSADO - idadeUsuario;
	cout<<nomeUsuario<<", voce nasceu no ano de "<<anoNascimento<<"."<<endl;
}
