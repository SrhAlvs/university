# IFG (Câmpus Luziânia) - Bacharelado em Sistemas da Informação
# Lógica Computacional

## Anotações
### Avaliações
- Prova: 18/07/2025
- Trabalho: 25/07/2025

## Lógica proposicional (tabelas verdade)
### Proposições
Chama-se proposição todo conjunto de palavras ou símbolos que exprimem um pensamento de sentido completo. As proposições transmitem pensamentos e afirmam fatos ou exprimem juízos que formamos a respeito de determinados entes. 
* Ex.: "A Lua é um satélite da Terra."

### Símbolos
As letras são símbolos não lógicos (**letras sentenciais**). São usadas para representar proposições elementares ou atômicas, isto é, proposições que não possuem partes que sejam também proposições.
```
p = O céu é azul
```
**Conectivos lógicos**: as proposições compostas são obtidas combinando proposições simples através de certos termos chamados conectivos, a Lógica dispões de 5 tipos de conectivos e seus operadores: 
* `¬` ou `~` = **negação**, inverte o valor de verdade de uma proposição. 
    * Se P é "Está chovendo", ¬P é "Não está chovendo".
    ```
    Tabela Verdade
    |  P  | ¬P |
    |  V  |  F |
    |  F  |  V |
    ```
* `∧` = **conjunção**, representa "e". A proposição P∧Q é verdadeira apenas se P for verdadeira e Q for verdadeira. 
    * Exemplo: "Está chovendo e o sol está brilhando".
    ```
    Tabela Verdade
    |  P  |  Q  | P ∧ Q |
    |  V  |  V  |   V   |
    |  V  |  F  |   F   |
    |  F  |  V  |   F   |
    |  F  |  F  |   F   |
    ```
* `∨` = **disjunção**, representa "ou". A proposição P∨Q é verdadeira se P for verdadeira ou Q for verdadeira (ou ambas). 
    * Exemplo: "Vou ao cinema ou vou jantar fora".
    ```
    Tabela Verdade
    |  P  |  Q  | P ∨ Q |
    |  V  |  V  |   V   |
    |  V  |  F  |   V   |
    |  F  |  V  |   V   |
    |  F  |  F  |   F   |
    ```
* `→` = **implicação ou condicional**, representa "se... então...". A proposição P→Q é falsa apenas se P for verdadeira e Q for falsa. 
    * Exemplo: "Se chover, então o chão ficará molhado".
    ```
    Tabela Verdade
    |  P  |  Q  | P → Q |
    |  V  |  V  |   V   |
    |  V  |  F  |   F   |
    |  F  |  V  |   V   |
    |  F  |  F  |   V   |
    ```
* `↔` = **bicondicional**, representa "se e somente se". A proposição P↔Q é verdadeira se P e Q tiverem o mesmo valor de verdade (ambas verdadeiras ou ambas falsas). 
    * Exemplo: "Eu te ajudo se e somente se você me ajudar".
    ```
    Tabela Verdade
    |  P  |  Q  | P ↔ Q |
    |  V  |  V  |   V   |
    |  V  |  F  |   F   |
    |  F  |  V  |   F   |
    |  F  |  F  |   V   | 
    ```
* `⊕` = **ou exclusivo**, é verdadeiro se apenas uma das proposições for verdadeira, mas não ambas.
    ```
    Tabela Verdade
    |  P  |  Q  | P ⊕ Q |
    |  V  |  V  |    F   |
    |  V  |  F  |    V   |
    |  F  |  V  |    V   |
    |  F  |  F  |    F   |
    ```
* `¬(∧)` ou `↑` = **Não E**, é verdadeiro se pelo menos uma das proposições for falsa. É a negação do "E".
    ```
    Tabela Verdade
    |  P  |  Q  | P ↑ Q |
    |  V  |  V  |   F   |
    |  V  |  F  |   V   |
    |  F  |  V  |   V   |
    |  F  |  F  |   V   |
    ```
* `¬(∨)` ou `↓` = **Não Ou**, é verdadeiro somente se ambas as proposições forem falsas. É a negação do "OU".
    ```
    Tabela Verdade
    |  P  |  Q  | P ↓ Q |
    |  V  |  V  |   F   |
    |  V  |  F  |   F   |
    |  F  |  V  |   F   |
    |  F  |  F  |   V   |
    ```

