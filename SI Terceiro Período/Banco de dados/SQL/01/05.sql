-- Listar o total das vendas de cada vendedor:
SELECT VENDEDOR,
  SUM(VALOR) AS total_vendas
FROM VENDAS
GROUP BY VENDEDOR;