![Diagrama de Caso de Uso](link_para_a_imagem)

**Descrição dos Casos de Uso:**

1. **Cadastrar Usuário:**
   - **Ator Principal:** Atendente do estacionamento
   - **Descrição:** Permite ao atendente cadastrar um novo usuário no sistema, inserindo informações como nome, CPF e contato.

2. **Editar Usuário:**
   - **Ator Principal:** Atendente do estacionamento
   - **Descrição:** Permite ao atendente editar as informações de um usuário existente, como nome, CPF e contato.

3. **Excluir Usuário:**
   - **Ator Principal:** Atendente do estacionamento
   - **Descrição:** Permite ao atendente excluir um usuário do sistema.

4. **Cadastrar Veículo:**
   - **Ator Principal:** Atendente do estacionamento
   - **Descrição:** Permite ao atendente cadastrar um veículo associado a um usuário, incluindo informações como placa, modelo e cor.

5. **Editar Veículo:**
   - **Ator Principal:** Atendente do estacionamento
   - **Descrição:** Permite ao atendente editar as informações de um veículo existente, como placa, modelo e cor.

6. **Excluir Veículo:**
   - **Ator Principal:** Atendente do estacionamento
   - **Descrição:** Permite ao atendente excluir um veículo do sistema.

7. **Registrar Entrada de Veículo:**
   - **Ator Principal:** Sistema
   - **Descrição:** Registra a entrada de um veículo no estacionamento, incluindo placa, modelo e hora de entrada.

8. **Registrar Saída de Veículo:**
   - **Ator Principal:** Sistema
   - **Descrição:** Registra a saída de um veículo, calculando automaticamente o tempo de permanência e o valor a ser cobrado (se houver cobrança).

9. **Gerar Relatório de Ocupação:**
   - **Ator Principal:** Atendente do estacionamento
   - **Descrição:** Gera um relatório que exibe a ocupação atual do estacionamento, incluindo o número de vagas ocupadas e disponíveis.


![Diagrama de Atividades](link_para_a_imagem)

**Descrição das Atividades:**

1. **Iniciar Sistema:**
   - **Descrição:** Atividade que representa o início do sistema.

2. **Cadastrar Usuário:**
   - **Descrição:** Atividade que permite ao atendente cadastrar um novo usuário no sistema.

3. **Editar Usuário:**
   - **Descrição:** Atividade que permite ao atendente editar as informações de um usuário existente.

4. **Excluir Usuário:**
   - **Descrição:** Atividade que permite ao atendente excluir um usuário do sistema.

5. **Cadastrar Veículo:**
   - **Descrição:** Atividade que permite ao atendente cadastrar um veículo associado a um usuário.

6. **Editar Veículo:**
   - **Descrição:** Atividade que permite ao atendente editar as informações de um veículo existente.

7. **Excluir Veículo:**
   - **Descrição:** Atividade que permite ao atendente excluir um veículo do sistema.

8. **Registrar Entrada de Veículo:**
   - **Descrição:** Atividade que registra a entrada de um veículo no estacionamento.

9. **Registrar Saída de Veículo:**
   - **Descrição:** Atividade que registra a saída de um veículo e calcula automaticamente o tempo de permanência e o valor a ser cobrado.

10. **Atualizar Disponibilidade de Vagas:**
    - **Descrição:** Atividade que atualiza automaticamente a disponibilidade de vagas no estacionamento.

11. **Gerar Relatório de Ocupação:**
    - **Descrição:** Atividade que gera um relatório de ocupação do estacionamento.

12. **Finalizar Sistema:**
    - **Descrição:** Atividade que representa o encerramento do sistema.

# Requisitos da Aplicação:

## Requisitos Funcionais:

1. **Cadastro de Usuário:**
   - O sistema deve permitir o cadastro de novos usuários, incluindo informações como nome, CPF e contato.
   - Os usuários cadastrados podem ser associados a veículos.

2. **Edição de Usuário:**
   - O sistema deve permitir a edição das informações de um usuário existente, como nome, CPF e contato.

3. **Exclusão de Usuário:**
   - O sistema deve permitir a exclusão de usuários registrados.

