create database PI_PetShower;
use PI_PetShower;

/*tabela client*/
create table Cliente (
cli_id int (4) auto_increment,
cli_nome varchar(30) not null,
cli_endereco varchar(30) not null,
cli_dataNascimento date not null,
cli_cpf varchar(15) not null,
cli_bairro varchar(15) not null,
cli_cidade varchar(15) not null,
cli_uf varchar(3) not null,
cli_cep varchar(10) not null,
cli_telefone varchar(10) not null,
primary key (cli_id));

/*tabela filial*/
create table Filial (
filial_id int(4) auto_increment,
filial_cidade varchar(25),
filial_telefone varchar(10),
primary key (filial_id));

/*tabela produtos*/
create table Produto (
produto_id int(4) auto_increment,
produto_nome varchar(20) not null,
produto_valor double,
produto_estoque int(5)not null,
produto_dataCadastro date not null,
primary key (produto_id));

/*tabela vendas*/
create table Vendas (
venda_id int (4) auto_increment,
venda_data date not null,
venda_id_cli int (4) references Cliente(cli_id),
venda_valorTotal double not null,
primary key	(venda_id));

/*scripts*/
select * from Vendas;
