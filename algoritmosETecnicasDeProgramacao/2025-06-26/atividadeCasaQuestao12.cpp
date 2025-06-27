#include<iostream>
#include<locale.h>
using namespace std;
int main() {
	setlocale(LC_ALL, "Portuguese");
	/*Alun@: Sarah Alves Soares do Nascimento.
	Questão 12:
	Num campeonato de futebol, diversos times estão competindo entre si. 
	Cada jogo pode terminar em vitória (3 pontos para o vencedor), 
	empate (1 ponto para cada time) ou derrota (0 pontos).
	Dois amigos querem acompanhar a pontuação final de seus times 
	preferidos: o time ’B’ e o time ’S’.
	Sabendo que o empate vale 1 ponto e a vitória vale 3 pontos, 
	faça um programa em C++ que:
	• Leia 20 resultados de partidas, onde cada resultado contém:
	– a inicial do time 1 (uma letra maiúscula),
	– o número de gols do time 1,
	– a inicial do time 2,
	– o número de gols do time 2.
	• Calcule a pontuação acumulada final do time ’B’ e do time ’S’.
	• Imprima a pontuação final dos dois times ao final do campeonato.
	(Obs.: o programa deve processar exatamente 20 linhas como essa.)
	Exemplo de saída esperada:
	Time B: 4 pontos
	Time S: 3 pontos
	Obs.: seu programa deve considerar apenas os jogos onde o time ’B’ 
	ou o time ’S’ participaram, somando os pontos que eles conquistaram 
	nessas partidas.*/
	char time1, time2;
	int gols1, gols2, B=0, S=0;
	for (int i=1; i<=20; i++) {
		cout<<"\nPartida "<<i<<endl;
		cout<<"Inicial do time 1 (em letra maiúscula): ";
		cin>>time1;
		cout<<"Número de gols do time 1: ";
		cin>>gols1;
		cout<<"Inicial do time 2 (em letra maiúscula): ";
		cin>>time2;
		cout<<"Número de gols do time 2: ";
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
