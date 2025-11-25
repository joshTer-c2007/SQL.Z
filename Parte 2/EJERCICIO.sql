create table usuarios(
       id_usu int,
	   nombre varchar(25) not null,
	   fecha_nacimiento date,
	   constraint usuarios_pk primary key(id_usu)
)

create table grupo(
       id_gr int,
	   nombre varchar(25) not null,
	   descripcion varchar(75),
	   fecha_creacion date,
	   constraint grupo_pk primary key(id_gr)
)

insert into usuarios(id_usu,nombre,fecha_nacimiento)
values(2890,'Marco','20/07/2003');
insert into usuarios(id_usu,nombre,fecha_nacimiento)
values(2832,'Azul','19/02/2013');
insert into usuarios(id_usu,nombre,fecha_nacimiento)
values(2097,'Emily','29/09/2009');
insert into usuarios(id_usu,nombre,fecha_nacimiento)
values(2356,'Jhosep','20/07/2007');
insert into usuarios(id_usu,nombre,fecha_nacimiento)
values(2201,'Maria','03/11/2004')

select * from usuarios

select * from grupo

insert into grupo(id_gr,nombre,descripcion,fecha_creacion)
values(23,'Los Desconectados','Cuando cargan una idea, ya se fue la reunión','12/08/2024');
insert into grupo(id_gr,nombre,descripcion,fecha_creacion)
values(13,'Los Tardigrados','Responden… pero en 3 a 5 días hábiles.','30/10/2019');
insert into grupo(id_gr,nombre,descripcion,fecha_creacion)
values(45,'Los Antiproductivos','Ninguna tarea completada desde 2012.','24/04/2012');
insert into grupo(id_gr,nombre,descripcion,fecha_creacion)
values(65,'Multiversales del caos','Cada uno piensa que están hablando de un tema distinto.','24/02/2023');
insert into grupo(id_gr,nombre,descripcion,fecha_creacion)
values(89,'Los Mensaje Fijado','Preguntan cosas que están en el primer renglón','23/09/2025')

create table usuario_grupo(
       us_id int not null,
	   gr_id int not null,
	   constraint usuarios_fk foreign key(us_id) references usuarios,
	   constraint grupo_fk foreign key(gr_id) references grupo,
	   constraint usuario_grupo_pk primary key(us_id,gr_id)
)

insert into usuario_grupo(us_id,gr_id)
values (2890,23);
insert into usuario_grupo(us_id,gr_id)
values (2832,23);
insert into usuario_grupo(us_id,gr_id)
values (2097,13);
insert into usuario_grupo(us_id,gr_id)
values (2356,45);
insert into usuario_grupo(us_id,gr_id)
values (2201,89)


select * from usuarios us,grupo gr,usuario_grupo ug
where ug.us_id=us.id_usu
and ug.gr_id=gr.id_gr





create table habitaciones (
       habitacion_numero int,
	   precio_por_noche decimal not null,
	   piso int not null,
	   max_personas int,
	   constraint habitaciones_pk primary key(habitacion_numero)
)



create table huespedes(
       id_hu int,
	   nombres varchar(45) not null,
	   apellidos varchar(45) not null,
	   telefono char (10),
	   correo varchar (45),
	   ciudad varchar (45),
	   pais varchar (45),
	   constraint huespedes_pk primary key (id_hu)
)

INSERT INTO habitaciones (habitacion_numero, precio_por_noche, piso, max_personas) VALUES
(101, 45.00, 1, 1),
(102, 60.50, 1, 2),
(103, 65.00, 1, 2),
(201, 80.00, 2, 3),
(202, 85.00, 2, 3),
(301, 120.00, 3, 4),
(305, 150.00, 3, 2),
(401, 200.00, 4, 2);

INSERT INTO huespedes (id_hu, nombres, apellidos, telefono, correo, ciudad, pais) VALUES
(1, 'Juan', 'Pérez', '0991234567', 'juan.perez@email.com', 'Madrid', 'España'),
(2, 'María', 'González', '0987654321', 'maria.gonzalez@test.com', 'Buenos Aires', 'Argentina'),
(3, 'Carlos', 'Rodríguez', '5512345678', 'carlos.rod@mail.com', 'Ciudad de México', 'México'),
(4, 'Ana', 'Smith', '1234567890', 'ana.smith@usa.com', 'New York', 'USA'),
(5, 'Luis', 'Ramírez', '0998877665', 'luis.ramirez@web.com', 'Santiago', 'Chile'),
(6, 'Laura', 'Fernández', '3344556677', 'laura.fer@info.com', 'Bogotá', 'Colombia'),
(7, 'Alessandro', 'Rossi', '3334455666', 'alessandro@italia.it', 'Roma', 'Italia');

create table reservas(
       inicio_fecha date,
	   fin_fecha date,
	   habitacion int not null,
	   huesped_id int not null,
	   constraint habitaciones_fk foreign key (habitacion) references habitaciones,
	   constraint huespedes_fk foreign key (huesped_id) references huespedes,
	   constraint reservas_pk primary key (habitacion,huesped_id)
)



create table ciudad(
        id_ciu int,
		nombre varchar(45) not null,
		constraint ciudad_pk primary key(id_ciu)
)
create table municipio(
        id_mun int,
		nombre varchar (45),
		ciu_id int,
		constraint municipio_pk primary key(id_mun)
)
create table proyecto(
        id_pro int,
		proyecto varchar(50) not null,
		monto money not null,
		fecha_inicio date,
		fecha_entrega date,
		constraint proyecto_pk primary key(id_pro)		
)

INSERT INTO municipio (id_mun, nombre, ciu_id) VALUES
(1, 'Municipio Libertador', 101),
(2, 'Municipio Chacao', 101),
(3, 'Municipio Sucre', 102),
(4, 'Municipio Baruta', 102),
(5, 'Municipio Girardot', 103),
(6, 'Municipio Valencia', 104);

INSERT INTO proyecto (id_pro, proyecto, monto, fecha_inicio, fecha_entrega) VALUES
(1, 'Pavimentación Calle Principal', 50000.00, '2023-01-15', '2023-06-30'),
(2, 'Iluminación Parque Central', 12500.50, '2023-02-10', '2023-04-15'),
(3, 'Remodelación Escuela #5', 85000.00, '2023-03-01', '2023-12-20'),
(4, 'Construcción Plaza Sol', 45000.00, '2023-05-20', '2023-09-30'),
(5, 'Red de Agua Potable', 150000.00, '2023-06-01', '2024-01-15');

create table union_mun(
         municipio_id int not null,
		 proyecto_id int not null,
		 constraint municipio_fk foreign key(municipio_id) references municipio,
		 constraint proyecto_fk foreign key(proyecto_id) references proyecto,
		 constraint union_mu_pk primary key (municipio_id,proyecto_id)
)


