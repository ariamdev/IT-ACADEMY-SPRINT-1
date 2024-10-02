--Universidad Queries--

---------------------------------------------------------------------------------------------------------------------
USE universidad;

--1.Retorna un llistat amb el primer cognom, segon cognom i el nom de tots els/les alumnes.
--El llistat haurà d'estar ordenat alfabèticament de menor a major pel primer cognom, segon cognom i nom.
SELECT apellido1, apellido2, nombre FROM persona WHERE tipo='alumno' ORDER BY apellido1, apellido2, nombre;

--2.Esbrina el nom i els dos cognoms dels alumnes que no han donat d'alta el seu número de telèfon en la base de dades.
SELECT apellido1, apellido2, nombre FROM persona WHERE tipo='alumno' AND telefono IS NULL;

--3.Retorna el llistat dels alumnes que van néixer en 1999.
SELECT * FROM persona WHERE tipo = 'alumno' AND YEAR(fecha_nacimiento) = 1999;

--4.Retorna el llistat de professors/es que no han donat d'alta el seu número de telèfon en la base de dades i a més el seu NIF acaba en K.
SELECT * FROM persona WHERE tipo = 'profesor' AND telefono is null AND SUBSTRING(nif,9,1) = 'K';

--5.Retorna el llistat de les assignatures que s'imparteixen en el primer quadrimestre, en el tercer curs del grau que té l'identificador 7.
SELECT * FROM asignatura WHERE cuatrimestre = 1 AND curso = 3 AND id_grado = 7;

--6.Retorna un llistat dels professors/es juntament amb el nom del departament al qual estan vinculats. El llistat ha de retornar quatre columnes, primer cognom, segon cognom, nom i nom del departament. El resultat estarà ordenat alfabèticament de menor a major pels cognoms i el nom.
SELECT p.apellido1 AS firstSurname, p.apellido2 AS secondSurname, p.nombre AS teacherName, d.nombre AS departmentName FROM persona p JOIN profesor pr ON p.id = pr.id_profesor JOIN departamento d ON pr.id_departamento = d.id WHERE p.tipo = 'profesor' ORDER BY apellido1, apellido2, p.nombre;

--7.Retorna un llistat amb el nom de les assignatures, any d'inici i any de fi del curs escolar de l'alumne/a amb NIF 26902806M.
SELECT a.nombre AS subjectName, c.anyo_inicio AS startingYear,c.anyo_fin AS endingYear FROM asignatura a JOIN alumno_se_matricula_asignatura asm ON a.id = asm.id_asignatura JOIN persona p ON asm.id_alumno = p.id JOIN curso_escolar c ON asm.id_curso_escolar = c.id WHERE p.nif = '26902806M';

--8.Retorna un llistat amb el nom de tots els departaments que tenen professors/es que imparteixen alguna assignatura en el Grau en Enginyeria Informàtica (Pla 2015).
SELECT d.nombre AS departmentName FROM departamento d JOIN profesor pr ON pr.id_departamento = d.id JOIN asignatura a ON pr.id_profesor = a.id_profesor JOIN grado g ON g.id = a.id_grado WHERE g.nombre = 'Grado en Ingeniería Informática (Plan 2015)' GROUP BY d.id;

--9.Retorna un llistat amb tots els alumnes que s'han matriculat en alguna assignatura durant el curs escolar 2018/2019.
SELECT apellido1 AS firstSurname, apellido2 AS secondSurname, p.nombre AS studentName FROM asignatura a JOIN alumno_se_matricula_asignatura asm ON a.id = asm.id_asignatura JOIN persona p ON asm.id_alumno = p.id JOIN curso_escolar c ON asm.id_curso_escolar = c.id WHERE c.anyo_inicio = 2018 GROUP BY p.id;

------------------------------------------------------------------------------------------------------------------------

-- LEFT/RIGHT JOIN

--1.Retorna un llistat amb els noms de tots els professors/es i els departaments que tenen vinculats. El llistat també ha de mostrar aquells professors/es que no tenen cap departament associat. El llistat ha de retornar quatre columnes, nom del departament, primer cognom, segon cognom i nom del professor/a.
 --El resultat estarà ordenat alfabèticament de menor a major pel nom del departament, cognoms i el nom.
SELECT d.nombre AS departmentName, p.apellido1 AS teacherFirstSurname, p.apellido2 AS teacherSecondSurname, p.nombre AS teacherName FROM persona p LEFT JOIN profesor pr ON p.id = pr.id_profesor LEFT JOIN departamento d ON d.id = pr.id_profesor WHERE p.tipo = 'profesor' ORDER BY d.nombre, apellido1, apellido2, p.nombre;

--2. Retorna un llistat amb els professors/es que no estan associats a un departament.
SELECT d.nombre AS departmentName, p.apellido1 AS teacherFirstSurname, p.apellido2 AS teacherSecondSurname, p.nombre AS teacherName FROM persona p LEFT JOIN profesor pr ON p.id = pr.id_profesor LEFT JOIN departamento d ON d.id = pr.id_profesor WHERE p.tipo = 'profesor';

--3.Retorna un llistat amb els departaments que no tenen professors/es associats.
SELECT d.*  FROM profesor pr  RIGHT JOIN departamento d ON d.id=pr.id_departamento  WHERE pr.id_profesor is null;

