-- 9) Listar o Código dos pacientes que têm consultas marcadas com todos os médicos:
SELECT CPF,
  nome,
  cidade
FROM (
    SELECT CPF,
      nome,
      cidade
    FROM Médicos
    UNION
    SELECT CPF,
      nome,
      cidade
    FROM Pacientes
    UNION
    SELECT CPF,
      nome,
      cidade
    FROM Funcionários
  ) AS Pessoas;