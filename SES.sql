select * from productos
alter table productos
add column descuento char(10) 

create table descuento(
codigo char(2) ,
descripcion varchar(20) ,
constraint descuento_pk primary key(codigo)
)

alter table productos
add constraint productos_descuento_fk
foreign key (descuento)


references descuento(codigo)
select * from descuento

insert into descuento (codigo,descripcion)
values('21','XD');
insert into descuento (codigo,descripcion)
values('45','XF');
insert into descuento (codigo,descripcion)
values('39','XC')


