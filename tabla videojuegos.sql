create table videojuegos(
codigo int primary key,
nombre varchar (100) not null,
descripcion varchar(300),
valoracion int not null
)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23568,'Dragon Ball Figthers Z','Accion y pelea',30.00)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23245,'Super smash bros 4','Accion y pelea',20.00)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23327,'Super Smash Bros Ultimate','Accion y pelea',60.00)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23456,'Dragon Ball Dokkan','Aventura',00.00)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23419,'Dragon Ball Gekishin','Puzzle',00.00)

select * from videojuegos