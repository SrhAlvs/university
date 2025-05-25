#include <iostream>
using namespace std;
int main () {
	/*Alun@: Sarah Alves Soares do Nascimento.
	Lista de exercícios 1: questão 4
	Faca um programa em C++ que leia o nome e a idade de tres irmaos e imprima o nome do irmao do meio.*/
	string nome1, nome2, nome3, idade1, idade2, idade3;
	
	cout<<"Insira os nomes dos irmaos: ";
	cin>>nome1>>nome2>>nome3;
	cout<<"Insira a idade dos irmaos: ";
	cin>>idade1>>idade2>>idade3;

	if ((idade1 > idade2 && idade1 < idade3) || (idade1 < idade2 && idade1 > idade3)) {
        cout<<"Irmao do meio: "<<nome1<<endl;
    } else if ((idade2 > idade1 && idade2 < idade3) || (idade2 < idade1 && idade2 > idade3)) {
        cout<<"Irmao do meio: "<<nome2<<endl;;
    } else {
        cout<<"Irmao do meio: "<<nome3<<endl;
    }
}
