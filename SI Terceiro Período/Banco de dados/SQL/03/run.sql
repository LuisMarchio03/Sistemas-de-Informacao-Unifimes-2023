-- Inserir dados na tabela Ambulatórios
INSERT INTO Ambulatórios (nroa, andar, capacidade)
VALUES (1, 2, 10),
  (2, 3, 5),
  (3, 1, 8);
-- Inserir dados na tabela Médicos
INSERT INTO Médicos (
    codm,
    CPF,
    nome,
    idade,
    cidade,
    especialidade,
    nroa
  )
VALUES (
    1,
    '1234567890',
    'Dr. João',
    35,
    'São Paulo',
    'Ortopedista',
    1
  ),
  (
    2,
    '9876543210',
    'Dr. Maria',
    40,
    'Rio de Janeiro',
    'Cardiologista',
    2
  ),
  (
    3,
    '4567891230',
    'Dr. Pedro',
    30,
    'Belo Horizonte',
    'Dermatologista',
    3
  );
-- Inserir dados na tabela Pacientes
INSERT INTO Pacientes (ggdp, CPF, nome, idade, cidade, doença)
VALUES (
    1,
    '1112223330',
    'Joana',
    25,
    'São Paulo',
    'Hipertensão'
  ),
  (
    2,
    '4445556660',
    'Lucas',
    32,
    'Rio de Janeiro',
    'Asma'
  ),
  (
    3,
    '7778889990',
    'Mariana',
    50,
    'Belo Horizonte',
    'Diabetes'
  );
-- Inserir dados na tabela Consultas
INSERT INTO Consultas (codm, codp, data, hora)
VALUES (1, 1, '2023-06-12', '09:00:00'),
  (2, 2, '2023-06-12', '10:30:00'),
  (3, 3, '2023-06-12', '11:45:00');
-- Inserir dados na tabela Funcionários
INSERT INTO Funcionários (codf, CPF, nome, idade, cidade, salário)
VALUES (
    1,
    '1234567890',
    'Funcionário 1',
    28,
    'São Paulo',
    2500.00
  ),
  (
    2,
    '9876543210',
    'Funcionário 2',
    30,
    'Rio de Janeiro',
    3000.00
  ),
  (
    3,
    '4567891230',
    'Funcionário 3',
    35,
    'Belo Horizonte',
    2800.00
  );