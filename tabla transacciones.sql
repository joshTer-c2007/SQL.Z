create table transacciones(
codigo int primary key,
numero_cuenta char (5) not null,
monto money not null,
tipo char(1) not null,
fecha date not null,
hora time not null
)

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values (12576,'12564',300.00,'C','23/09/2025','13:00')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values (12345,'12758',500.00,'D','30/05/2020','10:00')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values (126473,'12438',1000.00,'D','24/09/2019','14:00')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values (236895,'12327',900.00,'C','12/03/2018','9:00')

select * from transacciones