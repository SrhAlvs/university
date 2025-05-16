#include <iostream>
using namespace std;
int main(){
	/*Ler um numero maior que 100 e menor que 1000
	e imprimir se esse numero e um PALINDROMO*/
	int num, numInvertido, aux, c, d, u;
	cout<<"Digite um numero maior que 100 e menor que 1000: ";
	cin>>num;
	if ((num < 100) || (num >= 1000)){
		cout<<"Numero digitado invalido.";
	} else {
		aux = num;
		c = aux/100; //centena = dividir o numero por 100 (o resultado vem inteiro)
		u = aux%10; //unidade = resto da divisao do numero por 10 
		aux = aux/10; //"isola" a centena e a dezena
		d = aux%10; //dezena = resto da divisao do numero por 10
		numInvertido = c*1 + d*10 + u*100;
		if (num == numInvertido){
			cout<<"O numero eh um palindromo!";
		} else {
			cout<<"O numero nao eh um palindromo!";
		}
		/*OUTRA FORMA DE FAZER (DEPOIS DA LINHA 14)
		if (c == u){
			cout<<"O numero eh um palindromo!";
		} else {
			cout<<"O numero nao eh um palindromo!";
		}
		*/
	}
}
