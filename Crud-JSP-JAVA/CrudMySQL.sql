create database dbus;

use dbus;

create table usuarios(
id int auto_increment not null primary key,
nombres varchar(50),
appaterno varchar(50),
apmaternos varchar(50),
edad int
);

insert into usuarios(nombres,appaterno,apmaternos,edad)values ("Pepe","Cardenas","Mendes",20);

select * from usuarios;

update usuarios set nombres="pepa",appaterno="vazquez",apmaternos="perez",edad=8 where id =3;

delete from usuarios where id = 3;