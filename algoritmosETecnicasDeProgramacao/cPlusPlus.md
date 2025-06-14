# Livro referência: pegar no Moodle depois
# Bibliotecas
## `#include <iostream>`
* **i** = input (entrada)
* **o** = output (saída)
* **stream** = fluxo, no caso, vamos trabalhar com fluxos de entradas e saídas

## `include <locale.h>`

## `#define ALGUMACOISA 0000`
Pense nele como um comando de substituição de texto que o pré-processador do C++ realiza antes da compilação do seu código. Em essência, #define cria uma macro. Uma macro é uma regra que diz ao pré-processador para substituir todas as ocorrências de um determinado identificador (o nome da macro) por um valor específico (o corpo da macro) antes que o compilador traduza o código para linguagem de máquina.
* **define** = "cria" uma palavra-chave/comando
* **ALGUMACOISA** = é o nome da palavra-chave criada, tem que estar em caixa alta (assim, isso é só uma boa prática mesmo)
* **0000** = é o valor atribuído à palavra-chave criada

# Comandos
* `std` = *standart*
* `cout` = *out command* (comando de saída)
* `cin` = *input command* (comando de entrada)
* `cout` = *output command* (comando de saída)
* `endl` = *end line*

## Declaração de variáveis
* `int` = integer (inteiro), cria uma variável inteira
* `float` = cria uma variável que armazena um número real, porém disponibiliza 2 bytes para armazenar o valor atribuído
* `double` = dobro, cria uma variável que armazena um número real, porém armazena o dobro de bytes utilizados no float (utiliza 4)
* `char` = character (caractere), cria uma variável que armazena um único caractere, o caractere deve estar entre aspas simples, exemplo: `char treco: 'N'`
* `string` = cria uma variável que armazena um conjunto de caracteres, que devem estar entre aspas duplas, exemplo: `string coisa: "sdkfh"`
* `bool` = cria uma variável booleana que recebe apenas 0 e 1

## Operações 
### Aritméticas
* `+` = soma
* `-` = subtração
* `/` = divisão
* `*` = multiplicação
* `int x/y` =  divisor inteiro entre os números, exemplo: int 7/3 ==
* `%` = resto da divisão entre dois números inteiros, também é chamado de mod

### Lógicas
* `==` = igual, compara se uma variável é igual a outra 
* `!=` = diferente
* `<` = menor que
* `>` = maior que
* `<=` = menor ou igual a
* `>=` = maior ou igual a
* `&&` = quando a *condição 1* **E** a *condiçãoo 2* forem satisfeitas... **&& tem prioridade antes de ||**
* `||` = quando a *condição 1* **OU** a *condiçãoo 2* forem satisfeitas... **&& tem prioridade antes de ||**
* `!` = "troca" o valor da variável booleana. Ex.: 
    ```c++
    bool answer = true;
    answer = !answer;
    cout>>answer; //false
    ```

## Funções
* `main(){}` = função principal do programa, alguns chamam de "função mãe"
* `if(condição){bloco de código}` = "se *isso* acontecer, faça *isso*"
        * não precisa colocar o código entre {} se a linha a ser executada for apenas uma (isso também acontece no Java)
        * pode colocar `if` dentro de `if`
    * `else if(+condição){bloco de código}` = "caso a *condição* não aconteça, faça *isso* com base nessa *outra condição*"
    * `else{bloco de código}` = "caso nenhuma das *condições* aconteçam, faça *isso*"