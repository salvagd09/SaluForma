USE saluforma;
/*Ejemplos de pacientes*/
INSERT INTO paciente (Nombres_paciente,Apellidos_Paciente,DNI,Edad,Peso,Genero,Altura,Habitos) VALUES ('Carlos Manuel', 'Gonzalez Miranda', '78915362',25,75.2,'Masculino',1.68,'Tomar mucho el fin de semana y no hago mucho ejercicio.');
INSERT INTO paciente (Nombres_paciente,Apellidos_Paciente,DNI,Edad,Peso,Genero,Altura,Habitos) VALUES ('Mario Javier', 'Molina Chavez', '71534829',38,68.4,'Masculino',1.75,'Practico boxeo 3 veces a la semana y me golpean mucho');
INSERT INTO paciente (Nombres_paciente,Apellidos_Paciente,DNI,Edad,Peso,Genero,Altura,Habitos) VALUES ('Andrea Miriam','Holguin Huerta','74236891',48,65.2,'Femenino',1.60,'Consumo mucha gaseosa y no hago muchos ejercicios fisicos.');
ALTER TABLE paciente ADD CONSTRAINT dni_unico UNIQUE (DNI);
Select * from paciente;
ALTER TABLE paciente
ADD Telefono VARCHAR(9);
/*Ejemplos de medicos*/
INSERT INTO Medico_Especialista(Nombres_Medico,Apellidos_Medico,DNI,Area_Perteneciente,Turno_Perteneciente) VALUES('Jose Andres','Perez Sanchez','73568914','Hepatologo','Manana');
INSERT INTO Medico_Especialista(Nombres_Medico,Apellidos_Medico,DNI,Area_Perteneciente,Turno_Perteneciente) VALUES('Guillermo Andres','Torres Perea','71853464','Neurologo','Tarde');
INSERT INTO Medico_Especialista(Nombres_Medico,Apellidos_Medico,DNI,Area_Perteneciente,Turno_Perteneciente) VALUES('Juan Carlos','Duran Diaz','73482164','Gastroenterologo','Tarde');
Select * from Medico_Especialista;
/*Ejemplos de citas*/
INSERT INTO cita(ID_Paciente,ID_Medico,Area_Elegida,Fecha,Precio,Motivo,Evaluacion_Realizada,Hora) VALUES(2,2,'Neurologia','2025-05-08',40,'Me duele la cabeza mas de lo normal y me olvido cosas con mayor facilidad','evaluacion inicial','14:50');
INSERT INTO cita(ID_Paciente,ID_Medico,Area_Elegida,Fecha,Precio,Motivo,Evaluacion_Realizada,Hora) VALUES(3,3,'Gastroenterologia','2025-05-09',30,'Tengo mas apetito de lo normal y mi vision se encuentra mas borrosa que antes','evaluacion inicial','14:30');
INSERT INTO cita(ID_Paciente,ID_Medico,Area_Elegida,Fecha,Precio,Motivo,Evaluacion_Realizada,Hora) VALUES(1,1,'Hepatologia','2025-05-10',35,'Estos dias he estado presentando nauseas y me siento menos energia.','evaluacion inicial','09:30');
Select * from cita;
/*Ejemplos de historial de evaluaciones*/
INSERT INTO historial_evaluaciones(ID_Paciente,ID_Medico,Fecha_evaluacion,Resultado,Recomendaciones,Tipo_evaluacion) VALUES(2,2,'2025-05-08','Necesitamos un analisis de su craneo para saber su mal',null,'evaluacion general');
INSERT INTO historial_evaluaciones(ID_Paciente,ID_Medico,Fecha_evaluacion,Resultado,Recomendaciones,Tipo_evaluacion) VALUES(2,2,'2025-05-08','Por lo visto en esta tomografia usted presenta un hematoma subudral.Es leve','Que se opere usando trepanos y que despues acuda a una terapia de rehabilitacion','Resonancia Magnetica');
INSERT INTO historial_evaluaciones(ID_Paciente,ID_Medico,Fecha_evaluacion,Resultado,Recomendaciones,Tipo_evaluacion) VALUES(3,3,'2025-05-09','Por lo que me habla parece tener diabetes.Neceistamos un analisis de sangre para saber su nivel de diabetes.',null,'evaluacion general');
INSERT INTO historial_evaluaciones(ID_Paciente,ID_Medico,Fecha_evaluacion,Resultado,Recomendaciones,Tipo_evaluacion) VALUES(3,3,'2025-05-09','Por lo visto tiene un nivel en glucosa mas alto de lo normal.Tiene prediabetes','Que tenga una dieta mas saludable y evite tomar gaseosa y alcohol','Resonancia Magnetica');
INSERT INTO historial_evaluaciones(ID_Paciente,ID_Medico,Fecha_evaluacion,Resultado,Recomendaciones,Tipo_evaluacion) VALUES(1,1,'2025-05-10','No se puede determinar que tiene.Necesita una evaluacion de sangre',null,'evaluacion general');
INSERT INTO historial_evaluaciones(ID_Paciente,ID_Medico,Fecha_evaluacion,Resultado,Recomendaciones,Tipo_evaluacion) VALUES(1,1,'2025-05-10','Presenta bilirrubina alta y albumina baja. Parece estar iniciando con cirrosis','Tenga una dieta mas saludable y no consuma mucho alcohol','diagnostico');
SELECT * from historial_evaluaciones;