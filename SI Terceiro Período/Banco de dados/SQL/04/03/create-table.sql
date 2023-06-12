-- Criação da tabela Funcionário
CREATE TABLE Funcionário (
  IdFunc INT PRIMARY KEY,
  NomeFunc VARCHAR(50),
  DtAdmissao DATE,
  Sexo CHAR(1),
  Depto VARCHAR(2),
  Cargo VARCHAR(2) -- outras colunas necessárias
);
-- Criação da tabela Cargo
CREATE TABLE Cargo (
  CdCargo VARCHAR(2) PRIMARY KEY,
  DescCargo VARCHAR(50),
  VirSalario DECIMAL(10, 2) -- outras colunas necessárias
);
-- Criação da tabela Depto
CREATE TABLE Depto (
  CdDepto VARCHAR(2) PRIMARY KEY,
  DescDept VARCHAR(50) -- outras colunas necessárias
);