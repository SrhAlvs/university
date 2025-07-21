#include <iostream>
#include <locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	//Questão 2 da lista de 'while'
	float primeiro, segundo, razao, paaluno; 
	int contalunos=0;
	cout<<"Digite o primeiro e segundo termos da PA: "<<endl;
	cin>>primeiro>>segundo;
	for(int i=0; i<5; i++) {
		cout<<"Digite o primeiro termo do aluno: ";
		cin>>paaluno;
		float paverdadeira = primeiro;
		bool acertou = false;
		while((paverdadeira==paaluno) && (paverdadeira<90)) {
			cout<<"Digite o termo do aluno: "<<endl;
			cin>>paalunos;
			paverdadeira = paverdadeira + razao;
		}
		if(paverdadeira == paaluno) {
			contalunos++;
		}
	}
	cout<<contalunos<<" alunos acertaram a PA!"<<endl;
}
