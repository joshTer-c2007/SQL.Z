select count(numero_cuenta) from  cuentas
where numero_cuenta like '1%'
select * from cuentas

select * from usuario

select AVG(cast(saldo as numeric)) 
from cuentas

select SUM(cast(saldo as numeric)) 
from cuentas

select MAX(cast(saldo as numeric)) 
from cuentas

select MIN(cast(saldo as numeric)) 
from cuentas

select limite_credito,sum(limite_credito) from usuario
group by limite_credito