4. **Cadastro de Veículo:**
   - O sistema deve permitir o cadastro de veículos associados a usuários, incluindo informações como placa, modelo e cor.

5. **Edição de Veículo:**
   - O sistema deve permitir a edição das informações de um veículo existente, como placa, modelo e cor.

6. **Exclusão de Veículo:**
   - O sistema deve permitir a exclusão de veículos registrados.

7. **Registro de Entrada de Veículo:**
   - O sistema deve permitir o registro da entrada de um veículo, incluindo placa, modelo e hora de entrada.

8. **Registro de Saída de Veículo:**
   - O sistema deve permitir o registro da saída de um veículo, calculando automaticamente o tempo de permanência e o valor a ser cobrado (se houver cobrança).

9. **Atualização de Disponibilidade de Vagas:**
   - A disponibilidade de vagas no estacionamento deve ser atualizada automaticamente após o registro de entrada ou saída de um veículo.

10. **Geração de Relatório de Ocupação:**
    - O sistema deve ser capaz de gerar relatórios que exibam a ocupação atual do estacionamento, incluindo o número de vagas ocupadas e disponíveis.

## Requisitos Não Funcionais:

1. **Linguagem de Programação:**
   - O sistema deve ser desenvolvido em Python.

2. **Interface Gráfica:**
   - A interface de usuário deve ser simples e intuitiva, utilizando bibliotecas gráficas como Tkinter para Python.

3. **Persistência de Dados:**
   - Os dados devem ser armazenados de forma persistente, podendo ser implementado utilizando arquivos de texto simples.

4. **Facilidade de Aprendizado:**
   - A linguagem de programação e as tecnologias utilizadas devem ser de fácil aprendizado, adequadas para um ambiente educacional.

5. **Documentação do Código:**
   - O código deve ser devidamente documentado, seguindo boas práticas de programação.

6. **Testes Unitários:**
   - Deve ser realizado testes unitários para garantir o funcionamento correto das funcionalidades implementadas.

7. **Testes de Integração:**
   - Testes de integração devem ser realizados para verificar a interação entre os diferentes componentes do sistema.

## Regras de Negócio:

1. **Cobrança por Estadia:**
   - Se houver cobrança, o sistema deve calcular automaticamente o valor a ser cobrado com base no tempo de permanência do veículo no estacionamento.

2. **Restrições de Cadastro:**
   - Não é permitido cadastrar dois usuários com o mesmo CPF.

3. **Restrições de Edição:**
   - Não é permitido editar o CPF de um usuário.

4. **Restrições de Exclusão:**
   - Não é permitido excluir um veículo que ainda esteja estacionado no local.

5. **Limite de Vagas:**
   - O sistema deve respeitar um limite máximo de vagas disponíveis no estacionamento.

6. **Segurança dos Dados:**
   - As informações dos usuários e veículos devem ser armazenadas de forma segura, protegendo dados sensíveis como CPF.


## Schema do Banco de Dados:

## Tabela: Usuarios
| Coluna      | Tipo         | Restrições                |
|-------------|--------------|---------------------------|
| id          | INT          | Chave Primária, Autoincremento |
| nome        | VARCHAR(255) | Não Nulo                  |
| cpf         | VARCHAR(14)  | Não Nulo, Único           |
| contato     | VARCHAR(20)  |                           |

## Tabela: Veiculos
| Coluna      | Tipo         | Restrições                |
|-------------|--------------|---------------------------|
| id          | INT          | Chave Primária, Autoincremento |
| placa       | VARCHAR(10)  | Não Nulo, Único           |
| modelo      | VARCHAR(50)  |                           |
| cor         | VARCHAR(20)  |                           |
| usuario_id  | INT          | Chave Estrangeira (Usuarios) |

## Tabela: Movimentacoes
| Coluna      | Tipo         | Restrições                |
|-------------|--------------|---------------------------|
| id          | INT          | Chave Primária, Autoincremento |
| entrada     | DATETIME     | Não Nulo                  |
| saida       | DATETIME     |                           |
| valor       | DECIMAL(10, 2) |                        |
| veiculo_id  | INT          | Chave Estrangeira (Veiculos) |
