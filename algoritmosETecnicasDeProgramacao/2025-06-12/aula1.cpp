#include<iostream>
#include<locale.h>
using namespace std;
int main () {
	setlocale(LC_ALL, "Portuguese"); //para aceitar a pontua��o do portugues
	float pontDustin, pontAmigo;
	int cont = 0;
	cout<<"Digite a pontua��o do Dustin: "<<endl;
	cin>>pontDustin;
	cout<<"Digite a pontua��o dos 5 amigos: "<<endl;
	for(int i = 0; i<5; i++) {
		cin>>pontAmigo;
		if(pontAmigo>=pontDustin) {
			cont++;
		}
	}
	cout<<"Quantidade de amigos com pontua��o maior ou igual que a do Dustin: "<<cont<<endl;
}
