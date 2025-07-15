USE saluforma;
DELIMITER //
CREATE PROCEDURE InsertarCliente(
	in P_Nombres VARCHAR(50),
    in P_Apellidos VARCHAR(50),
    in P_DNI VARCHAR(8),
    in P_Edad int,
    in P_Peso decimal(5,2),
    in P_Genero varchar(20),
    in P_Altura decimal(3,2),
    in P_Habitos VARCHAR(1000))
BEGIN 
	INSERT INTO paciente (Nombres_paciente,Apellidos_Paciente,DNI,Edad,Peso,Genero,Altura,Habitos) VALUES 
    (P_Nombres,P_Apellidos,P_DNI,P_Edad,P_Peso,P_Genero,P_Altura,P_Habitos);
END //
DELIMITER //
CREATE PROCEDURE MostrarPacientes(in p_DNI VARCHAR(8))
BEGIN
	SELECT * FROM paciente where DNI=p_DNI;
END //
DELIMITER //
CREATE PROCEDURE ActualizarPacientes(IN p_nombres VARCHAR(50),IN P_Apellidos_Paciente VARCHAR(50),IN p_DNI VARCHAR(8),
IN p_Edad int,IN p_peso DECIMAL(5,2),
IN p_Genero VARCHAR(20),IN P_Altura DECIMAL(3,2),
IN P_Habitos VARCHAR(1000))
BEGIN
	UPDATE paciente
	SET Nombres_paciente=IFNULL(p_nombres,Nombres_paciente),
    Apellidos_Paciente=IFNULL(P_Apellidos_Paciente,Apellidos_Paciente),
    Edad=IFNULL(p_Edad,Edad),Peso=IFNULL(p_Peso,Peso),Genero=IFNULL(p_Genero,Genero),Altura=IFNULL(P_Altura,Altura),Habitos=IFNULL(P_Habitos,Habitos)
    WHERE DNI=p_DNI;
END //
DELIMITER //
CREATE PROCEDURE EliminarPacientes(IN p_DNI VARCHAR(8))
BEGIN
	DELETE FROM paciente WHERE p_DNI=DNI;
END //
DELIMITER //
CREATE PROCEDURE InsertarMedico(
	in P_Nombres VARCHAR(50),
    in P_Apellidos VARCHAR(50),
    in P_DNI VARCHAR(8),
    in P_Area_Perteneciente VARCHAR(20),
    in P_Turno_Perteneciente VARCHAR(20))
BEGIN 
	INSERT INTO medico_especialista(Nombres_Medico,Apellidos_Medico,DNI,Area_Perteneciente,Turno_Perteneciente) VALUES 
    (P_Nombres,P_Apellidos,P_DNI,P_Area_Perteneciente,P_Turno_Perteneciente);
END //
DELIMITER //
CREATE PROCEDURE MostrarMedicos(IN p_DNI VARCHAR(8))
BEGIN
	SELECT * FROM medico_especialista where DNI=p_DNI;
END //
DELIMITER //
CREATE PROCEDURE ActualizarMedicos(	in P_Nombres VARCHAR(50),
    in P_Apellidos VARCHAR(50),
    in P_DNI VARCHAR(8),
    in P_Area_Perteneciente VARCHAR(20),
    in P_Turno_Perteneciente VARCHAR(20))
BEGIN
	UPDATE medico_especialista
    SET Nombres_Medico=P_Nombres,Apellidos_Medico=P_Apellidos,Area_Perteneciente=P_Area_Perteneciente,
    Turno_Perteneciente=P_Turno_Perteneciente
    WHERE DNI=p_DNI;
END //
DELIMITER //
CREATE PROCEDURE EliminarMedico(IN p_DNI VARCHAR(8))
BEGIN
	DELETE FROM medico_especialista WHERE p_DNI=DNI;
END //
DELIMITER //
CREATE PROCEDURE InsertarEspecialista(
	in P_Nombres VARCHAR(50),
    in P_Apellidos VARCHAR(50),
    in P_DNI VARCHAR(8),
    in P_Area_Correspondiente VARCHAR(20),
    in P_Turno_Perteneciente VARCHAR(20))
BEGIN 
	INSERT INTO especialista_derivacion(Nombres_Esepecialista,Apellidos_Especialista,DNI,Area_Correspondiente,Turno_Perteneciente) VALUES 
    (P_Nombres,P_Apellidos,P_DNI,P_Area_Correspondiente,P_Turno_Perteneciente);
END //
DELIMITER //
CREATE PROCEDURE MostrarEspecialistasDerivacion(IN p_DNI VARCHAR(8))
BEGIN
	SELECT * FROM especialista_derivacion where DNI=p_DNI;
END //
DELIMITER //
CREATE PROCEDURE ActualizarEspecialistaDerivacion(	in P_Nombres VARCHAR(50),
    in P_Apellidos VARCHAR(50),
    in P_DNI VARCHAR(8),
    in P_Area_Correspondiente VARCHAR(20),
    in P_Turno_Perteneciente VARCHAR(20))
