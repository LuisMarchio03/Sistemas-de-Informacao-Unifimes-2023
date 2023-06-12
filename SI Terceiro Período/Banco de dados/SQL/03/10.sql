-- 10) Listar a maior capacidade dos ambulatórios.
SELECT CPF,
  nome,
  cidade
FROM (
    SELECT CPF,
      nome,
      cidade
    FROM Médicos
    INTERSECT
    SELECT CPF,
      nome,
      cidade
    FROM Pacientes
  ) AS Pessoas;