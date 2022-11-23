insert into disciplina (codigo, nome) values ('ES4A4', 'Engenharia de Software 4');

insert into aluno (matricula, nome, endereco, data_ingresso, data_conclusao) values ('SP32332', 'Gabriel Barbosa', 'Rua 1, 1, Rio de Janeiro, RJ', '2021-07-01', '2021-07-01');
insert into aluno (matricula, nome, endereco, data_ingresso, data_conclusao) values ('SP12345', 'Giorgian de Arrascaeta', 'Rua 1, 1, São Paulo, SP', '2022-01-01', '2021-07-01');

insert into aluno_has_disciplina(matricula, codigo, nota) values ( 'SP32332', 'LP2A4', 1);
insert into  aluno_has_disciplina(matricula, codigo, nota) values ( 'SP12345', 'LP2A4', 2);