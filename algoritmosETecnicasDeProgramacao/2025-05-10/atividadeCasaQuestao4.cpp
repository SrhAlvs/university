#include <iostream>
using namespace std;
int main(){
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 4:
	Faca um algoritmo que leia as 3 notas de um aluno 
	e calcule a media final deste aluno.
	(a) Considerar que a media e ponderada 
	e que o peso das notas e: 3,3 e 4, respectivamente.
	(b) Considerar que a media e aritmetica simples.*/
	float nota1, nota2, nota3, mPonderada, mAritmetica;
	
	cout<<"Insira a primeira nota: ";
	cin>>nota1;
	cout<<"Insira a segunda nota: ";
	cin>>nota2;
	cout<<"Insira a terceira nota: ";
	cin>>nota3;
	mPonderada = (nota1*3 + nota2*3 + nota3*4)/10; //10 = 3 + 3 + 4
	mAritmetica = (nota1 + nota2 + nota3)/3;
	cout<<"(a) Nota final (media ponderada): "<<mPonderada<<endl;
	cout<<"(b) Nota final (media aritmetica): "<<mAritmetica<<endl;
}
