-- c) Listar todos os funcionários do sexo masculino que trabalham no departamento D5:
SELECT NomeFunc
FROM Funcionário
WHERE Sexo = 'M'
  AND Depto = 'D5';