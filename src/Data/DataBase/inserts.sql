-- Terminales

insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (2,'Salitre','Bogotá',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (1,'Satélite del Norte','Bogotá',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (4,'Terminal de Tibasosa','Tibasosa',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (3,'Terminal de Duitama','Sogamoso',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (6,'Terminal El Tambo','El Tambo',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (5,'Terminal de Pasto','Pasto',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (8,'Estación de Tame','Tame',100,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (7,'Terminal de Arauca','Arauca',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (10,'Terminal de transportes de Barrancabermeja','Barrancabermeja',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (9,'Terminal de Bucaramanga','Bucaramanga',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (12,'Terminal del Norte','Medellín',300,1);
insert into terminal(idalterno,nombre,ciudad,capacidad,estado) values (11,'Estación de Envigado','Envigado',100,1);


-- Empresas

insert into empresa(nombre,nit,email) values ('Copetrinas','890.215.624','soporte@copetrinas.com');
insert into empresa(nombre,nit,email) values ('Pelicano','856.267.754','soporte@pelicano.com');
insert into empresa(nombre,nit,email) values ('Del norte','874.522.758','soporte@delnorte.com');
insert into empresa(nombre,nit,email) values ('Cigarras','824.452.325','soporte@cigarras.com');
insert into empresa(nombre,nit,email) values ('Conquistadores','860.322.145','soporte@cigarras.com');


-- Usuarios

insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('rtoledol','Reinaldo','Toledo Leguizamón','rtoledol@gmail.com','12345',3045486587,0,'1997-07-13');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('nguerrerog','Nicol','Guerrero Gutierrez','nguerrerog@gmail.com','12345',3117886793,0,'1999-02-18');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('jzambranol','Juan Camilo','Zambrano Lopez','jzambranol@gmail.com','12345',3117834268,0,'2001-01-07');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('apenarr','Angel Gullermo','Peñarredonda Silva','apenarredonda@gmail.com','12345',3048547168,0,'2000-10-09');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('lcastiblan','Laura Andrea','Castiblanco Suarez','lcastiblancos@gmail.com','12345',3046845288,1,'1998-08-31');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('shernandez','Santiago','Hernández Chaparro','shernandezch@gmail.com','12345',3115488487,1,'2002-08-15');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('jclavijo','Jonathan','Clavijo Rodriguez','jclavijo@gmail.com','12345',3225854829,1,'2001-04-21');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('cgutierrez','Camilo','Gutierrez Silva','cgutierrez@gmail.com','12345',3118545825,1,'1994-01-17');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('osalcedo','Octavio Jose','Salcedo Parra','osalcedo@gmail.com','12345',3045248924,2,'2001-03-18');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('ecadenar','Estefany','Cadena Ruiz','ecadenar@gmail.com','12345',3041554755,2,'2000-04-11');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('sfjimenez','Sara','Florez Jimenez','sfjimenez@gmail.com','12345',3045881155,2,'1992-03-07');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('gjparedez','Gregorio','Jaramillo Paredes','gjparedez@gmail.com','12345',3041595175,2,'1996-02-01');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('olarab','Omar','Lara Bonilla','olarab@gmail.com','12345',3118118514,3,'1997-11-08');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('oscarar','Oscar','Agudelo Rojas','oscarar@gmail.com','12345',3228224488,3,'1992-01-10');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('vmarquesp','Victor','Marques Paredes','vmarquesp@gmail.com','12345',30418513128,3,'1991-05-03');
insert into usuario(usuario,nombre,apellido,correo,contrasena,telefono,rol,fecha_nacimiento) values ('aaaayuda','Andrés','Astaiza Amado','aaaayuda@gmail.com','12345',3116218115,3,'1992-04-11');


-- Rutas
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (1,'Por comenzar',4,1,'2022-07-14','2022-07-14',40000);
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (2,'Por comenzar',2,8,'2022-06-29','2022-06-29',30000);
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (3,'Por comenzar',12,5,'2022-05-13','2022-05-13',20000);
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (4,'Por comenzar',7,3,'2022-08-08','2022-08-08',40000);
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (5,'Por comenzar',6,9,'2022-11-17','2022-11-17',30000);
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (1,'Por comenzar',2,7,'2022-06-29','2022-06-29',15000);
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (2,'Por comenzar',6,3,'2022-07-09','2022-07-09',20000);
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (3,'Por comenzar',12,2,'2022-06-30','2022-06-30',40000);
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (4,'Por comenzar',3,7,'2022-12-27','2022-12-27',25000);
insert into ruta(idempresa,estado,origen,destino,fecha_salida,fecha_llegada,precio) values (5,'Por comenzar',9,6,'2022-11-17','2022-11-17',30000);
