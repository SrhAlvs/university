#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	//Exercício 2 do slide 'Aula 6', p. 18/19
	int escolhaKev, escolhaMafer;
	cout<<"Kev e Mafer estão jogando pedra papel ou tesoura."<<endl;
	cout<<"Considere: "<<endl;
	cout<<"  1: pedra"<<endl;
	cout<<"  2: papel"<<endl;
	cout<<"  3: tesoura"<<endl;
	for(int i=1; i<=10; i++) {
		cout<<"\nRodada "<<i<<endl;
		cout<<"   - Escolha de Kev: ";
		cin>>escolhaKev;
		cout<<"   - Escolha de Mafer: ";
		cin>>escolhaMafer;
		if (escolhaKev == escolhaMafer) {
			cout<<"Resultado: empate!"<<endl;
		} else if (((escolhaKev == 1) && (escolhaMafer == 3)) || ((escolhaKev == 2) && (escolhaMafer == 1)) || ((escolhaKev == 3) && (escolhaMafer == 2))) {
			cout<<"Resultado: Kev venceu!"<<endl;
		} else if (((escolhaKev == 1) && (escolhaMafer == 2)) || ((escolhaKev == 2) && (escolhaMafer == 3)) || ((escolhaKev == 3) && (escolhaMafer == 1))) {
			cout<<"Resultado: Mafer venceu!"<<endl;
		} else {
			cout<<"O valor digitado não pertence ao sistema!"<<endl;
		}
	}
}
