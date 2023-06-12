-- 7) Listar o Nome e o Andar dos médicos que atendem em consultórios com capacidade
-- superior a 5;
SELECT Médicos.nome,
  Ambulatórios.andar
FROM Médicos
  JOIN Ambulatórios ON Médicos.nroa = Ambulatórios.nroa
WHERE Ambulatórios.capacidade > 5;