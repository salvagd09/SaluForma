USE Saluforma;
Select * from Historial_evaluaciones;
Select * from paciente;
Select * from personal;
CREATE TABLE Notificaciones(id INT PRIMARY KEY AUTO_INCREMENT, DNI_personal VARCHAR(8), Nombre_Entidad VARCHAR(100), Destinatario VARCHAR(100), Fecha DATE, Mensaje VARCHAR(100),
FOREIGN KEY (DNI_personal) REFERENCES Personal(DNI));
Select * from Personal;
DELIMITER //
CREATE PROCEDURE ObtenerIdporDNI(
	IN P_DNI VARCHAR(8)
)
BEGIN
	Select id from Personal where DNI =P_DNI;
END //
DELIMITER //
DELIMITER //
CREATE PROCEDURE insertarNotificaciones(IN P_DNI_personal VARCHAR(8), IN P_Nombre_Entidad VARCHAR(100), 
IN P_Destinatario VARCHAR(100), IN P_Fecha DATE, IN P_Mensaje VARCHAR(100),IN P_Motivo_Mensaje VARCHAR(100))
BEGIN
	INSERT INTO Notificaciones (DNI_personal,Nombre_Entidad,Destinatario,Fecha,Mensaje,Motivo_Mensaje) VALUES (P_DNI_personal,P_Nombre_Entidad,P_Destinatario,P_Fecha,P_Mensaje,P_Motivo_Mensaje);
END //
Select * from Notificaciones;

