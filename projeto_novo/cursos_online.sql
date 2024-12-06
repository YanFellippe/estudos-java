CREATE DATABASE IF NOT EXISTS cursos_online;
USE cursos_online;

CREATE TABLE curso(
	id_curso INT PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(50) NOT NULL,
	turma VARCHAR(5)NOT NULL,
	qtd_alunos INT(10),
	carga_horaria VARCHAR(50),
	data_inicio DATETIME DEFAULT CURRENT_TIMESTAMP,
	data_fim DATETIME,
	situacao CHAR(1) NOT NULL
);

CREATE TABLE pessoa(
	id_pessoa INT PRIMARY KEY AUTO_INCREMENT,
	cpf_cnpj VARCHAR(15) NOT NULL,
	email VARCHAR(100) NOT NULL,
	idade INT(2),
	telefone VARCHAR(11),
    endereco VARCHAR(300),
	situacao CHAR(1) NOT NULL
);

CREATE TABLE aluno(
	id_aluno INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(120) NOT NULL,
	matricula VARCHAR(5) NOT NULL,
	situacao CHAR(1) NOT NULL,
	id_pessoa INT NOT NULL,
	FOREIGN KEY(id_pessoa) REFERENCES pessoa(id_pessoa),
    id_curso INT NOT NULL,
    FOREIGN KEY(id_curso) REFERENCES curso(id_curso)
);

CREATE TABLE professor(
	id_professor INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(120) NOT NULL,
	matricula VARCHAR(5) NOT NULL,
	situacao CHAR(1) NOT NULL,
	id_pessoa INT NOT NULL,
	FOREIGN KEY(id_pessoa) REFERENCES pessoa(id_pessoa),
    id_curso INT NOT NULL,
    FOREIGN KEY(id_curso) REFERENCES curso(id_curso)
);

-- Dados para a tabela curso
INSERT INTO curso (descricao, turma, qtd_alunos, carga_horaria, data_inicio, data_fim, situacao) VALUES 
('Programação Web', 'A1', 30, '60 horas', '2024-01-10 08:00:00', '2024-03-10 08:00:00', 'A'),
('Data Science', 'B1', 25, '80 horas', '2024-02-15 08:00:00', '2024-04-15 08:00:00', 'A'),
('Cloud Computing', 'C1', 20, '50 horas', '2024-03-01 08:00:00', '2024-05-01 08:00:00', 'I'),
('Segurança da Informação', 'D1', 35, '40 horas', '2024-04-01 08:00:00', '2024-06-01 08:00:00', 'A'),
('Inteligência Artificial', 'E1', 18, '100 horas', '2024-05-10 08:00:00', '2024-07-10 08:00:00', 'A');

-- Dados para a tabela pessoa (15 alunos e 5 professores)
INSERT INTO pessoa (cpf_cnpj, email, idade, telefone, endereco, situacao) VALUES 
('12345678901', 'aluno1@example.com', 20, '11999990001', 'Rua A, 123, São Paulo', 'A'),
('12345678902', 'aluno2@example.com', 21, '11999990002', 'Rua B, 456, São Paulo', 'A'),
('12345678903', 'aluno3@example.com', 22, '11999990003', 'Rua C, 789, São Paulo', 'A'),
('12345678904', 'aluno4@example.com', 23, '11999990004', 'Rua D, 101, São Paulo', 'A'),
('12345678905', 'aluno5@example.com', 24, '11999990005', 'Rua E, 202, São Paulo', 'A'),
('12345678906', 'aluno6@example.com', 25, '11999990006', 'Rua F, 303, São Paulo', 'A'),
('12345678907', 'aluno7@example.com', 26, '11999990007', 'Rua G, 404, São Paulo', 'A'),
('12345678908', 'aluno8@example.com', 27, '11999990008', 'Rua H, 505, São Paulo', 'A'),
('12345678909', 'aluno9@example.com', 28, '11999990009', 'Rua I, 606, São Paulo', 'A'),
('12345678910', 'aluno10@example.com', 29, '11999990010', 'Rua J, 707, São Paulo', 'A'),
('12345678911', 'aluno11@example.com', 30, '11999990011', 'Rua K, 808, São Paulo', 'A'),
('12345678912', 'aluno12@example.com', 31, '11999990012', 'Rua L, 909, São Paulo', 'A'),
('12345678913', 'aluno13@example.com', 32, '11999990013', 'Rua M, 1010, São Paulo', 'A'),
('12345678914', 'aluno14@example.com', 33, '11999990014', 'Rua N, 1111, São Paulo', 'A'),
('12345678915', 'aluno15@example.com', 34, '11999990015', 'Rua O, 1212, São Paulo', 'A'),
('12345678916', 'professor1@example.com', 45, '11999990016', 'Rua P, 1313, São Paulo', 'A'),
('12345678917', 'professor2@example.com', 46, '11999990017', 'Rua Q, 1414, São Paulo', 'A'),
('12345678918', 'professor3@example.com', 47, '11999990018', 'Rua R, 1515, São Paulo', 'A'),
('12345678919', 'professor4@example.com', 48, '11999990019', 'Rua S, 1616, São Paulo', 'A'),
('12345678920', 'professor5@example.com', 49, '11999990020', 'Rua T, 1717, São Paulo', 'A');

-- Dados para a tabela aluno
INSERT INTO aluno (nome, matricula, situacao, id_pessoa, id_curso) VALUES 
('Elma Maria Braga', 'A001', 'A', 1, 1),
('Bora Bilson', 'A002', 'A', 2, 2),
('Amostradinho da Silva', 'A003', 'A', 3, 3),
('Saco de Douglerson', 'A004', 'A', 4, 4),
('Raul Lobinho', 'A005', 'A', 5, 5),
('Paphitas', 'A006', 'A', 6, 1),
('Tomas Turban', 'A007', 'A', 7, 2),
('Raul Seixas', 'A008', 'A', 8, 3),
('Lula', 'A009', 'A', 9, 4),
('Bolsonaro', 'A010', 'A', 10, 5),
('Enzo Ferraria', 'A011', 'A', 11, 1),
('Takaramae Nomuro', 'A012', 'A', 12, 2),
('Julius', 'A013', 'A', 13, 3),
('Latrell', 'A014', 'A', 14, 4),
('Akalli', 'A015', 'A', 15, 5);

-- Dados para a tabela professor
INSERT INTO professor (nome, matricula, situacao, id_pessoa, id_curso) VALUES 
('Elon Musk', 'P001', 'A', 16, 1),
('Gustavo Guanabara', 'P002', 'A', 17, 2),
('Erik Wendell', 'P003', 'A', 18, 3),
('Chaterson Gepetui', 'P004', 'A', 19, 4),
('Bootstroffer', 'P005', 'A', 20, 5);