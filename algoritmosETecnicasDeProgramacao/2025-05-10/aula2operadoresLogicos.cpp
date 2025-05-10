#include <iostream>
using namespace std;
int main(){
	/*Faca um programa que leia as 2 notas de avaliacao (considerar media aritmetica) e o percentual de faltas. 
	Imprima a nota final.
	Parabenize se a pessoa foi aprovada na disciplina!*/
	float nota1, nota2, notaFinal;
	int numFaltas;
	
	cout<<"Digite a primeira nota: ";
	cin>>nota1;
	cout<<"Digite a segunda nota: ";
	cin>>nota2;
	cout<<"Digite o percentual de faltas: ";
	cin>>numFaltas;
	notaFinal = (nota1 + nota2)/2;
	cout<<"Nota final: "<<notaFinal<<endl;
	if (notaFinal > 6 && numFaltas < 25){
		cout<<"Parabens!"<<endl;
		cout<<"Voce arrasou!"<<endl;
	}
}
