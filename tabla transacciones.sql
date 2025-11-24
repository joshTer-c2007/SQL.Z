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

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(78945, '75369', 200, 'C', '20/09/2023', '23:30');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(53147, '32102', 500.65, 'D', '15/06/2022', '17:55');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(32548, '21001', 1600, 'C', '17/05/2021', '16:37');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(32165, '51437', 1050, 'D', '25/04/2020', '15:48');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(78542, '02147', 300, 'D', '20/03/2019', '22:19');

insert into transacciones(codigo, numero_cuenta, monto, tipo,fecha, hora)
values(23210, '32015', 400, 'C','20/07/2023', '13:55');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(35412, '85214', 600, 'D', '07/12/2015', '20:14');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(54193, '96325', 800, 'D', '06/11/2012', '11:00');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(95124, '74125', 900, 'D', '23/10/2002', '9:00');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(54143, '85213', 2000, 'C', '11/09/1999', '7:30');

select * from transacciones

select * from transacciones
where tipo like 'D%'

select * from transacciones
where monto::numeric between 200 and 2000

select * from transacciones 
where monto:: numeric >100 and monto:: numeric <500
and extract(month from fecha)=9
and extract(month from fecha)between 14 and 20

update transacciones 
set tipo='T'
where monto:: numeric >100 and monto:: numeric <500
and extract(month from fecha)=9
and extract(month from fecha)between 14 and 20

delete from transacciones
where extract(month from fecha)=8
and extract(month from fecha)between 14 and 20

select * from transacciones
where tipo= 'C' and numero_cuenta between '222001' and '22004'

select * from transacciones 
where codigo between 1 and 5 and numero_cuenta between '22002' and '22004'

select * from transacciones
alter table transacciones
add column banco char(10)

create table banco(
codigo_banco int primary key,
codigo_transaccion int,
detalle varchar(100)
)

alter table transacciones
add constraint transacciones_banco_fk
foreign key (banco)
references transacciones(codigo_banco)
