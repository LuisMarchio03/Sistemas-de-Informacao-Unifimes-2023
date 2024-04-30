# Desafio - Wallet Service

Este é um desafio de desenvolvimento backend para criar uma plataforma simplificada de pagamentos, semelhante ao PicPay. O projeto será desenvolvido em Java com Spring Boot e integrado ao PostgreSQL para persistência de dados. Abaixo está o checklist passo a passo para desenvolver cada parte do projeto.

## Checklist do Desenvolvimento

### 1. Configuração do Ambiente

- [ ] Instalar o Java Development Kit (JDK)
- [ ] Instalar o Apache Maven
- [ ] Configurar um banco de dados PostgreSQL localmente ou usar um serviço de nuvem (ex: Heroku)

### 2. Criação das Classes de Modelo (POO)

- [ ] Criar a classe `User` para representar usuários comuns e lojistas
- [ ] Adicionar atributos como Nome Completo, CPF, E-mail, Senha e Saldo

```java
public class User {
    // Implementação da classe User
}
```

### 3. Implementação dos Serviços

- [ ]  Criar um serviço (TransferService) para realizar transferências entre usuários
- [ ]  Validar saldos antes das transferências e reverter transações em caso de falha

```java
@Service
public class TransferService {
    // Implementação do serviço de transferência
}
```

### 4. Serviço de Carteira (Wallet)

- [ ]  Criar um serviço (WalletService) para gerenciar saldo dos usuários
- [ ]  Implementar métodos para adicionar, remover e consultar o saldo dos usuários


```java
@Service
public class WalletService {
    // Implementação do serviço de carteira
}
```

### 5. Configuração do Spring Boot

- [ ]  Criar uma aplicação Spring Boot
- [ ]  Configurar endpoints RESTful para receber requisições HTTP

### 6. Integração com o Banco de Dados

- [ ]  Configurar a conexão com o PostgreSQL usando Spring Data JPA
- [ ]  Criar repositórios para persistir dados dos usuários e transações

### 7. Documentação com Swagger

- [ ] Integrar o Swagger para gerar documentação automática da API
- [ ] Integrar o Swagger para gerar documentação automática da API

### 8. Teste e Documentação com Postman

- [ ]  Utilizar o Postman para testar manualmente os endpoints da API
- [ ]  Documentar exemplos de requisições e respostas usando o Postman

## Executando o Projeto Localmente

**Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

**Navegue até o diretório do projeto:**
```bash
cd nome-do-repositorio
```

**Execute o projeto usando Maven:**
```bash
mvn spring-boot:run
```

**Acesse a documentação da API no navegador:**
```bash
http://localhost:8080/swagger-ui.html
```
