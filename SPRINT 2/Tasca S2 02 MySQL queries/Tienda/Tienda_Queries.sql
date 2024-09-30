--Tienda Queries--

--------------------------------------------------------------------------------------------------------------------
USE tienda;

--1.Llista el nom de tots els productes que hi ha en la taula producto.
SELECT nombre FROM producto;

--2.Llista els noms i els preus de tots els productes de la taula producto.
SELECT nombre, precio FROM producto;

--3.Llista totes les columnes de la taula producto.
SELECT * FROM producto;

--4.Llista el nom dels productes, el preu en euros i el preu en dòlars estatunidencs (USD).
SELECT nombre, precio AS 'Precio euros', ROUND(precio * 1.08, 2) AS 'Precio dólares' FROM producto;

--5.Llista el nom dels productes, el preu en euros i el preu en dòlars estatunidencs (USD).
--Utilitza els següents àlies per a les columnes: nom de producto, euros, dòlars.
SELECT nombre AS 'Nom de producto', precio AS 'Euros', ROUND(precio * 1.08, 2) AS 'Dòlars' FROM producto;

--6.Llista els noms i els preus de tots els productes de la taula producto, convertint els noms a majúscula.
SELECT UPPER(nombre) AS nombre, precio FROM producto;

--7.Llista els noms i els preus de tots els productes de la taula producto, convertint els noms a minúscula.
SELECT LOWER(nombre) AS nombre, precio FROM producto;

--8.Llista el nom de tots els fabricants en una columna, i en una altra columna obtingui en majúscules
 -- els dos primers caràcters del nom del fabricant.
SELECT nombre, UPPER(SUBSTRING(nombre,1,2)) AS "2 primeras letras mayus" FROM fabricante;

 --9.Llista els noms i els preus de tots els productes de la taula producto, arrodonint el valor del preu.
 SELECT nombre, ROUND(precio) AS 'Precio redondeado' FROM producto;

 --10.Llista els noms i els preus de tots els productes de la taula producto,
 --truncant el valor del preu per a mostrar-lo sense cap xifra decimal.
 SELECT nombre, TRUNCATE(precio,0) AS 'Precio sin decimal' FROM producto;

 --11.Llista el codi dels fabricants que tenen productes en la taula producto.
 SELECT fabricante.codigo AS 'Fabricante con producto' FROM fabricante JOIN producto ON producto.codigo_fabricante = fabricante.codigo;

 --12.Llista el codi dels fabricants que tenen productes en la taula producto, eliminant els codis que apareixen repetits.
 SELECT DISTINCT fabricante.codigo FROM fabricante;

 --13.Llista els noms dels fabricants ordenats de manera ascendent.
 SELECT nombre FROM fabricante ORDER BY nombre ASC;

 --14.Llista els noms dels fabricants ordenats de manera descendent.
 SELECT nombre FROM fabricante ORDER BY nombre DESC;

 --15.Llista els noms dels productes ordenats, en primer lloc, pel nom de manera ascendent i, en segon lloc, pel preu de manera descendent.
 SELECT nombre,precio FROM producto ORDER BY nombre ASC, precio DESC;

--16.Retorna una llista amb les 5 primeres files de la taula fabricante.
SELECT * FROM fabricante LIMIT 5;

--17.Retorna una llista amb 2 files a partir de la quarta fila de la taula fabricante. La quarta fila també s'ha d'incloure en la resposta.
SELECT * FROM fabricante LIMIT 3, 2;

--18.Llista el nom i el preu del producte més barat. (Utilitza solament les clàusules ORDER BY i LIMIT).
--NOTA: Aquí no podria usar MIN(preu), necessitaria GROUP BY.
SELECT nombre,precio FROM producto ORDER BY precio ASC LIMIT 1;

--19.Llista el nom i el preu del producte més car. (Utilitza solament les clàusules ORDER BY i LIMIT).
 --NOTA: Aquí no podria usar MAX(preu), necessitaria GROUP BY.
SELECT nombre,precio FROM producto ORDER BY precio DESC LIMIT 1;

--20.Llista el nom de tots els productes del fabricant el codi de fabricant del qual és igual a 2.
SELECT nombre FROM producto WHERE codigo_fabricante = 2;

--21.Retorna una llista amb el nom del producte, preu i nom de fabricant de tots els productes de la base de dades.
SELECT producto.nombre AS 'Nombre producto', producto.precio AS 'Precio producto', fabricante.nombre AS 'Nombre fabricante' FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo;

--22.Retorna una llista amb el nom del producte, preu i nom de fabricant de tots els productes de la base de dades.
--Ordena el resultat pel nom del fabricant, per ordre alfabètic.
SELECT producto.nombre AS 'Nombre producto', producto.precio AS 'Precio producto', fabricante.nombre AS 'Nombre fabricante' FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo ORDER BY fabricante.nombre ASC;

--23.Retorna una llista amb el codi del producte, nom del producte, codi del fabricador i nom del fabricador, de tots els productes de la base de dades.
SELECT producto.codigo AS 'Codigo producto', producto.nombre AS 'Nombre producto', fabricante.codigo AS 'Codigo fabricante', fabricante.nombre AS 'Nombre fabricante' FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo;