--4.Retorna un llistat amb els professors/es que no imparteixen cap assignatura.
SELECT a.nombre AS subjectName, p.apellido1 AS teacherFirstSurname, p.apellido2 AS teacherSecondSurname, p.nombre AS teacherName FROM persona p LEFT JOIN profesor pr ON p.id = pr.id_profesor LEFT JOIN asignatura a ON a.id_profesor = pr.id_profesor WHERE p.tipo = 'profesor' AND a.id is null;

--5.Retorna un llistat amb les assignatures que no tenen un professor/a assignat.
SELECT a.* FROM asignatura a LEFT JOIN profesor pr ON a.id_profesor = pr.id_profesor WHERE pr.id_profesor is null;

--6.Retorna un llistat amb tots els departaments que no han impartit assignatures en cap curs escolar.
SELECT d.* FROM asignatura a LEFT JOIN profesor pr ON a.id_profesor = pr.id_profesor RIGHT JOIN departamento d ON d.id = pr.id_departamento WHERE a.id is null;

------------------------------------------------------------------------------------------------------------------------

-- SUMMARY QUERIES

--1.Retorna el nombre total d'alumnes que hi ha.
SELECT COUNT(id) AS totalNumStudents FROM persona p WHERE p.tipo = 'alumno';

--2.Calcula quants alumnes van néixer en 1999.
SELECT COUNT(id) AS numStudentsBornIn1999 FROM persona p WHERE p.tipo = 'alumno' AND YEAR(fecha_nacimiento) = 1999;

--3.Calcula quants professors/es hi ha en cada departament. El resultat només ha de mostrar dues columnes, una amb el nom del departament i una altra amb el nombre de professors/es que hi ha en aquest departament.
--El resultat només ha d'incloure els departaments que tenen professors/es associats i haurà d'estar ordenat de major a menor pel nombre de professors/es.
SELECT COUNT(pr.id_profesor) AS numTeachers, d.nombre as departmentName FROM departamento d JOIN profesor pr ON d.id = pr.id_departamento GROUP BY d.id ORDER BY COUNT(pr.id_profesor) DESC;

--4.Retorna un llistat amb tots els departaments i el nombre de professors/es que hi ha en cadascun d'ells. Tingui en compte que poden existir departaments que no tenen professors/es associats.
--Aquests departaments també han d'aparèixer en el llistat.
SELECT COUNT(pr.id_profesor) AS numTeachers, d.nombre as departmentName FROM departamento d LEFT JOIN profesor pr ON d.id = pr.id_departamento GROUP BY d.nombre ORDER BY d.nombre;

--5.Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun. Tingues en compte que poden existir graus que no tenen assignatures associades. Aquests graus també han d'aparèixer en el llistat.
--El resultat haurà d'estar ordenat de major a menor pel nombre d'assignatures.
SELECT g.nombre AS gradoName, COUNT(a.id) as numSubject FROM grado g LEFT JOIN asignatura a ON g.id = a.id_grado GROUP BY g.nombre ORDER BY COUNT(a.id) DESC;

--6.Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun, dels graus que tinguin més de 40 assignatures associades.
 SELECT COUNT(a.id) AS numberSubjects, g.nombre FROM asignatura a JOIN grado g ON a.id_grado = g.id GROUP BY g.nombre  HAVING COUNT(a.id) > 40;

--7.Retorna un llistat que mostri el nom dels graus i la suma del nombre total de crèdits que hi ha per a cada tipus d'assignatura.
--El resultat ha de tenir tres columnes: nom del grau, tipus d'assignatura i la suma dels crèdits de totes les assignatures que hi ha d'aquest tipus.
SELECT g.nombre AS gradoName, a.tipo AS subjectType, SUM(a.creditos) AS creditsSubject FROM grado g  LEFT JOIN asignatura a on g.id = a.id_grado  GROUP BY g.nombre, a.tipo ORDER BY g.nombre ASC;

--8.Retorna un llistat que mostri quants alumnes s'han matriculat d'alguna assignatura en cadascun dels cursos escolars.
--El resultat haurà de mostrar dues columnes, una columna amb l'any d'inici del curs escolar i una altra amb el nombre d'alumnes matriculats.
SELECT ce.anyo_inicio AS startingYear, count(asm.id_alumno) AS numRegisteredStudents FROM alumno_se_matricula_asignatura asm  RIGHT JOIN universidad.curso_escolar ce on asm.id_curso_escolar = ce.id  GROUP BY ce.anyo_inicio;

--9.Retorna un llistat amb el nombre d'assignatures que imparteix cada professor/a. El llistat ha de tenir en compte aquells professors/es que no imparteixen cap assignatura.
--El resultat mostrarà cinc columnes: id, nom, primer cognom, segon cognom i nombre d'assignatures. El resultat estarà ordenat de major a menor pel nombre d'assignatures.
SELECT pr.id_profesor, p.nombre, p.apellido1, p.apellido2, COUNT(a.id) AS numSubjects FROM asignatura a RIGHT JOIN profesor pr ON a.id_profesor = pr.id_profesor LEFT JOIN persona p ON pr.id_profesor = p.id GROUP BY pr.id_profesor ORDER BY numSubjects DESC;

--10.Retorna totes les dades de l'alumne/a més jove.
SELECT * FROM persona WHERE tipo = 'alumno' ORDER BY fecha_nacimiento DESC LIMIT 1;

--11.Retorna un llistat amb els professors/es que tenen un departament associat i que no imparteixen cap assignatura.
SELECT p.* FROM persona LEFT JOIN profesor on persona.id = profesor.id_profesor LEFT JOIN asignatura on profesor.id_profesor = asignatura.id_profesor WHERE persona.tipo = 'profesor' and asignatura.id_profesor is null;