DROP SCHEMA IF EXISTS bus_buddy;
CREATE SCHEMA bus_buddy;
USE bus_buddy;

drop table if exists usuario;
drop table if exists empresa;
drop table if exists personal;

create table usuario(
    idusuario int auto_increment not null,
    usuario varchar(45),
    nombre varchar(45),
    apellido varchar(45),
    correo varchar(45),
    contrasena varchar(45),
    telefono long,
    rol int,
    fecha_nacimiento date,
    primary key(idusuario)
);

create table empresa(
    idempresa int auto_increment not null,
    nombre varchar(45),
    nit varchar(45),
    email varchar(45),
    primary key (idempresa)
);

create table personal(
    idpersonal int auto_increment not null,
    idusuario int not,
    idempresa int not null,
    nombre varchar(45),
    apellido varchar(45),
    telefono long,
    cargo varchar(45),
    eps varchar (45),
    ciudad varchar(45),
    id long,
    pin varchar (45),
    primary key(idpersonal),
    foreign key (idusuario) references usuario(idusuario),
    foreign key (idempresa) references empresa(idempresa)
);

create table conductor(
    idconductor int auto_increment not null,
    idusuario int not null,
    idempresa int not null,
    id long,
    eps varchar (45),
    ciudad varchar (45),
    primary key (idconductor),
    foreign key (idusuario) references usuario (idusuario),
    foreign key (idempresa) references empresa (idempresa)
);

create table administrador_empresa(
    idadministrador_empresa int auto_increment not null,
    idusuario int not null,
    idempresa int not null,
    id long,
    eps varchar (45),
    ciudad varchar (45),
    primary key (idadministrador_empresa),
    foreign key (idusuario) references usuario (idusuario),
    foreign key (idempresa) references empresa (idempresa)
);

create table terminal(
    idterminal int auto_increment not null,
    idalterno int,
    Nombre varchar (45),
    ciudad varchar (45),
    capacidad int,
    estado varchar(45),
    primary key (idterminal)
);

create table administrador_terminal (
    idadministrador_terminal int auto_increment not null,
    idusuario int not null,
    idterminal int not null,
    id long,
    eps varchar (45),
    ciudad varchar (45),
    primary key (idadministrador_terminal),
    foreign key (idusuario) references usuario (idusuario),
    foreign key (idterminal) references terminal (idterminal)
); 

create table bus (
    idbus int auto_increment not null,
    idempresa int not null,
    placa varchar(45),
    marca varchar(45),
    SOAT varchar(45),
    sillas int,
    primary key (idbus),
    foreign key (idempresa) references empresa (idempresa)
);

create table ruta (
    idruta int auto_increment not null,
    idconductor int,
    idempresa int not null,
    idbus int,
    estado varchar (45),
    origen int not null,
    destino int not null,
    fecha_salida date,
    fecha_llegada date,
    precio int not null,
    primary key(idruta),
    foreign key(idconductor) references conductor(idconductor),
    foreign key(idempresa) references empresa(idempresa),
    foreign key(idbus) references bus(idbus),
    foreign key(origen) references terminal(idterminal),
    foreign key(destino) references terminal(idterminal)
);

create table reserva(
    idreserva int auto_increment not null,
    idruta int not null,
    idusuario int not null,
    nombre varchar(45),
    apellido varchar(45),
    id long,
    telefono long,
    telefono_emergencia long,
    silla int,
    estado int,
    primary key(idreserva),
    foreign key(idruta) references ruta(idruta),
    foreign key(idusuario) references usuario(idusuario)
);

create or replace view info_conductores as select conductor.*,usuario.nombre as nombre, usuario.apellido as apellido from conductor, usuario where conductor.idusuario = usuario.idusuario;
create or replace view info_rutas as select ruta.idruta ,empresa.nombre as empresa, concat (usuario.nombre," ", usuario.apellido) as conductor , terminalo.nombre as terminal_origen,
terminalo.ciudad as ciudad_origen,  terminald.nombre as terminal_destino, terminald.ciudad as ciudad_destino, ruta.idbus as bus, ruta.fecha_salida as fecha_salida, 
ruta.fecha_llegada as fecha_llegada, ruta.precio as precio, ruta.estado as estado,conductor.idconductor as idconductor from empresa, usuario, conductor, terminal as terminalo,terminal as terminald, ruta 
where empresa.idempresa = ruta.idempresa and terminalo.idterminal = ruta.origen and terminald.idterminal = ruta.destino
and ruta.idconductor = conductor.idconductor and usuario.idusuario = conductor.idusuario;
create or replace view info_reservas as select 
reserva.idreserva as idreserva,reserva.silla as silla ,reserva.idusuario as  idusuario, ruta.fecha_llegada as fecha_llegada, ruta.fecha_salida as fecha_salida, 
terminal1.ciudad as origen, terminal2.ciudad as destino, reserva.nombre as nombre, reserva.apellido as apellido, reserva.id as id, reserva.estado as estado
from reserva,ruta,terminal as terminal1,terminal as terminal2
 where ruta.origen=terminal1.idterminal and ruta.destino=terminal2.idterminal and reserva.idruta=ruta.idruta;
