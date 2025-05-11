#include <iostream>
using namespace std;
int main(){
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questao 2:
	Faca um programa que leia o dia e mes de matricula 
	e o dia e mes atual e apresente: a 
	quantos dias esse estudante esta matriculado. 
	Suponha que ele tenha se matriculado no ano atual. 
	Para a conversao, considere que os meses tem 30 dias.*/
	int diaMatricula, mesMatricula, diaAtual, mesAtual, totalDiasMatricula, totalDiasAtual, diasMatriculado;
	
	cout << "Digite o dia da matricula: ";
    cin >> diaMatricula;
    cout << "Digite o mes da matricula: ";
    cin >> mesMatricula;
    cout << "Digite o dia atual: ";
    cin >> diaAtual;
    cout << "Digite o mes atual: ";
    cin >> mesAtual;
    totalDiasMatricula = (mesMatricula - 1) * 30 + diaMatricula;
    	/*exclui o mes de realizacao da matricula, 
		faz *30 para contar o restante dos dias
		e soma os dias do mes de realizacao da matricula 
		(excluido anteriormente)*/
    totalDiasAtual = (mesAtual - 1) * 30 + diaAtual;
    	/*exclui o mes atual, faz *30 para contar o restante dos dias
		e soma os dias do mes atual*/
	diasMatriculado = totalDiasAtual - totalDiasMatricula;
	cout<<"O usuario esta matriculado a "<<diasMatriculado<<" dias."<<endl;
}
