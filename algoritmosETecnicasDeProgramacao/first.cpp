#include <iostream>
	/*
		'include': incluir
		'i': 'input': entrada: 'in'
		'o': output': saida: 'out'
		'stream': fluxo
		ou seja: incluir biblioteca de comandos para trabalharmos com fluxos de entradas e saidas
	*/
using namespace std; //usando esse comando nao precisa escrever o 'std' toda vez
main() { //funcao principal
	/* FORMA COM 'std', OU SEJA, SEM O COMANDO DA LINHA 09
		std::cout<<"Hello world!"<<std::endl; 
			'standart'
			'cout': 'out command': a funcao de mostrar na tela e um comando de saida
			'endl': 'end line': fim da linha
	*/
	cout<<"Hello world!"<<endl;
	int idade = 19; //variavel inteira chamada 'idade', que 'recebe' o valor '19'
	/* FORMA DIFICIL/
		cout<<"Idade do usuario: ";
		cout<<idade; //mostrar a variavel 'idade' na tela
		cout<<" anos."<<endl;
	*/
	cout<<"Idade do usuario: "<<idade<<" anos."<<endl; //FORMA FACIL
}
