CREATE TABLE EMPREGADOS (
  emp_numero BIGSERIAL NOT NULL PRIMARY KEY,
  ultimonome VARCHAR(20) NOT NULL,
  primeironome VARCHAR(20) NOT NULL,
  funcao VARCHAR(20) NOT NULL,
  salario DECIMAL(10, 2) NOT NULL,
  departamento VARCHAR(20) NOT NULL
);
CREATE TABLE VENDAS (
  COD BIGSERIAL NOT NULL PRIMARY KEY,
  VENDEDOR VARCHAR(20) NOT NULL,
  DATA DATE NOT NULL,
  VALOR DECIMAL(10, 2)
);