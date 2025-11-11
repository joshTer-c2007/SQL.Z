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