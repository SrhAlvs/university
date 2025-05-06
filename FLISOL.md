# Evento do FLISOL XXIII-IV-MMXXV
# Conceitos Básicos de Administração de Servidores GNU/Linux

## Passo a passo seguido inicialmente (na máquina do IF)
* **1.** no gerenciador de arquivos, pasta "Rede", pesquisa por: `\\10.9.108.234`
    * **1.1.** Users > Público > Documentos Públicos 
* **2.** copia o arquivo "rocky" para uma pasta chamada "vm" no Disco Local C (se ela não existir, crie)
* **3.** descompacta o arquivo "rocky"
* **4.** abre com duplo clique o arquivo "Rock-9.5-x86_64"

## Comandos executados
**tudo executado com `sudo` antes**
* `sudo` = te faz executar um comando como administrador, exemplo: `sudo dnf upgrade`
* `dnf` = verifica, gerencia e atualiza os pacotes instalados na máquina? se não me engano é isso 
    * `dnf check-update` = faz a checagem dos pacotes e seus estados
    * `dnf upgrade` = atualiza os pacotes necessários
    * `dnf install` = instala kkkkkkkkkk
        * `dnf install mysql` = 
        * `dnf install` = 
        * `dnf install postgresql-server` = 
        * `dnf install httpd` = 
        * `dnf install php` = 
        * `dnf install mysql-server` = 
* `systemctl` =
    * `start httpd` = começar servidor HTTP
        * q pra sair
    * `status httpd` = status
    * `stop httpd` = parar servidor HTTP 
    * `start mysql` = 
    * `start mysqld` = 
    * `start mariadb` = 
* `ss` = 
    * `ss |less` = navega
    * `ss -l` = vê as conexões
    * `ss -lt` = vê 
    * `ss -ltn` = 
    * `ss -ltnp` = 
* `` = tem um comando de desabilitar o firewall, acho que não anotei ;-;
