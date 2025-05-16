#include <iostream>
#define BONUS 1000
using namespace std;
int main(){
	/*Em uma loja trabalham vendedores, telefonistas e gerentes, estes últimos recebem 1000 reais de bonificação por mês. 
	Faça um	programa que leia o cargo do funcionário e o ganho semanal e calcule o valor a receber no final do mês. 
	Suponha que um mês tem 4 semanas.*/
	string cargo;
	float ganhoSemanal, salario;
	
	cout<<"Digite o 'Cargo do Funcionario': ";
	cin>>cargo;
	cout<<"Digite seu ganho semanal: ";
	cin>>ganhoSemanal;
	salario = ganhoSemanal * 4;
	if ((cargo == "gerente") || (cargo == "Gerente") || (cargo == "GERENTE"))
		salario = salario + BONUS;
	cout<<"Salario: "<<salario;
}
