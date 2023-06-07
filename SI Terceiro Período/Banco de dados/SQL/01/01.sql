-- Obter a lista dos empregados chamados José Silva, ordenados do menor para o maior salário:
SELECT *
FROM EMPREGADOS
WHERE ultimonome = 'Silva'
  AND primeironome = 'José'
ORDER BY salario;