--24.Retorna el nom del producte, el seu preu i el nom del seu fabricant, del producte més barat.
SELECT producto.nombre AS 'Nombre producto', producto.precio AS 'Precio producto', fabricante.nombre AS 'Nombre fabricante' FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo ORDER BY producto.precio ASC LIMIT 1;

--25.Retorna el nom del producte, el seu preu i el nom del seu fabricant, del producte més car.
SELECT producto.nombre AS 'Nombre producto', producto.precio AS 'Precio producto', fabricante.nombre AS 'Nombre fabricante' FROM producto INNER JOIN fabricante ON PRODUCTO.CODIGO_fabricante = fabricante.codigo ORDER BY producto.precio DESC LIMIT 1;

--26.Retorna una llista de tots els productes del fabricant Lenovo.
SELECT * FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = "Lenovo";

--27.Retorna una llista de tots els productes del fabricant Crucial que tinguin un preu major que 200€.
SELECT * FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Crucial' AND producto.precio > 200;

--28.Retorna un llistat amb tots els productes dels fabricants Asus, Hewlett-Packardy Seagate. Sense utilitzar l'operador IN.
SELECT * FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Asus' OR fabricante.nombre = 'Hewlett-Packardy' OR fabricante.nombre = 'Seagate';

--29.Retorna un llistat amb tots els productes dels fabricants Asus, Hewlett-Packardy Seagate. Fent servir l'operador IN.
SELECT * FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre IN('Asus','Hewlett-Packardy','Seagate');

--30.Retorna un llistat amb el nom i el preu de tots els productes dels fabricants el nom dels quals acabi per la vocal e.
SELECT producto.nombre AS 'Nombre producto', producto.precio AS 'Precio producto', fabricante.nombre AS 'Nombre de fabricante' FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE LOWER(RIGHT(fabricante.nombre, 1)) = 'e';

--31.Retorna un llistat amb el nom i el preu de tots els productes el nom de fabricant dels quals contingui el caràcter w en el seu nom.
SELECT producto.nombre AS 'Nombre producto', producto.precio AS 'Precio producto', fabricante.nombre AS 'Nombre de fabricante' FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre LIKE "%w%";

--32.Retorna un llistat amb el nom de producte, preu i nom de fabricant, de tots els productes que tinguin un preu major o igual a 180€.
--Ordena el resultat, en primer lloc, pel preu (en ordre descendent) i, en segon lloc, pel nom (en ordre ascendent).
SELECT producto.nombre AS 'Nombre producto', producto.precio AS 'Precio producto', fabricante.nombre AS 'Nombre fabricante' FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE producto.precio > 180 ORDER BY producto.precio DESC, producto.nombre ASC;

--33.Retorna un llistat amb el codi i el nom de fabricant, solament d'aquells fabricants que tenen productes associats en la base de dades.
SELECT DISTINCT fabricante.codigo, fabricante.nombre FROM fabricante INNER JOIN producto ON fabricante.codigo = producto.codigo_fabricante;

--34.Retorna un llistat de tots els fabricants que existeixen en la base de dades, juntament amb els productes que té cadascun d'ells. El llistat haurà de mostrar també aquells fabricants que no tenen productes associats.
SELECT fabricante.nombre AS "Nombre Fabricante", producto.nombre AS "Nombre producto" FROM fabricante LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante;

--35.Retorna un llistat on només apareguin aquells fabricants que no tenen cap producte associat.
SELECT fabricante.nombre FROM fabricante LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante WHERE producto.nombre IS NULL;

--36.Retorna tots els productes del fabricador Lenovo. (Sense utilitzar INNER JOIN).
SELECT producto.nombre AS 'Nombre producto', fabricante.nombre AS "Fabricante" FROM producto LEFT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = "Lenovo";

--37.Retorna totes les dades dels productes que tenen el mateix preu que el producte més car del fabricant Lenovo. (Sense usar INNER JOIN).
SELECT * FROM producto WHERE precio = (SELECT MAX(precio) FROM producto LEFT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = "Lenovo");

--38.Llista el nom del producte més car del fabricant Lenovo.
SELECT producto.nombre FROM producto JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Lenovo' ORDER BY producto.precio DESC LIMIT 1;

--39.Llista el nom del producte més barat del fabricant Hewlett-Packard.
SELECT producto.nombre FROM producto JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Hewlett-Packard' ORDER BY producto.precio ASC LIMIT 1;

--40.Retorna tots els productes de la base de dades que tenen un preu major o igual al producte més car del fabricant Lenovo.
SELECT producto *, (SELECT nombre FROM fabricante WHERE fabricante.codigo = producto.codigo_fabricante) AS "Fabricante" FROM producto WHERE producto.precio >= ANY (SELECT MAX(precio) FROM producto JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = "Lenovo");

--41.Llesta tots els productes del fabricant Asus que tenen un preu superior al preu mitjà de tots els seus productes.
SELECT *, (SELECT nombre FROM fabricante WHERE fabricante.codigo = producto.codigo_fabricante) AS "Fabricante" FROM producto where precio > (SELECT AVG(precio) FROM producto JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Asus');