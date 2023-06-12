1. Qual é o objetivo principal do Modelo Entidade Relacionamento?

O objetivo principal do Modelo Entidade Relacionamento (MER) é representar e descrever a estrutura lógica de um sistema de informações por meio de entidades, relacionamentos e atributos. O MER é usado para modelar a realidade de um domínio específico e facilitar o projeto de banco de dados, fornecendo uma visão clara das entidades envolvidas e como elas se relacionam entre si.

2. Quais são os componentes principais do modelo entidade-relacionamento?

Os componentes principais do modelo entidade-relacionamento são:

Entidades: Representam objetos do mundo real ou conceitos abstratos que são importantes para o sistema.
Relacionamentos: Descrevem as interações e conexões entre as entidades.

Atributos: Características ou propriedades das entidades que descrevem informações específicas sobre elas.

Cardinalidade: Indica quantas ocorrências de uma entidade podem se relacionar com o outro lado do relacionamento.

3. O que é uma entidade? Dê exemplos de entidades (pelo menos 5 exemplos).

Uma entidade é um objeto ou conceito do mundo real que é representado no modelo entidade-relacionamento Exemplos de entidades podem incluir:

Cliente
Produto
Funcionário
Pedido
Fornecedor

4. O que é a cardinalidade de um relacionamento? Quais são os tipos de cardinalidade que existem? Dê um exemplo de cada um dos tipos de cardinalidade.

A cardinalidade de um relacionamento representa o número de ocorrências em que uma entidade pode se relacionar com a outra entidade em um relacionamento. Os principais tipos de cardinalidade são:

Cardinalidade 1:1 (um para um): Cada instância de uma entidade se relaciona com apenas uma instância da outra entidade. Exemplo: Um cliente possui apenas um endereço de entrega e um endereço pertence a apenas um cliente.

Cardinalidade 1:N (um para muitos): Cada instância de uma entidade se relaciona com várias instâncias da outra entidade. Exemplo: Um departamento possui vários funcionários, mas um funcionário pertence a apenas um departamento.

Cardinalidade N:M (muitos para muitos): Várias instâncias de uma entidade se relacionam com várias instâncias da outra entidade. Isso é representado por meio de uma tabela de associação. Exemplo: Um aluno pode se matricular em várias disciplinas e uma disciplina pode ter vários alunos matriculados.

5. Através de exemplos de Diagramas ER, ilustre os conceitos a seguir do modelo ER:

# a) Entidade
Exemplo de um diagrama ER mostrando uma entidade "Cliente":

       +--------------+
       |   Cliente    |
       +--------------+
       |   ID         |
       |   Nome       |
       |   Email      |
       +--------------+


# b) Relacionamento
Exemplo de um diagrama ER mostrando um relacionamento "Compra" entre as entidades "Cliente" e "Produto":

           +--------------+         +--------------+
       |   Médico     |         |   Paciente   |
       +--------------+         +--------------+
       |   ID         |         |   ID         |
       |   Nome       |         |   Nome       |
       |   Especialidade |       |   Idade      |
       +--------------+         +--------------+
            |                          |
            |                          |
       +--------------+         +--------------+
       |   Atendimento |         |              
       +--------------+         |              
       |   IDMédico    |         |              
       |   IDPaciente  |         |              
       |   Data        |         |              
       +--------------+         +--------------+


# c) Entidade fraca
Exemplo de um diagrama ER mostrando uma entidade fraca "Dependente" que depende da entidade "Funcionário":

   +------------------+         +------------------+
   |    Funcionário   |         |    Dependente    |
   +------------------+         +------------------+
   |    ID            |         |    ID            |
   |    Nome          |         |    Nome          |
   |    Cargo         |         |    DataNascimento|
   +------------------+         |    IDFuncionário |
                                +------------------+



# d) Auto-relacionamento
Exemplo de um diagrama ER mostrando um auto-relacionamento na entidade "Funcionário", onde um funcionário pode ter um gerente que também é um funcionário:

   +------------------+
   |    Funcionário    |
   +------------------+
   |    ID            |
   |    Nome          |
   |    Cargo         |
   |    IDGerente     |
   +------------------+

6. Desenvolva um diagrama entidade-relacionamento para as situações descritas a seguir.