BEGIN
	UPDATE especialista_derivacion
    SET Nombres_Especialista=P_Nombres,Apellidos_Esepecialista=P_Apellidos,Area_Correspondiente=P_Area_Correspondiente,
    Turno_Perteneciente=P_Turno_Perteneciente
    WHERE DNI=p_DNI;
END //
DELIMITER //
CREATE PROCEDURE EliminarEspecialistaDerivacion(IN p_DNI VARCHAR(8))
BEGIN
	DELETE FROM especialista_derivacion WHERE p_DNI=DNI;
END //
DELIMITER //
CREATE PROCEDURE InsertarCita(
	in P_DNI_Paciente int,
    in P_DNI_Medico int,
	in P_Area_Elegida VARCHAR(50),
    in P_Fecha DATE,
    in P_Precio DECIMAL(5,2),
    in P_Motivo VARCHAR(1000),
    in P_Evaluacion VARCHAR(50),
    in P_Hora VARCHAR(5))
BEGIN 
    DECLARE V_ID_Paciente INT;
	DECLARE V_ID_Medico INT;
    SELECT ID_Paciente INTO V_ID_Paciente
    FROM paciente
    WHERE DNI = P_DNI_Paciente;
    SELECT ID_Medico INTO V_ID_Medico
    FROM medico_especialista
    WHERE DNI = P_DNI_Medico;
     INSERT INTO cita(ID_Paciente,ID_Medico,Area_Elegida,Fecha,Precio,Motivo,Evaluacion_Realizada,Hora,Nombre_Paciente,Nombre_Doctor,Telefono) VALUES 
    (V_ID_Paciente,V_ID_Medico,P_Area_Elegida,P_Fecha,P_Precio,P_Motivo,P_Evaluacion,P_Hora,P_NombresCompletos_Paciente,P_NombreCompleto_Medico,P_Telefono);
END //
DELIMITER //
CREATE PROCEDURE InsertarPagoenCita(
    IN P_NombresCompletos VARCHAR(100),
	IN P_NombreDoctor VARCHAR(100),
    IN P_Fecha DATE,
	in P_Codigo_Boleta VARCHAR(50),
    in P_Metodo_Pago VARCHAR(50),
    in P_Monto_Pago DECIMAL(5,2),
    IN P_Estado_Pago VARCHAR(50))
BEGIN
	UPDATE Cita SET Codigo_Boleta=P_Codigo_Boleta, Metodo_Pago=P_Metodo_Pago, Monto_Pago=P_Monto_Pago, Estado_Pago=P_Estado_Pago
    WHERE Nombre_Paciente=P_NombresCompletos AND Fecha=P_Fecha AND Nombre_Doctor=P_Nombre_Doctor;
END //
DELIMITER //
CREATE PROCEDURE CancelarPago(
	IN P_Codigo_Boleta VARCHAR(50)
)
BEGIN
	UPDATE Cita SET Metodo_Pago=null, Monto_Pago=0.0,Estado_Pago='Pendiente' WHERE Codigo_Boleta=P_Codigo_Boleta;
END//
DELIMITER //
CREATE PROCEDURE MostrarCitas(in p_ID INT,in p_Fecha DATE)
BEGIN
	SELECT ID_Paciente,Nombre_Paciente,ID_Medico,Nombre_Doctor,Area_Elegida,Evaluacion_Realizada,Motivo,Fecha,Hora,Telefono FROM 
    citas WHERE ID_Cita=p_ID and Fecha=p_Fecha;
END //
DELIMITER //
CREATE PROCEDURE ActualizarCitas(	
    IN P_ID_Cita INT,	
	in P_Area_Elegida VARCHAR(50),
    in P_Fecha DATE,
    in P_Precio DECIMAL(5,2),
    in P_Motivo VARCHAR(1000),
    in P_Evaluacion VARCHAR(50),
    in P_Hora VARCHAR(5))
BEGIN
    UPDATE cita
    SET Area_Elegida=P_Area_Elegida,Fecha=P_Fecha,Precio=P_Precio,Motivo=P_Motivo,Evaluacion_Realizada=P_Evaluacion,
    Hora=P_Hora
    WHERE  ID_Cita=P_ID_Cita;
END //
DELIMITER //
CREATE PROCEDURE EliminarCita(IN p_ID_Cita int)
BEGIN
    DELETE FROM cita WHERE ID_Cita=p_ID_Cita;
END //
DELIMITER //
CREATE PROCEDURE ObtenerRol(IN p_Correo VARCHAR(100),IN p_Contraseña VARCHAR(100))
BEGIN
	SELECT rol FROM usuarios WHERE correo=p_Correo and contraseña=p_Contraseña;
END //
DELIMITER //
CREATE PROCEDURE NombresPacientes()
BEGIN
	SELECT CONCAT(Nombres_paciente,' ',Apellidos_Paciente) from paciente;
END//
Select * from citas;