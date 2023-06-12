-- 8) Listar o CPF, Nome Cidade das pessoas que sáo Médicos e Pacientes;
SELECT Médicos.codm
FROM Médicos
  LEFT JOIN Consultas ON Médicos.codm = Consultas.codm
WHERE Consultas.codm IS NULL;