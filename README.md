## Contador de Ocorrências - Java Backend DIO

Este projeto é uma aplicação simples em Java que recebe dois números como entrada e imprime uma contagem a partir do primeiro número até o segundo número. Se o primeiro número for maior ou igual ao segundo número, uma exceção customizada é lançada.

## Funcionalidades

- **Imprimir números sequenciais**: Imprime números sequenciais do primeiro parâmetro até o segundo.
- **Exceção customizada**: Lança uma exceção `ParametrosInvalidosException` se o segundo número for menor ou igual ao primeiro.

## Como Funciona

1. O programa solicita ao usuário dois números: o primeiro e o segundo parâmetro.
2. Se o segundo número for maior que o primeiro, o programa imprime os números de 1 até a diferença entre o segundo e o primeiro número.
3. Se o primeiro número for maior ou igual ao segundo, uma exceção `ParametrosInvalidosException` é lançada com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".


