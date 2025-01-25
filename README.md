# Projeto Banco Senac PE

Este projeto é uma estrutura de exemplo em Java para a simulação de um sistema bancário. Ele foi desenvolvido utilizando princípios básicos da orientação a objetos (POO) para demonstrar o funcionamento de entidades como cliente, conta bancária, agência e endereço.

## 📋 Funcionalidades Implementadas

- **Cadastro de Clientes**: Criação de objetos para clientes do banco, vinculados às suas informações.
- **Cadastro de Endereços**: Cada cliente e agência possui um endereço detalhado.
- **Criação de Agência**: Geração de agências do banco com informações como código, nome, telefone e e-mail.
- **Gerenciamento de Contas**:
  - Abertura de contas associadas a um cliente e uma agência.
  - Operação de depósito com registro do saldo atualizado.

## 🏗️ Estrutura do Código

O projeto se baseia em classes para representar as principais entidades do sistema. As classes principais incluem:

- **Cliente**: Representa os dados de um cliente, como nome, CPF, endereço, data de nascimento, etc.
- **Endereço**: Contém informações como rua, bairro, cidade, estado, número, complemento e CEP.
- **Agência**: Representa uma agência bancária com código, nome, endereço e informações de contato.
- **Conta**: Gerencia informações como cliente associado, número da conta, agência, data de abertura, saldo e status da conta.

### Classe Principal - `Main`

Esta é a classe inicial do projeto que demonstra como utilizar as outras classes. Algumas das operações realizadas no método `main` incluem:

1. Criação de endereços utilizando diferentes formas de construtores.
2. Modificação de atributos de objetos utilizando métodos de classe (`set`).
3. Criação de uma agência bancária.
4. Criação de um cliente vinculado a um endereço.
5. Abertura de uma conta para o cliente e execução de um depósito.

## 🛠️ Tecnologias Utilizadas

- **Java SDK 23**: Linguagem principal utilizada no projeto.
- **Paradigma de Orientação a Objetos**: Todo o desenvolvimento é baseado em classes, objetos, encapsulamento e reutilização de código.

## 📦 Como Rodar o Projeto

1. **Pré-requisitos**:
   - Certifique-se de ter o Java instalado no computador.
   - Utilize uma IDE como IntelliJ IDEA para facilitar a execução e edição do código.

2. **Passo-a-passo**:
   - Clone este repositório ou copie os arquivos para o seu computador.
   - Abra o projeto na sua IDE preferida.
   - Navegue até a classe `Main` no pacote `senac.pe.faculdade`.
   - Execute o método `main` para visualizar os exemplos e operações feitas no programa.

## 🌟 Exemplos de Uso

### Criação de um Endereço
```java
Endereco endMarcos = new Endereco(
        "Av Cabugá", "Boa Viagem", "Recife", "PE",
        100, "Apartamento 301", "59000-000"
);
endMarcos.setCidade("Olinda");
System.out.println(endMarcos);
```

### Cadastrando um Cliente
```java
Cliente miguel = new Cliente(
        "Miguel", "123.456.789-00", endMiguel,
        new Date(95, 06, 16), 123456789,
        "miguel@email.com", "(81)92323-2323"
);
System.out.println(miguel);
```

### Realizando um Depósito em uma Conta
```java
Conta contaMiguel = new Conta(miguel, 78544, agSenac, new Date(98, 01, 20), 1400, true);
System.out.println(contaMiguel.depositar(200));
```

## 📂 Estrutura de Pacotes

- **`senac.pe.faculdade`**: Contém a classe `Main` para a execução do programa.
- **`senac.pe.faculdade.entidades`**: Contém as classes associadas às entidades utilizadas no sistema, como `Cliente`, `Endereco`, `Agencia` e `Conta`.

## 🔗 Próximos Passos

Este é um projeto simples para fins de aprendizado, mas pode ser expandido com novas funcionalidades, como:

- Saque e Transferência entre contas.
- Gerenciamento de mais tipos de contas, como conta poupança ou conta empresarial.
- Integração com um banco de dados para persistência das informações.
- Interface gráfica para maior interatividade.
