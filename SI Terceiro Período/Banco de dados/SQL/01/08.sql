-- 8) De acordo com o DER abaixo responda:
--

-- a) Informe a cardinalidade para o modelo;
--

-- A cardinalidade para o modelo é uma informação que depende do DER específico que você está utilizando.
-- Ela indica a relação entre as entidades e pode ser do tipo "um para um" (1:1), "um para muitos" (1:N)
-- ou "muitos para muitos" (N:N).
--

-- b) Qual comando SQL para criar a tabela Turma;
CREATE TABLE Disciplina (
  Codigo INT PRIMARY KEY,
  Nome VARCHAR(50),
  NumeroCreditos INT
);
CREATE TABLE Professor (
  Matricula INT PRIMARY KEY,
  CPF VARCHAR(11),
  Nome VARCHAR(50),
  Salario DECIMAL(10, 2)
);
CREATE TABLE Turma (
  Numero INT PRIMARY KEY,
  Sala VARCHAR(20),
  Horario VARCHAR(20),
  Regencia INT,
  DisciplinaID INT,
  FOREIGN KEY (Regencia) REFERENCES Professor(Matricula),
  FOREIGN KEY (DisciplinaID) REFERENCES Disciplina(Codigo)
);
---
-- c) Qual comando SQI para inserir um registro na tabela Turma;
-- Inserindo registros na tabela Disciplina
INSERT INTO Disciplina (Codigo, Nome, NumeroCreditos)
VALUES (1, 'Matemática', 4),
  (2, 'História', 3),
  (3, 'Ciências', 5);
-- Inserindo registros na tabela Professor
INSERT INTO Professor (Matricula, CPF, Nome, Salario)
VALUES (123456, '12345678901', 'João Silva', 5000.00),
  (234567, '98765432109', 'Maria Santos', 6000.00),
  (345678, '45678901234', 'Pedro Costa', 4500.00);
-- Inserindo registros na tabela Turma
INSERT INTO Turma (Numero, Sala, Horario, Regencia, DisciplinaID)
VALUES (1, 'A101', '08:00-10:00', 123456, 1),
  (2, 'B201', '14:00-16:00', 234567, 2),
  (3, 'C301', '10:00-12:00', 345678, 3);