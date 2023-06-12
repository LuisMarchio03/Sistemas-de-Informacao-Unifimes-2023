-- Criação das tabelas
CREATE TABLE Trabalhador (
  numero INT,
  nome VARCHAR(50),
  dataNasc DATE,
  especialidade VARCHAR(50),
  PRIMARY KEY (numero)
);
CREATE TABLE Produto (
  codigoP INT,
  descricaoP VARCHAR(50),
  unidade VARCHAR(10),
  PRIMARY KEY (codigoP)
);
CREATE TABLE Comprador (
  codigoC INT,
  nome VARCHAR(50),
  cidade VARCHAR(50),
  telefone VARCHAR(20),
  PRIMARY KEY (codigoC)
);
CREATE TABLE Venda (
  codigoP INT,
  codigoC INT,
  dataV DATE,
  quantidadeV INT,
  valorV DECIMAL(10, 2),
  dataRecebim DATE,
  PRIMARY KEY (codigoP, codigoC, dataV),
  FOREIGN KEY (codigoP) REFERENCES Produto(codigoP),
  FOREIGN KEY (codigoC) REFERENCES Comprador(codigoC)
);
CREATE TABLE MateriaPrima (
  codigoMp INT,
  descricaoMP VARCHAR(50),
  quantArmazenada INT,
  PRIMARY KEY (codigoMp)
);
CREATE TABLE Utiliza (
  codigoP INT,
  codigoMp INT,
  dataU DATE,
  quantidadeU INT,
  FOREIGN KEY (codigoP) REFERENCES Produto(codigoP),
  FOREIGN KEY (codigoMp) REFERENCES MateriaPrima(codigoMp),
  PRIMARY KEY (codigoP, codigoMp, dataU)
);
CREATE TABLE Fornecedor (
  codigoF INT,
  nomeF VARCHAR(50),
  cidade VARCHAR(50),
  telefone VARCHAR(20),
  PRIMARY KEY (codigoF)
);
CREATE TABLE Compra (
  codigoMp INT,
  codigoF2 INT,
  dataC DATE,
  quantidadeC INT,
  valorC DECIMAL(10, 2),
  dataPagam DATE,
  FOREIGN KEY (codigoMp) REFERENCES MateriaPrima(codigoMp),
  FOREIGN KEY (codigoF2) REFERENCES Fornecedor(codigoF),
  PRIMARY KEY (codigoMp, codigoF2, dataC)
);