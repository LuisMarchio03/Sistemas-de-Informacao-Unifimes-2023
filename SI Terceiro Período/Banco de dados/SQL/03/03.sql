-- 3) Listar o Nome, a Idade e a Doença dos Pacientes da cidade de Mineiros:
SELECT nome,
  idade,
  doença
FROM Pacientes
WHERE cidade = 'Mineiros';