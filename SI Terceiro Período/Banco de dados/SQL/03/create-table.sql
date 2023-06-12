-- Tabela Ambulatórios
CREATE TABLE Ambulatórios (
  nroa INT PRIMARY KEY,
  andar INT,
  capacidade INT
);
-- Tabela Médicos
CREATE TABLE Médicos (
  codm INT PRIMARY KEY,
  CPF VARCHAR(11),
  nome VARCHAR(100),
  idade INT,
  cidade VARCHAR(100),
  especialidade VARCHAR(100),
  nroa INT,
  FOREIGN KEY (nroa) REFERENCES Ambulatórios(nroa)
);
-- Tabela Pacientes
CREATE TABLE Pacientes (
  ggdp INT PRIMARY KEY,
  CPF VARCHAR(11),
  nome VARCHAR(100),
  idade INT,
  cidade VARCHAR(100),
  doença VARCHAR(100)
);
-- Tabela Consultas
CREATE TABLE Consultas (
  codm INT,
  codp INT,
  data DATE,
  hora TIME,
  FOREIGN KEY (codm) REFERENCES Médicos(codm),
  FOREIGN KEY (codp) REFERENCES Pacientes(ggdp)
);
-- Tabela Funcionários
CREATE TABLE Funcionários (
  codf INT PRIMARY KEY,
  CPF VARCHAR(11),
  nome VARCHAR(100),
  idade INT,
  cidade VARCHAR(100),
  salário DECIMAL(10, 2)
);