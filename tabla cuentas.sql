create table cuentas(
      numero_cuenta char(5) primary key,
	  cedula_propietario char(5) not null,
	  fecha_creacion date not null,
	  saldo money
)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('12568','17453','22/07/2019',300.00)
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('13568','17463','25/07/2018',250.00)
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('12453','17493','12/09/2020',760.00)
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('12838','13453','17/10/2019',305.00)
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('12523','17434','07/02/2015',350.00)
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('14568','13453','29/04/2023',800.00)
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('12365','17234','25/05/2016',1000.00)
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values('12564','17263','25/12/2024',500.00)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25569,17504,'15/01/2030',500);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25570,17500,'01/11/2028',600);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25571,17501,'22/01/2023',700);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25572,17508,'30/05/2022',800);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25573,17509,'15/03/2023',900);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25574,17510,'15/05/2023',1000);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25575,17507,'15/09/2023',1500);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25576,17515,'15/10/2024',2500);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25577,17512,'15/08/2025',3500);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25578,17503,'15/06/2017',4500);

select * from cuentas

select numero_cuenta,saldo from cuentas

select * from cuentas
where fecha_creacion between current_date-interval '2 months'and current_date

select numero_cuenta,saldo from cuentas
where fecha_creacion between current_date-interval '2 months'and current_date

select * from cuentas
where cedula_propietario like '17%'

update cuentas set saldo =10 
where cedula_propietario like '17%'

delete from cuentas
where cedula_propietario like '10%'

select * from cuentas
where saldo:: numeric >100 and saldo:: numeric<1000

select * from cuentas
where saldo:: numeric =0 or cedula_propietario like '%2'