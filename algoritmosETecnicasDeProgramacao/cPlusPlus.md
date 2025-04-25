# Livro referência: pegar no Moodle depois
# Bibliotecas
## `#include <iostream>`
* **i** = input (entrada)
* **o** = output (saída)
* **stream** = fluxo, no caso, vamos trabalhar com fluxos de entradas e saídas
## `#define ALGUMACOISA 0000`
Pense nele como um comando de substituição de texto que o pré-processador do C++ realiza antes da compilação do seu código. Em essência, #define cria uma macro. Uma macro é uma regra que diz ao pré-processador para substituir todas as ocorrências de um determinado identificador (o nome da macro) por um valor específico (o corpo da macro) antes que o compilador traduza o código para linguagem de máquina.
* **define** = "cria" uma palavra-chave/comando
* **ALGUMACOISA** = é o nome da palavra-chave criada, tem que estar em caixa alta (assim, isso é só uma boa prática mesmo)
* **0000** = é o valor atribuído à palavra-chave criada

# Comandos
* `std` = *standart*
* `cin` = *input command* (comando de entrada)
* `cout` = *output command* (comando de saída)
* `endl` = *end line*

## Declaração de variáveis
* `int` = integer (inteiro), cria uma variável inteira
* `float` = cria uma variável que armazena um número real, porém disponibiliza 2 bytes para armazenar o valor atribuído
* `double` = dobro, cria uma variável que armazena um número real, porém armazena o dobro de bytes utilizados no float (utiliza 4)
* `char` = character (caractere), cria uma variável que armazena um único caractere, o caractere deve estar entre aspas simples, exemplo: `char treco: 'N'`
* `string` = cria uma variável que armazena um conjunto de caracteres, que devem estar entre aspas duplas, exemplo: `string coisa: "sdkfh"`

## Operações em numéricos
* `+` = soma
* `-` = subtração
* `/` = divisão
* `*` = multiplicação
* `int x/y` =  divisor inteiro entre os números, exemplo: int 7/3 ==
* `%` = resto da divisão entre dois números inteiros

## Funções
* `main() {}` = função principal do programa, alguns chamam de "função mã