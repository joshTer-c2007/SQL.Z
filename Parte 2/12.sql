create table consumibles (
      codigo int not null,
	  nombre varchar(50) not null,
	  stock int not null,
	  constraint consumibles_pk primary key (codigo)
)

create table proveedores (
       codigo int not null,
	   nombre varchar (50) not null,
	   telefono char(10) not null,
	   constraint proveedores_pk primary key (codigo)
)

create table consumibles_por_proveedor(
       cc_codigo_consumibles int not null,
	   cc_codigo_proveedor int not null,
	   cc_precio money not null,
	   constraint consumible_fk foreign key(cc_codigo_consumibles) references consumibles (codigo),
	   constraint proveedor_fk foreign key(cc_codigo_proveedor) references proveedores (codigo),
	   constraint consumibles_por_proveedor_pk primary key(cc_codigo_consumibles,cc_codigo_proveedor)
)

insert into consumibles(codigo,nombre,stock)
values(100,'Doritos',200);
insert into consumibles(codigo,nombre,stock)
values(290,'Papas',190);
insert into consumibles(codigo,nombre,stock)
values(124,'Takis',403);
insert into consumibles(codigo,nombre,stock)
values(380,'Coca Cola',500);
insert into consumibles(codigo,nombre,stock)
values(560,'Kchitos',234)

insert into proveedores(codigo,nombre,telefono)
values(1,'Snacks SA',0934789);
insert into proveedores(codigo,nombre,telefono)
values(2,'Lays',09864537);
insert into proveedores(codigo,nombre,telefono)
values(3,'Fritulays EC',09354637);

select * from consumibles
select * from proveedores

insert into consumibles_por_proveedor( cc_codigo_consumibles, cc_codigo_proveedor, cc_precio)
values(100,1,0.48);
insert into consumibles_por_proveedor( cc_codigo_consumibles, cc_codigo_proveedor, cc_precio)
values(100,2,0.52);
insert into consumibles_por_proveedor( cc_codigo_consumibles, cc_codigo_proveedor, cc_precio)
values(560,3,0.60);
insert into consumibles_por_proveedor( cc_codigo_consumibles, cc_codigo_proveedor, cc_precio)
values(124,1,0.30);
insert into consumibles_por_proveedor( cc_codigo_consumibles, cc_codigo_proveedor, cc_precio)
values(290,3,0.20)

select * from consumibles_por_proveedor

select co.nombre,co.codigo,pr.nombre,cc.cc_precio from consumibles co,proveedores pr,consumibles_por_proveedor cc
where cc.cc_codigo_consumibles = co.codigo
and cc.cc_codigo_proveedor=pr.codigo
and co.codigo = 100
