#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Quest�o 12:
	Num campeonato de futebol, diversos times est�o competindo entre si. 
	Cada jogo pode terminar em vit�ria (3 pontos para o vencedor), 
	empate (1 ponto para cada time) ou derrota (0 pontos).
	Dois amigos querem acompanhar a pontua��o final de seus times 
	preferidos: o time �B� e o time �S�.
	Sabendo que o empate vale 1 ponto e a vit�ria vale 3 pontos, 
	fa�a um programa em C++ que:
	� Leia 20 resultados de partidas, onde cada resultado cont�m:
	� a inicial do time 1 (uma letra mai�scula),
	� o n�mero de gols do time 1,
	� a inicial do time 2,
	� o n�mero de gols do time 2.
	� Calcule a pontua��o acumulada final do time �B� e do time �S�.
	� Imprima a pontua��o final dos dois times ao final do campeonato.
	(Obs.: o programa deve processar exatamente 20 linhas como essa.)
	Exemplo de sa�da esperada:
	Time B: 4 pontos
	Time S: 3 pontos
	Obs.: seu programa deve considerar apenas os jogos onde o time �B� 
	ou o time �S� participaram, somando os pontos que eles conquistaram 
	nessas partidas.*/
	char time1, time2;
	int gols1, gols2, B=0, S=0;
	for (int i=1; i<=20; i++) {
		cout<<"\nPartida "<<i<<endl;
		cout<<"Inicial do time 1 (em letra mai�scula): ";
		cin>>time1;
		cout<<"N�mero de gols do time 1: ";
		cin>>gols1;
		cout<<"Inicial do time 2 (em letra mai�scula): ";
		cin>>time2;
		cout<<"N�mero de gols do time 2: ";
		cin>>gols2;
		if ((time1=='B' || time1=='S') || (time2=='B' || time2=='S')) {
			if (gols1 == gols2) {
				if (time1=='B' || time2=='B') {
					B++;
				} else if (time1=='S' || time2=='S') {
					S++;
				}
			} else if (gols1 > gols2) {
				if (time1=='B') {
					B = B+3;
				} else if (time1=='S') {
					S = S+3;
				} 
			} else if (gols1 < gols2) {
				if (time2=='B') {
					B = B+3;
				} else if (time2=='S') {
					S = S+3;
				}
			} 
		}
	}
	cout<<"\nTime B: "<<B<<" pontos."<<endl;
	cout<<"Time S: "<<S<<" pontos."<<endl;
}
