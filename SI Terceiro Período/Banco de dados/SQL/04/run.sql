-- Inserção de registros
-- Inserção de dados na tabela Trabalhador
INSERT INTO Trabalhador (numero, nome, dataNasc, especialidade)
VALUES (1, 'João Silva', '1990-01-01', 'Carpinteiro');
INSERT INTO Trabalhador (numero, nome, dataNasc, especialidade)
VALUES (2, 'Maria Santos', '1985-05-10', 'Pedreiro');
-- Inserção de dados na tabela Produto
INSERT INTO Produto (codigoP, descricaoP, unidade)
VALUES (1, 'Parafuso', 'Unidade');
INSERT INTO Produto (codigoP, descricaoP, unidade)
VALUES (2, 'Martelo', 'Unidade');
-- Inserção de dados na tabela Comprador
INSERT INTO Comprador (codigoC, nome, cidade, telefone)
VALUES (1, 'José Oliveira', 'São Paulo', '111111111');
INSERT INTO Comprador (codigoC, nome, cidade, telefone)
VALUES (2, 'Ana Souza', 'Rio de Janeiro', '222222222');
-- Inserção de dados na tabela Venda
INSERT INTO Venda (
    codigoP,
    codigoC,
    dataV,
    quantidadeV,
    valorV,
    dataRecebim
  )
VALUES (1, 1, '2022-01-01', 5, 10.50, '2022-01-05');
INSERT INTO Venda (
    codigoP,
    codigoC,
    dataV,
    quantidadeV,
    valorV,
    dataRecebim
  )
VALUES (2, 2, '2022-02-01', 3, 15.75, '2022-02-05');
-- Inserção de dados na tabela MateriaPrima
INSERT INTO MateriaPrima (codigoMp, descricaoMP, quantArmazenada)
VALUES (1, 'Aço', 100);
INSERT INTO MateriaPrima (codigoMp, descricaoMP, quantArmazenada)
VALUES (2, 'Madeira', 50);
-- Inserção de dados na tabela Utiliza
INSERT INTO Utiliza (codigoP, codigoMp, dataU, quantidadeU)
VALUES (1, 1, '2022-01-01', 2);
INSERT INTO Utiliza (codigoP, codigoMp, dataU, quantidadeU)
VALUES (2, 2, '2022-02-01', 1);
-- Inserção de dados na tabela Fornecedor
INSERT INTO Fornecedor (codigoF, nomeF, cidade, telefone)
VALUES (1, 'Fornecedor A', 'São Paulo', '333333333');
INSERT INTO Fornecedor (codigoF, nomeF, cidade, telefone)
VALUES (2, 'Fornecedor B', 'Rio de Janeiro', '444444444');
-- Inserção de dados na tabela Compra
INSERT INTO Compra (
    codigoMp,
    codigoF2,
    dataC,
    quantidadeC,
    valorC,
    dataPagam
  )
VALUES (1, 1, '2022-01-01', 10, 150.50, '2022-01-10');
INSERT INTO Compra (
    codigoMp,
    codigoF2,
    dataC,
    quantidadeC,
    valorC,
    dataPagam
  )
VALUES (2, 2, '2022-02-01', 5, 100.25, '2022-02-10');