create table videojuegos(
codigo int primary key,
nombre varchar (100) not null,
descripcion varchar(300),
valoracion int not null
)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23568,'Dragon Ball Figthers Z','Accion y pelea',10)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23245,'Super smash bros 4','Accion y pelea',10)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23327,'Super Smash Bros Ultimate','Accion y pelea',9)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23456,'Dragon Ball Dokkan','Aventura',8)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values (23419,'Dragon Ball Gekishin','Puzzle',4)

select * from videojuegos

select * from videojuegos
where nombre like 'C%'

select * from videojuegos
where valoracion 
between 00.00 and 20.00

select * from videojuegos 
where descripcion is null

