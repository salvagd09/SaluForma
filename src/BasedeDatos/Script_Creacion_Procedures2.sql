USE SaluForma;
DELIMITER //
CREATE PROCEDURE InsertarEvaluacion(
	in P_DNI_Paciente int,
    in P_DNI_Medico int,
	in P_Fechaev date,
    in p_resultado varchar(200),
    in p_recomendaciones varchar(200),
    in p_tipoevaluacion varchar(50))
BEGIN 
    DECLARE V_ID_Paciente INT;
	DECLARE V_ID_Medico INT;
    SELECT ID_Paciente INTO V_ID_Paciente
    FROM paciente
    WHERE DNI = P_DNI_Paciente;
    SELECT ID_Medico INTO V_ID_Medico
    FROM medico_especialista
    WHERE DNI = P_DNI_Medico;
	INSERT INTO historial_evaluaciones(ID_Paciente,ID_Medico,Fecha_evaluacion,Resultado,Recomendaciones,Tipo_evaluacion) VALUES 
    (V_ID_Paciente,V_ID_Medico,P_Fechaev,p_resultado,p_recomendaciones,p_tipoevaluacion);
END //
DELIMITER //
CREATE PROCEDURE MostrarEvaluacionh()
BEGIN
	SELECT * FROM historial_evaluaciones;
END //
DELIMITER //
CREATE PROCEDURE ActualizarHistorialEvaluacion(	
    IN P_ID_Historial INT,	
	in P_Fechaev date,
    in p_resultado varchar(200),
    in p_recomendaciones varchar(200),
    in p_tipoevaluacion varchar(50))
BEGIN
    UPDATE historial_evaluaciones
    SET Fecha_evaluacion=p_Fechaev,Resultado=p_resultado,Recomendaciones=p_recomendaciones,Tipo_evaluacion=p_tipoevaluacion
    WHERE  ID_Historial=P_ID_Historial;
END //
DELIMITER //
CREATE PROCEDURE EliminarHistorialEvaluacion(IN P_ID_Historial int)
BEGIN
	DELETE FROM historial_evaluaciones WHERE ID_Historial=P_ID_Historial;
END //
DELIMITER //
CREATE PROCEDURE MostrarDoctoresPorArea(IN P_Area_Elegir VARCHAR(20))
BEGIN
	SELECT CONCAT(Nombres_Medico," ",Apellidos_Medico) FROM medico_especialista WHERE Area_Perteneciente=P_Area_Elegir;
END//
DELIMITER //
CREATE PROCEDURE MostrarTurnoDoctor(IN P_NombreCompleto VARCHAR(100))
BEGIN
	SELECT Turno_Perteneciente from medico_especialista WHERE CONCAT(Nombres_Medico,' ',Apellidos_Medico)=P_NombreCompleto;
END //
DELIMITER //
CREATE PROCEDURE MostrarDNI(IN P_NombreCompleto  VARCHAR(100))
BEGIN
	SELECT DNI from medico_especialista WHERE CONCAT(Nombres_Medico,' ',Apellidos_Medico)=P_NombreCompleto;
END //
DELIMITER //
CREATE PROCEDURE VerificarDNI(IN DNI_paciente VARCHAR(8))
BEGIN
    SELECT COUNT(*) AS existe
    FROM paciente
    WHERE DNI = DNI_paciente;
END //