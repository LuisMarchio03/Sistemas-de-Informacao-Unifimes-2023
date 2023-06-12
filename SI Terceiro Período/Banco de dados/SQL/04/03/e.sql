-- e) Listar a descrição do cargo com o maior salário:
SELECT DescCargo
FROM Cargo
WHERE VirSalario = (
    SELECT MAX(VirSalario)
    FROM Cargo
  );