-- 6) Listar o Nome e a data das consultas dos pacientes;
SELECT Pacientes.nome,
  Consultas.data
FROM Pacientes
  JOIN Consultas ON Pacientes.CPF = Consultas.codp;