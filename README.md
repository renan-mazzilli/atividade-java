# Sistema de Gerenciamento de Contas Bancárias

Este projeto implementa um sistema simples de gerenciamento de contas bancárias em Java, utilizando conceitos de Programação Orientada a Objetos (POO) e estruturas de dados como ArrayList.

## Descrição

O sistema permite gerenciar contas bancárias através de um menu interativo no console, com operações de cadastro, consulta, depósito, saque e exclusão de contas.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

- **Conta.java**: Classe que representa uma conta bancária
- **Main.java**: Classe principal que contém o menu e o gerenciamento das contas

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

1. **Cadastrar uma nova conta**
    - Solicita número da conta, nome da agência e nome do cliente
    - Todas as contas iniciam com saldo zero

2. **Consultar dados de uma conta específica**
    - Busca uma conta pelo número e exibe seus detalhes

3. **Listar todas as contas cadastradas**
    - Exibe os dados de todas as contas armazenadas no sistema

4. **Realizar depósitos**
    - Permite adicionar valores a uma conta existente
    - Valida se o valor é maior que zero

5. **Realizar saques**
    - Permite retirar valores de uma conta existente
    - Verifica se há saldo suficiente antes de efetuar o saque

6. **Excluir uma conta**
    - Remove uma conta do sistema

7. **Encerrar o programa**
    - Finaliza a execução do sistema

## Tecnologias Utilizadas

| Tecnologia                                                                                                                         | Descrição |
|------------------------------------------------------------------------------------------------------------------------------------|-----------|
| <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" width="80" height="40"/>         | Linguagem de programação orientada a objetos utilizada para implementação do sistema |
| <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/git/git-original.svg" width="80" height="40"/>           | Sistema de controle de versão para gerenciamento do código-fonte |
| <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/intellij/intellij-original.svg" width="80" height="40"/> | Ambiente de desenvolvimento integrado (IDE) utilizado para codificação |

## Conceitos de POO Aplicados

- **Encapsulamento**: Atributos privados com métodos getters e setters
- **Classes e Objetos**: Definição da classe Conta e criação de instâncias
- **Métodos**: Implementação de comportamentos específicos como depositar() e sacar()
- **ArrayList**: Utilização de coleção dinâmica para armazenar as contas

## Como Executar

1. Compile os arquivos Java:
   ```bash
   javac Main.java Conta.java
   ```

2. Execute o programa:
   ```bash
   java Main
   ```

3. Siga as instruções do menu interativo no console.

## Exemplo de Uso

1. Escolha a opção 1 para cadastrar uma nova conta
2. Informe os dados solicitados (número da conta, agência e nome do cliente)
3. Utilize as opções 4 e 5 para realizar operações de depósito e saque
4. Consulte informações de contas específicas com a opção 2
5. Visualize todas as contas com a opção 3
6. Exclua contas com a opção 6
7. Encerre o programa com a opção 7

## Requisitos

- Java JDK 8 ou superior
- Ambiente de execução de linha de comando

## Tratamento de Erros

O sistema implementa validações básicas, como:
- Verificação de contas duplicadas
- Validação de valores para depósito e saque
- Verificação de saldo suficiente para saques
- Busca de contas existentes antes de operações