+-------------+          +-------------+
|   Produto   |          |   Pedido    |
+-------------+          +-------------+
|   ID        |    N,1   |   ID        |
|   Nome      |          |   Data      |
|   Descrição |          +-------------+
|   Preço     |    N,M   |
+-------------+          |
       |                  |
       |                  |
       |           +-------------------+
       |           |   ProdutoPedido   |
       +--------N,M+-------------------+
                   |   IDProduto       |
                   |   IDPedido        |
                   |   Quantidade      |
                   +-------------------+


6. 1. Desenvolva um diagrama entidade-relacionamento para as situações descritas a seguir. Um professor pode dar aulas a diversas classes, desde que ele ou ela esteja qualificado para ensinar a matéria. Cada classe deve ter um professor e pode ser frequentada por vários alunos. No inicio de cada semestre as classes são designadas para as salas, uma para cada classe, que ali comparece regularmente.

+-------------+          +-------------+
|   Professor |          |    Classe   |
+-------------+          +-------------+
|   ID        |          |    ID       |
|   Nome      |          |    Nome     |
|   Matéria   |    1,N   |    Sala     |
+-------------+          +-------------+
       |                      |
       |                      |
       |               +-------------+
       |               |    Aluno    |
       +------------N,1+-------------+
                       |    ID       |
                       |    Nome     |
                       +-------------+

6. 2. Considere um conjunto de entidades Empregado, com atributos EmplD, CPF, RG, EmpNome, Dept, JobNome, Salário.

a) O conjunto de entidades Empregado e seus atributos seriam representados da seguinte forma em um diagrama de F.R.:
+-------------+
|  Empregado  |
+-------------+
|   EmplD     |
|   CPF       |
|   RG        |
|   EmpNome   |
|   Dept      |
|   JobNome   |
|   Salário   |
+-------------+

b) O domínio do atributo Salário pode ser descrito como um valor numérico que representa a remuneração do empregado. Faremos a hipótese de que o salário é expresso em uma moeda específica, como dólar, real, euro, etc.

c) Algumas superchaves para o conjunto de entidades Empregado podem ser formadas por combinações únicas dos atributos disponíveis. Por exemplo, a superchave pode ser formada por EmplD, CPF ou por EmplD, RG.

d) As chaves candidatas são combinações únicas de atributos que podem identificar exclusivamente cada instância do conjunto de entidades. Nesse caso, possíveis chaves candidatas seriam EmplD, CPF e EmplD, RG.

e) Para identificar uma chave primária para o conjunto de entidades Empregado, devemos escolher uma das chaves candidatas que seja mais apropriada para ser a chave principal. Essa escolha pode ser baseada em critérios como unicidade, simplicidade e estabilidade. Por exemplo, podemos escolher EmplD como chave primária, desde que cada empregado tenha um EmplD exclusivo atribuído.


6. 3. Assuma que no mesmo empreendimento do exercício 3 haja um conjunto de entidades chamado Projeto com atributos ProjNome, Datalnício, DataTérmino, e Orçamento.

a) O conjunto de entidades Projeto e seus atributos seriam representados da seguinte forma em um diagrama de F.R.:

+-------------+
|   Projeto   |
+-------------+
|  ProjNome   |
| Datalnício  |
| DataTérmino |
|  Orçamento  |
+-------------+

b) Algumas superchaves para o conjunto de entidades Projeto podem ser formadas por combinações únicas dos atributos disponíveis. Por exemplo, a superchave pode ser formada por ProjNome ou por Datalnício, ProjNome.

c) As chaves candidatas são combinações únicas de atributos que podem identificar exclusivamente cada instância do conjunto de entidades. Nesse caso, possíveis chaves candidatas seriam ProjNome, Datalnício ou ProjNome, DataTérmino.

d) Para identificar uma chave primária para o conjunto de entidades Projeto, devemos escolher uma das chaves candidatas que seja mais apropriada para ser a chave principal. Essa escolha pode ser baseada em critérios como unicidade, simplicidade e estabilidade. Por exemplo, podemos escolher ProjNome como chave primária, desde que cada projeto tenha um nome exclusivo atribuído.


6. 4. Assuma que no mesmo empreendimento do exercício 3 haja um conjunto de entidades chamado Projeto com atributos ProjNome, Datalnicio, DataTérmino e Orçamento.

