-- Listar qual a média das vendas dos dias 10/05/2014 e 20/05/2014:
SELECT AVG(VALOR) AS media_vendas
FROM VENDAS
WHERE DATA BETWEEN '2014-05-10' AND '2014-05-20';