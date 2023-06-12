-- 2) Listar o Nome, a Especialidade e o Número do Ambulatório de todos os m
-- Ortopedistas;
SELECT Médicos.nome,
  Médicos.especialidade,
  Médicos.nroa
FROM Médicos
WHERE Médicos.especialidade = 'Ortopedista';