a) O conjunto de entidades Projeto e seu relacionamento com o conjunto de entidades Empregado podem ser representados da seguinte forma em um diagrama ER:

          +-------------+
          |   Projeto   |
          +-------------+
          |  ProjNome   |
          | Datalnicio  |
          | DataTérmino |
          |  Orçamento  |
          +-------------+
              |       |
              |       |
  +-----------+       +-------------+
  |                               |
  |                               |
  |                               |
  |                               |
  |                               |
  |                               |
  |                               |
+--------------+             +-------------+
|  Empregado   |             |   Atribuição |
+--------------+             +-------------+
|   EmplID     |             |   EmplID    |
|   ProjNome   |             |   ProjNome  |
|   Horas      |             |   Horas     |
+--------------+             +-------------+

Neste diagrama, temos o conjunto de entidades Projeto e o conjunto de entidades Empregado relacionados através da entidade Atribuição, que representa a atribuição de um empregado a um projeto específico. A entidade Atribuição tem as chaves estrangeiras EmplID e ProjNome, que referenciam as chaves primárias dos conjuntos de entidades Empregado e Projeto, respectivamente. A adição do atributo Horas na entidade Atribuição permite representar o número de horas atribuídas para um empregado trabalhar em um projeto.

b) A cardinalidade máxima do relacionamento entre Projeto e Empregado pode ser definida como "1,N", indicando que um projeto pode ter vários empregados atribuídos a ele, mas cada empregado pode estar atribuído a apenas um projeto. Essa cardinalidade é representada pelo símbolo "1,N" no diagrama ER.

c) A cardinalidade mínima do relacionamento entre Projeto e Empregado pode ser definida como "0,1", indicando que um projeto pode não ter nenhum empregado atribuído a ele ou no máximo um empregado atribuído. Essa cardinalidade é representada pelo símbolo "0,1" no diagrama ER.

d) As chaves estrangeiras em Projeto são EmplID e ProjNome. Em Empregado, não há chaves estrangeiras

6. 4. Ainda com relação ao empreendimento dos exercícios anteriores:

a) A especialização do conjunto de entidades Empregado em Escritório, Vendas e Gerenciamento pode ser representada da seguinte forma em um diagrama ER:

               +--------------+
               |  Empregado   |
               +--------------+
               |    EmplID    |
               |     Nome     |
               |    Salário   |
               +--------------+
                 |         |
                 |         |
     +-----------+         +-----------+
     |                                   |
     |                                   |
     |                                   |
     |                                   |
+-------------+             +----------------+
|  Escritório |             |    Vendas     |
+-------------+             +----------------+
|   EmplID    |             |    EmplID     |
|   Depart.   |             |   Comissão    |
+-------------+             +----------------+
                               |
                               |
                               |
                           +------------+
                           | Gerenciame |
                           +------------+
                           |   EmplID   |
                           |  Projetos  |
                           +------------+

Neste diagrama, temos o conjunto de entidades Empregado como entidade genérica, e as subclasses Escritório, Vendas e Gerenciamento como entidades especializadas. Cada uma das subclasses possui atributos adicionais relevantes para sua especialização.

b) A agregação entre o conjunto de entidades Empregado e o conjunto de entidades Equipamento, formando o conjunto de entidades Recursos, pode ser representada da seguinte forma em um diagrama ER:

+-------------+
|   Recursos  |
+-------------+
|  RecursoID  |
|  EmplID     |
|  EquipNome  |
|  Localização|
|   Custo     |
+-------------+


Neste diagrama, o conjunto de entidades Recursos é formado pela agregação do conjunto de entidades Empregado e do conjunto de entidades Equipamento. Os atributos relevantes de cada conjunto de entidades são incluídos no conjunto de entidades Recursos.

c) No diagrama de entidades e relacionamentos, o conjunto de entidades Recursos poderia participar de um relacionamento com o conjunto de entidades Projeto da seguinte forma:

          +-------------+
          |   Projeto   |
          +-------------+
          |  ProjNome   |
          | Datalnicio  |
          | DataTérmino |
          |  Orçamento  |
          +-------------+
              |       |
              |       |
              |       |
              |       |
              |       |
              |       |
+--------------+       +-------------+
|
