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
    telefono varchar(45),
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
    idusuario int not null,
    nombre varchar(45),
    apellido varchar(45),
    telefono varchar (45),
    cargo varchar(45),
    eps varchar (45),
    ciudad varchar(45),
    id varchar (45),
    pin varchar (45),
    primary key(idpersonal),
    foreign key (idusuario) references usuario(idusuario)
);

create table conductor(
    idconductor int auto_increment not null,
    idusuario int not null,
    idempresa int not null,
    id varchar (45),
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
    id varchar (45),
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
    id varchar (45),
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
    id varchar(45),
    telefono varchar(45),
    telefono_emergencia varchar(45),
    silla int,
    primary key(idreserva),
    foreign key(idruta) references ruta(idruta),
    foreign key(idusuario) references usuario(idusuario)
)
