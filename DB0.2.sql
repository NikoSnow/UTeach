CREATE DATABASE uteach;
use uteach;
#drop database uteach;
create table Usuario(
id INTEGER (10) primary key,
correo VARCHAR (50),
contraseña VARCHAR (30),
nombre VARCHAR (50),
programa VARCHAR (25),
semestre INTEGER (2),
tipo INTEGER (20)
#estado DOUBLE 
);

create table TutoriaTutor(
id INTEGER(10),
idTutor INTEGER (10),
materia VARCHAR (30),
precio FLOAT (7),
dia INTEGER (2),
hora TIME,
FOREIGN KEY (idTutor) REFERENCES Usuario(id)
);

create table TutoriaSesion(
idSesion INTEGER (10) primary key,
idTutor INTEGER (10),
idEstudiante INTEGER(10),
horas varchar (20),
tema VARCHAR (20),
fecha VARCHAR (20),
precio INTEGER(20),
cantidad INTEGER(20),
#calificaion DOUBLE,
FOREIGN KEY (idEstudiante) REFERENCES Usuario(id),
FOREIGN KEY (idTutor) REFERENCES Usuario(id)
);


select * from usuario;
select * from 	TutoriaSesion;