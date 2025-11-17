create table registro(
codigo_registro int primary key,
cedula_empleado char(10) not null,
fecha date not null,
hora time not null
)

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(234567,'17804923','23/07/2020','10:00')

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(234657,'17856894','12/08/2018','20:00')

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(233421,'17845682','10/04/2018','9:00')

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(233273,'17467890','15/09/2014','12:00')

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(234517,'17328970','23/11/2021','14:00')

select * from registro

select cedula_empleado,fecha,hora from registro

select * from registro
where hora between '7:00'and '14:00'

select * from registro
where hora > '8:00'

select * from registro
where extract(month from fecha)=8

update registro set cedula_empleado='082345679'
where extract(month from fecha)=8

delete from registro 
where extract(month from fecha)=6