#### Precedência
    ()     >>    ¬      >>    ∧ ou ↑    >>     ∨ ou ↓     >>      →        >>              ↔ ou ⊕
parênteses >>  negação  >>  E ou Não E  >>  OU ou Não OU  >>  condicional  >>  bicondicional ou Ou Exclusivo

### Como montar a tabela verdade
#### Ex.: ¬(p⊕q)∧¬(¬p⊕q)
- PRIMEIRO PASSO:
```
|  p  |  q  |
|  F  |  F  |
|  F  |  V  |
|  V  |  F  |
|  V  |  V  |
```
- SEGUNDO PASSO:
```
|  p  |  q  | p⊕q | 
|  F  |  F  |  F   |
|  F  |  V  |  V   |
|  V  |  F  |  V   |
|  V  |  V  |  F   |
```
- TERCEIRO PASSO:
```
|  p  |  q  | p⊕q | ¬(p⊕q) |
|  F  |  F  |  F   |    V    |
|  F  |  V  |  V   |    F    |
|  V  |  F  |  V   |    F    |
|  V  |  V  |  F   |    V    |
```
- QUARTO PASSO:
```
|  p  |  q  | p⊕q | ¬(p⊕q) |  ¬p |
|  F  |  F  |  F   |    V    |  V  |
|  F  |  V  |  V   |    F    |  V  |
|  V  |  F  |  V   |    F    |  F  |
|  V  |  V  |  F   |    V    |  F  |
```
- QUINTO PASSO:
```
|  p  |  q  | p⊕q | ¬(p⊕q) |  ¬p | ¬p⊕q |
|  F  |  F  |  F   |    V    |  V  |   V  |
|  F  |  V  |  V   |    F    |  V  |   F  |
|  V  |  F  |  V   |    F    |  F  |   F  |
|  V  |  V  |  F   |    V    |  F  |   V  |
```
- SEXTO PASSO:
```
|  p  |  q  | p⊕q | ¬(p⊕q) |  ¬p | ¬p⊕q | ¬(¬p⊕q) |
|  F  |  F  |  F   |    V    |  V  |   V  |     F    |
|  F  |  V  |  V   |    F    |  V  |   F  |     V    |
|  V  |  F  |  V   |    F    |  F  |   F  |     V    |
|  V  |  V  |  F   |    V    |  F  |   V  |     F    |
```
- SÉTIMO PASSO:
```
|  p  |  q  | p⊕q | ¬(p⊕q) |  ¬p | ¬p⊕q | ¬(¬p⊕q) | ¬(p⊕q)∧¬(¬p⊕q) |
|  F  |  F  |  F   |    V    |  V  |   V  |     F    |         F        |
|  F  |  V  |  V   |    F    |  V  |   F  |     V    |         F        |
|  V  |  F  |  V   |    F    |  F  |   F  |     V    |         F        |
|  V  |  V  |  F   |    V    |  F  |   V  |     F    |         F        |
```

#### Ex.: p∧(q∨r)
- PRIMEIRO PASSO:
```
|  p  |  q  |  r  |
|  F  |  F  |  F  |
|  F  |  F  |  V  |
|  F  |  V  |  F  |
|  F  |  V  |  V  |
|  V  |  F  |  F  |
|  V  |  F  |  V  |
|  V  |  V  |  F  |
|  V  |  V  |  V  |
```
- SEGUNDO PASSO:
```
|  p  |  q  |  r  | q∨r |
|  F  |  F  |  F  |  F  |
|  F  |  F  |  V  |  V  |
|  F  |  V  |  F  |  V  |
|  F  |  V  |  V  |  V  |
|  V  |  F  |  F  |  F  |
|  V  |  F  |  V  |  V  |
|  V  |  V  |  F  |  V  |
|  V  |  V  |  V  |  V  |
```
- TERCEIRO PASSO:
```
|  p  |  q  |  r  | q∨r | p∧(q∨r) |
|  F  |  F  |  F  |  F  |    F    |
|  F  |  F  |  V  |  V  |    F    |
|  F  |  V  |  F  |  V  |    F    |
|  F  |  V  |  V  |  V  |    F    |
|  V  |  F  |  F  |  F  |    F    |
|  V  |  F  |  V  |  V  |    V    |
|  V  |  V  |  F  |  V  |    V    |
|  V  |  V  |  V  |  V  |    V    |
```
