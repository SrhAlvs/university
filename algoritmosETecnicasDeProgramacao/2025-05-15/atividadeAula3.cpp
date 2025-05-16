#include <iostream>
#define FIXO 1000
#define VALORHORA 10
using namespace std;
int main(){
	/*Em uma loja, trabalham vendedores, gerentes e balconistas. 
	Enquanto gerentes e balconistas recebem baseado nas horas trabalhadas os vendedores recebem baseado no total de vendas. 
	Faça um programa que leia o nome e a função de um trabalhador. 
	Caso ele seja vendedor, leia o total de vendas e imprima o total ganho
	(sabendo que ele ganha 1000 reais + 2% de comissão sobre as vendas). 
	Caso seja balconista ou gerente, leia o total de horas trabalhadas e imprima seu salário, 
	sabendo que seu salário é de 10 reais por hora.*/
	string cargo, nome; 
	float totalVendas, totalGanho, horasTrabalhadas, salario;
	cout<<"Digite seu nome: ";
	cin>>nome;
	cout<<"Digite o 'Cargo do Funcionario': ";
	cin>>cargo;
	if(cargo == "vendedor"){
		cout<<"Digite o total de vendas: ";
		cin>>totalVendas;
		totalGanho = FIXO + 0.02*totalVendas;
		cout<<"Ganho do vendedor: "<<totalGanho<<endl;
	} else{
		cout<<"Digite as horas trabalhadas: ";
		cin>>horasTrabalhadas;
		salario = VALORHORA * horasTrabalhadas;
		cout<<"Salario: "<<salario<<endl;
	}
}
