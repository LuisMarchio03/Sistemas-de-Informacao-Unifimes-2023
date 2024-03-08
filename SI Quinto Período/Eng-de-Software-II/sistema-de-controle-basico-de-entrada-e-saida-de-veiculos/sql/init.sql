-- Tabela de Usuários
CREATE TABLE USERS (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    contato VARCHAR(20)
);

-- Tabela de Veículos
CREATE TABLE VEHICLES (
    id INT PRIMARY KEY AUTO_INCREMENT,
    placa VARCHAR(10) UNIQUE NOT NULL,
    modelo VARCHAR(50),
    cor VARCHAR(20),
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES USERS(id)
);

-- Tabela de Movimentações
CREATE TABLE MOVEMENTS (
    id INT PRIMARY KEY AUTO_INCREMENT,
    entrada DATETIME NOT NULL,
    saida DATETIME,
    valor DECIMAL(10, 2),
    veiculo_id INT,
    FOREIGN KEY (veiculo_id) REFERENCES VEHICLES(id)
);
