-- d) Listar o nome, o sexo e a data de admissão de todos os funcionários com cargo C3:
SELECT NomeFunc,
  Sexo,
  DtAdmissao
FROM Funcionário
WHERE Cargo = 'C3';