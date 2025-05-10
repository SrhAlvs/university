#include <iostream>
using namespace std;
int main() {
	//program que faz a media aritmetica de 3 numeros
	float num1, num2, num3, mediaAritmetica;
	
	cout<<"Digite o primeiro numero: "<<endl; //mostrar na tela
	cin>>num1; //receber valor do usuario
	cout<<"Digite o segundo numero: "<<endl; //mostrar na tela
	cin>>num2; //receber valor do usuario
	cout<<"Digite o terceiro numero: "<<endl; //mostrar na tela
	cin>>num3; //receber valor do usuario
	mediaAritmetica = (num1 + num2 + num3)/3; //calculo da media aritmetica dos tres numeros
	cout<<"A media aritmetica entre "<<num1<<", "<<num2<<" e "<<num3<< " resulta em: "<<mediaAritmetica<<endl; //mostrar na tela
}
