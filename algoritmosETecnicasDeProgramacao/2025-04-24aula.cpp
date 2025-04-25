#include <iostream>
using namespace std;
#define ANOATUAL 2025
main(){
	int idade, xy_; //'xy_' vai ser usado pra calcular o ano de nascimento do usuario
	char moeda = 'R'; //'R' de real
	string nome = "Jose";
	float altura = 1.63, peso = 56.3;
	
	cout<<"Digite seu nome e idade"<<endl; //mostrar na tela
	cin>>nome>>idade; //receber do usuario
	cout<<nome<<" "<<idade<<endl; //mostrar na tela
	
	xy_ = ANOATUAL - idade; //calculo do ano de nascimento
	cout<<"Olha, voce nasceu em: "<<xy_<<endl; //mostrar na tela
}
