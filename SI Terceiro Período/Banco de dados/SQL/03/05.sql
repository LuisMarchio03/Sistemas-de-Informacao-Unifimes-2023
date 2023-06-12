-- 5) Listar o Nome dos médicos que têm consultas marcadas;
SELECT DISTINCT Médicos.nome
FROM Médicos
  JOIN Consultas ON Médicos.codm = Consultas.codm;