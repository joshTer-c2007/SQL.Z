create table estudiantes(
cedula char(10) primary key,
nombre varchar(50) not null,
apellido varchar(50) not null,
email varchar (50) not null,
fecha_nacimiento date not null
)

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values('17459820','Carlos','Rodriguez','Carlos34@gmail.com','20/02/2006')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values('17367897','Marco','Diaz','Marcos@gmail.com','19/04/2007')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values('17507864','Alfrdo','Moran','Alfredo.idk@gmail.com','16/01/2008')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values('17356789','Martin','Hidalgo','Martin56@gmail.com','09/06/2008')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values('17456209','Elvis','Cocho','Elvis@gmail.com','13/05/2007')

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1235476801,'Raul','Martínez','raumart01@gmail.com','04/02/2003');
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1735476802,'Mario','Guaman','MarioG25@gmail.com', '08/12/2000');
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1235476803,'Roberto','Quishpe','RobQuishpe64@gmail.com','29/06/2005');
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1735476804,'Paul','Noguera','PaulNog55@gmail.com','22/07/2002');
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1235476805,'Marcelo','Ramos','MarceloR72@gmail.com','15/08/2008');
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1735476806,'Anthony','Agual','KAgual22@gmail.com','25/03/2002');
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1235476807,'Paula','Celi','PauCeli31@gmail.com','30/09/2010' );
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1735476808,'Mónica','Martínez','MoniMar15@gmail.com','22/01/2001');
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1235476809,'Anabel','Perlaza','WPerlaza18@gmail.com','12/04/2000');
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)
values (1735476810,'Sofía','Jimenez','SofiJz22@gmail.com','22/01/2001');


select * from estudiantes

select cedula,nombre from estudiantes

select * from estudiantes 
where cedula like '17%'

select nombre from estudiantes
where nombre like 'A%'

select * from estudiantes
where cedula like '17%'

update estudiantes
set apellido ='Hernandez'
where cedula like '17%'

delete from estudiantes
where cedula like '%10'

select * from estudiantes
where nombre like 'M%' or apellido like '%Z'

select * from estudiantes
where cedula like '18%' 

select * from estudiantes
where cedula like '17%' or cedula like '%06'

select * from estudiantes

alter table estudiantes
add column profesores char(10)

create table profesores(
codigo int,
nombre varchar(50),
constraint profesores_pk primary key(codigo)
)
select * from profesores

insert into profesores(codigo,nombre)
values (23490,'Marcos');
insert into profesores(codigo,nombre)
values (13465,'Carlos');
insert into profesores(codigo,nombre)
values (09345,'Kerlly');
insert into profesores(codigo,nombre)
values (46378,'Dario')

alter table estudiantes
add constraint estudiantes_profesores_fk
foreign key(profesores)
references profesores(codigo)

select * from estudiantes e
where e.apellido like '%n%'

select * from profesores 

select nombre, count(nombre) from profesores
group by nombre

