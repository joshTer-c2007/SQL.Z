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
 
