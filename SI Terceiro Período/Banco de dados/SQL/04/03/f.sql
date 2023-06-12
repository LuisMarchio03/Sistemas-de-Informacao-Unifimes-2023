-- f) Listar todos os funcionários com seu nome, a descrição do cargo, 
-- a descrição do departamento e a data de admissão:
SELECT f.NomeFunc,
  c.DescCargo,
  d.DescDept,
  f.DtAdmissao
FROM Funcionário f
  JOIN Cargo c ON f.Cargo = c.CdCargo
  JOIN Depto d ON f.Depto = d.CdDepto;