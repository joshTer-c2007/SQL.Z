create table videojuegos(
codigo int primary key,
nombre varchar (100) not null,
descripcion varchar(300),
valoracion int not null
)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(28934,'Dragon ball Legends','Pelea y destreza',10)

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

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(07563, 'Call of Duty', 'juego de terror', 9);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(85421, 'Free Fire', 'juego de accion', 7);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(93475, 'Call of Clans', 'juego de terror', 10);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(15983, 'Fornite', 'juego de suspenso', 10);

insert into videojuegos(codigo, nombre, valoracion)
values(35784, 'Minecraft', 3);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(54682, 'Tom and Jerry', 'juego de comedia', 8);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(01456, 'Ajedres', 'juego de psicoligia', 6);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(70215, 'God of Ward', 'juego de aprendisaje', 7);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(63240, 'Crash', 'juego de deprote', 9);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(63549, 'Dragon Ball', 'juego de baile', 8);




select * from videojuegos

delete from videojuegos where codigo=28934

select * from videojuegos
where nombre like 'C%'

select * from videojuegos
where valoracion 
between 00.00 and 20.00

select * from videojuegos 
where descripcion is null

select * from videojuegos
where valoracion>9

update videojuegos
set descripcion='Mejor puntuado'
where valoracion>9

delete from videojuegos
where valoracion<7

select * from videojuegos
where nombre like 'C%' and valoracion = 7

select * from videojuegos 
where codigo between 3 and 7 or valoracion >7

select * from videojuegos
where valoracion >7 and nombre like 'C%' or valoracion >8 and nombre like 'D%'

select * from videojuegos

alter table videojuegos
add column plataforma char(10)

create table plataforma(
id_plataforma int ,
nombre_plataforma varchar(50),
codigo_videojuego int,
constraint plataforma_pk primary key(id_plataforma)
)

insert into plataforma(id_plataforma,nombre_plataforma,codigo_videojuego)
values(127839,'Steam',329);
insert into plataforma(id_plataforma,nombre_plataforma,codigo_videojuego)
values(127372,'Steam',099);
insert into plataforma(id_plataforma,nombre_plataforma,codigo_videojuego)
values(122901,'PS4',3929);
insert into plataforma(id_plataforma,nombre_plataforma,codigo_videojuego)
values(12374,'Nintendo',309);
insert into plataforma(id_plataforma,nombre_plataforma,codigo_videojuego)
values(123829,'PS4',3920);
insert into plataforma(id_plataforma,nombre_plataforma,codigo_videojuego)
values(12490,'Nintendo',3249);
insert into plataforma(id_plataforma,nombre_plataforma,codigo_videojuego)
values(244575,'DragonBall',229);
insert into plataforma(id_plataforma,nombre_plataforma,codigo_videojuego)
values(124738,'DragonBall',129)

alter table videojuegos
add constraint productos_plataforma_fk
foreign key (plataforma)
references plataforma(id_plataforma)

select nombre,descripcion,valoracion from videojuegos
where (
descripcion like '%Guerra%'
and valoracion>7
)
or(
nombre like 'C%'
and valoracion >8
and descripcion like 'D%'
)

select nombre_plataforma,count(nombre_plataforma) from plataforma
group by nombre_plataforma

select round(AVG(valoracion),2) as valoracion from videojuegos

drop table videojuegos;

drop table plataforma