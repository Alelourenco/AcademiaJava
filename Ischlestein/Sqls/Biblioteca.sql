create database Biblioteca;
use Biblioteca;

CREATE TABLE Categoria (
  id int not null auto_increment,
  tipo_categoria varchar(50),
  PRIMARY KEY (id),
   Key (tipo_categoria)
);

CREATE TABLE Autor (
  id int not null auto_increment,
  nome varchar(100) not null,
  nacionalidade varchar(100),
  PRIMARY KEY (id)
);

CREATE TABLE Editora (
  id int not null auto_increment,
  nome varchar(50),
  PRIMARY KEY (id)
);

CREATE TABLE Livro (
  ISBN varchar (500) not null,
  titulo varchar (100) not null,
  ano int not null,
  fk_editora int not null,
  fk_categoria int not null,
  PRIMARY KEY (ISBN),
  FOREIGN KEY (fk_categoria) REFERENCES Categoria(id),
  FOREIGN KEY (fk_editora) REFERENCES Editora(id)
);

CREATE TABLE LivroAutor (
  id int not null auto_increment,
  fk_autor int not null,
  fk_livro varchar(50) not null,
  PRIMARY KEY (id),
  FOREIGN KEY (fk_autor) REFERENCES Autor(id),
  FOREIGN KEY (fk_livro) REFERENCES Livro(ISBN)
);


/*Insere valores na tabela categoria*/
insert into categoria (tipo_categoria) value ('Literatura Juvenil');
insert into categoria (tipo_categoria) value ('Ficção Científica');
insert into categoria (tipo_categoria) value ('Humor');
insert into categoria (tipo_categoria) value ('Ação');
insert into categoria (tipo_categoria) value ('Romance');


select * from categoria;

/*Insere valores na tabela autor*/
insert into autor (nome) value ('J.K. Rowling');
insert into autor (nome, nacionalidade) value ('Clive Staples Lewis','Inglaterra');
insert into autor (nome, nacionalidade) value ('Affonso Solano','Brasil');
insert into autor (nome, nacionalidade) value ('Marcos Piangers','Brasil');
insert into autor (nome, nacionalidade) value ('Ciro Botelho - Tiririca','Brasil');
insert into autor (nome, nacionalidade) value ('Bianca Mól','Brasil');

select * from autor;

/*Insere valores na tabela editora*/
insert into editora (nome) value ('Rocco');
insert into editora (nome) value ('Wmf Martins Fontes');
insert into editora (nome) value ('Casa da Palavra');
insert into editora (nome) value ('Belas Letras');
insert into editora (nome) value ('Matrix');
select * from editora;

/*Insere valores na tabela de livros*/
insert into LIVRO values('8532511015','Harry Potter e A Pedra Filosofal','2000',1,1);
insert into LIVRO values('9788578270698','As Crônicas de Nárnia','2009',2,1);
insert into LIVRO values('9788577343348','O Espadachim de Carvão','2013',3,2);
insert into LIVRO values('9788581742458','O Papai É Pop','2015',4,3);
insert into LIVRO values('9788582302026','Pior Que Tá Não Fica','2015',5,3);
insert into LIVRO values('9788577345670','Garota Desdobrável','2015',3,1);
insert into LIVRO values('8532512062','Harry Potter e o Prisioneiro de Azkaban','2000',1,1);
