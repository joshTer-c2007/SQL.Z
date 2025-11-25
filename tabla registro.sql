create table registro(
codigo_registro int primary key,
cedula_empleado char(10) not null,
fecha date not null,
hora time not null
)

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(234567,'17804923','23/07/2020','10:00');

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(234657,'17856894','12/08/2018','20:00');

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(233421,'17845682','10/04/2018','9:00');

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(233273,'17467890','15/09/2014','12:00');

insert into registro(codigo_registro,cedula_empleado,fecha,hora)
values(234517,'17328970','23/11/2021','14:00');

insert into registro(codigo_registro, cedula_empleado, fecha, hora)
values(12347, '1735642583', '28/12/2015', '16:00');

insert into registro(codigo_registro, cedula_empleado, fecha, hora)
values(12389, '1707416984', '16/07/2012', '8:00');

insert into registro(codigo_registro, cedula_empleado, fecha, hora)
values(12349, '1778541235', '17/03/2013', '10:00');

insert into registro(codigo_registro, cedula_empleado, fecha, hora)
values(12310, '1742158637', '14/05/2017', '19:00');

insert into registro(codigo_registro, cedula_empleado, fecha, hora)
values(12311, '1756321784', '15/05/2004', '20:00');

insert into registro(codigo_registro, cedula_empleado, fecha, hora)
values(12358, '1712546328', '07/07/2008', '21:00');

insert into registro(codigo_registro, cedula_empleado, fecha, hora)
values(12378, '1725785413', '02/09/2023', '4:00');


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

select * from registro 
where extract(month from fecha)=9 or cedula_empleado like '17%'

select * from registro
where extract(month from fecha)=8
and extract(month from fecha)between 8 and 12

select * from registro
alter table registro
add column empleado char(10)

create table empleado(
codigo_empleado int,
nombre varchar(25),
fecha date,
hora time,
constraint empleado_pk primary key(codigo_empleado)
)

alter table empleado
add constraint registro_empleado_fk
foreign key(empleado)
references empleado(codigo_empleado)

select codigo_registro, count(codigo_registro) from registro
group by codigo_registro