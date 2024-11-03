create database bdusuarios;

use bdusuarios;

create table sexo(
id int auto_increment not null primary key,
sexo varchar(50)
);

insert into sexo(sexo)values ("Masculino");
insert into sexo(sexo)values ("Femenino");

select *from sexo;

create table usuarios(
id int auto_increment not null primary key,
nombres varchar(100),
apellidos varchar(100),
fksexo int ,
edad int,
fnacimiento date,
foto longblob,
foreign key (fksexo) references sexo(id) on delete cascade on update cascade
);

insert into usuarios(nombres,apellidos,fksexo,edad,fnacimiento,foto)value("Fran","Perez",1,20,"01/01/2005","foto");

select * from usuarios;

show variables like "max_connections";

show status like "threads_connected";

select usuarios.id,usuarios.nombres,usuarios.apellidos,sexo.sexo,usuarios.edad,usuarios.fnacimiento,usuarios.foto from usuarios inner join sexo on usuarios.fksexo = sexo.id;

update usuarios set usuarios.nombres=?,usuarios.apellidos=?,usuarios.fksexo=?, usuarios.edad=?, usuarios.fnacimiento=?, usuarios.foto=? where usuarios.id=? ;

delete from usuarios where usuarios.id = 2;


