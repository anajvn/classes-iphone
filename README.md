# iPhone Java Challenge

Este repositório contém o código para o desafio de modelagem e implementação de um iPhone com os papéis de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. O desafio faz parte da trilha "Java Básico" da DIO (Digital Innovation One).

## Descrição

O desafio consiste em criar as classes e interfaces Java que representam as funcionalidades do iPhone, conforme as seguintes especificações:

- Reprodutor Musical: tocar, pausar, selecionar música.
- Aparelho Telefônico: ligar, atender, iniciar correio de voz.
- Navegador na Internet: exibir página, adicionar nova aba, atualizar página, ver abas abertas e fechar abas.

O código está estruturado de acordo com essas especificações, com a classe `IPhone` implementando as três interfaces correspondentes.

## Estrutura do Projeto

- `User.java`: O ponto de entrada do programa, contendo um exemplo de uso do iPhone e suas funcionalidades.
- `IPhone.java`: A classe que representa o iPhone e implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`.
- `README.md`: Este arquivo com informações sobre o projeto.

## Como Usar

1. Clone o repositório para o seu ambiente local:

```bash
git clone https://github.com/anajvn/classes-iphone.git
```

2. Compile e execute o código a partir da raiz do projeto:

```bash
javac User.java IPhone.java
java User
```

Isso executará o exemplo de uso do iPhone, demonstrando as funcionalidades de reprodução musical, chamadas telefônicas e navegação na internet.

## Contribuições

Contribuições são bem-vindas. Sinta-se à vontade para melhorar o código, adicionar novos recursos ou corrigir problemas existentes. Basta seguir as práticas de desenvolvimento e enviar um pull request.
