create table productos(
     codigo int primary key,
	 nombre varchar(50) not null,
	 descripcion varchar(200),
	 precio money not null,
	 stock int not null
)

insert into productos(codigo,nombre,precio,stock)
values(12458,'Camisa',30.00,34)

insert into productos(codigo,nombre,precio,stock)
values(34256,'Pantalon',20.00,27)

 insert into productos (codigo,nombre,descripcion,precio,stock)
 values (134567,'Leche','Bebida',23.00,80)

 insert into productos (codigo,nombre,descripcion,precio,stock)
 values (15678,'Chorizo','Embutido',20.50,20)

 insert into productos (codigo,nombre,descripcion,precio,stock)
 values (12546,'Manzana','Fruta',13.30,10)

 insert into productos (codigo,nombre,descripcion,precio,stock)
 values (23456,'Lego','Juguete',14.00,50)

 insert into productos (codigo,nombre,descripcion,precio,stock)
 values (31567,'Jeans','Prenda',40.00,70)

select * from productos
where nombre = '%q'

select * from productos
where descripcion is null 

select * from productos
where precio:: numeric between 23.00 and 40.00

insert into productos(codigo,nombre,descripcion,precio,stock) 
values (1,'Jabón','Lava todo',3.50,10);
insert into productos(codigo,nombre,descripcion,precio,stock) 
values (2,'Shampoo','Savital',2.50,20);
insert into productos(codigo,nombre,descripcion,precio,stock) 
values (3,'Deja','Deja',1.50,30);
insert into productos(codigo,nombre,descripcion,precio,stock) 
values (4,'Pasta dental','Fortident',3.0,40);
insert into productos(codigo,nombre,descripcion,precio,stock) 
values (5,'Cera','Cera de piso',2.50,50);
insert into productos(codigo,nombre,precio,stock) 
values (6,'Pan',1.50,50);
insert into productos(codigo,nombre,precio,stock) 
values (7,'Queso',5.50,60);
insert into productos(codigo,nombre,precio,stock)
values (8,'Leche',2.50,70);
insert into productos(codigo,nombre,precio,stock)
values (9,'Jamon',1.00,120);
insert into productos(codigo,nombre,precio,stock)
values (10,'Coca Cola',3.50,300);


select * from productos
where descripcion is null

update productos set stock=0
where descripcion is null

select * from productos

delete from productos 
where descripcion is null

select * from productos
where precio:: numeric <= 10

select * from productos
where nombre like 'M%'

select * from productos 
where stock = 0

select nombre,stock,precio from productos
where nombre like '%m%'
or stock=0
or precio:: numeric =0;
