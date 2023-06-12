-- Inserção de dados na tabela Funcionário
INSERT INTO Funcionário (IdFunc, NomeFunc, DtAdmissao, Sexo, Depto, Cargo)
VALUES (1, 'João Silva', '2022-01-15', 'M', 'D5', 'C3');
INSERT INTO Funcionário (IdFunc, NomeFunc, DtAdmissao, Sexo, Depto, Cargo)
VALUES (2, 'Maria Souza', '2021-09-05', 'F', 'D2', 'C2');
-- Inserção de dados na tabela Cargo
INSERT INTO Cargo (CdCargo, DescCargo, VirSalario)
VALUES ('C1', 'Gerente', 5000.00);
INSERT INTO Cargo (CdCargo, DescCargo, VirSalario)
VALUES ('C2', 'Analista', 3000.00);
-- Inserção de dados na tabela Depto
INSERT INTO Depto (CdDepto, DescDept)
VALUES ('D1', 'Vendas');
INSERT INTO Depto (CdDepto, DescDept)
VALUES ('D2', 'Marketing');