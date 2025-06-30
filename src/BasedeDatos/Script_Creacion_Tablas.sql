USE saluforma;
/*Script para crear la tabla de pacientes.*/
CREATE TABLE Paciente(ID_Paciente int Primary key AUTO_Increment,Nombres_paciente VARCHAR(50),Apellidos_Paciente VARCHAR(50),
                      DNI VARCHAR(9),Edad int, Peso numeric(5,2),Genero VARCHAR(20),Altura numeric(3,2),Habitos VARCHAR(50));
/*Script para crear la tabla medico especialista*/
CREATE TABLE Medico_Especialista(ID_Medico int Primary key auto_increment,Nombres_Medico VARCHAR(50),Apellidos_Medico VARCHAR(50),
DNI VARCHAR(9),Area_Perteneciente VARCHAR(20),Turno_Perteneciente VARCHAR(20));
/*Script para crear la tabla del historial de evaluaciones de cada paciente relacionado al ID_Paciente y al ID_Medico*/
CREATE TABLE Historial_Evaluaciones(ID_Historial int Primary key auto_increment, ID_Paciente int not null, ID_Medico int not null,
Fecha_evaluacion DATE,Resultado VARCHAR(200),Recomendaciones VARCHAR(200),Tipo_evaluacion VARCHAR(50), 
FOREIGN KEY(ID_Paciente) REFERENCES Paciente(ID_Paciente),
FOREIGN KEY(ID_Medico) REFERENCES Medico_Especialista(ID_Medico));
/*Script para crear la tabla relacionada a las citas y que va a estar relacionada con el medico y el paciente.*/
CREATE TABLE Cita(ID_Cita int Primary key auto_increment,ID_Paciente int not null, ID_Medico int not null,Area_Elegida VARCHAR(50),
Fecha Date, Precio numeric(5,2),Motivo VARCHAR(50),Evaluacion_Realizada VARCHAR(50),
FOREIGN KEY(ID_Paciente) REFERENCES Paciente(ID_Paciente),
FOREIGN KEY(ID_Medico) REFERENCES Medico_Especialista(ID_Medico));
/*Script para crear la tabla relacionada a las derivaciones y que va a estar relacionada con el medico, el paciente  y el especialista
que va a realizar las pruebas adicionales */
/*Aqui se modifico el tipo de dato del campo habitos para que se puedan añadir mas cosas*/
ALTER TABLE Paciente
MODIFY COLUMN habitos VARCHAR(1000);
ALTER TABLE Paciente 
/*Aqui para el DNI de los doctores, el especialista al que has sido derivado y al medico especialista se les altero el campo de dni
haciendo que solo acepte 8 caracteres como maximo y se amplio la cantidad de caracteres que acepta motivo.*/
MODIFY COLUMN DNI VARCHAR(8);
ALTER TABLE especialista_derivacion
MODIFY COLUMN DNI VARCHAR(8);
ALTER TABLE medico_especialista
MODIFY COLUMN DNI VARCHAR(8);
ALTER TABLE cita
MODIFY COLUMN Motivo VARCHAR(1000);
/*Aqui se establece que la cita tiene una hora y más atributos que antes*/
ALTER TABLE cita 
ADD Hora VARCHAR(5);
ALTER TABLE cita
ADD Nombre_Paciente VARCHAR(100);
ALTER TABLE cita 
ADD Nombre_Doctor VARCHAR(100);
ALTER TABLE cita
ADD Telefono VARCHAR(9);
ALTER TABLE cita
ADD Codigo_Boleta VARCHAR(50);
ALTER TABLE cita
ADD Metodo_Pago VARCHAR(20);
ALTER TABLE cita
ADD Monto_Pago DECIMAL(5,2);
ALTER TABLE cita
ADD Estado_Pago VARCHAR(50);
CREATE TABLE Usuarios(
 id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    correo VARCHAR(100) UNIQUE,
    contraseña VARCHAR(100),
    rol ENUM('admin', 'medico', 'paciente') NOT NULL
);