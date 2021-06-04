USE world;

SELECT * FROM languages;

-- 1. ¿Qué consulta harías para obtener todos los países que hablan esloveno? 
-- Tu consulta debe devolver el nombre del país, el idioma y el porcentaje de idioma. 
-- Tu consulta debe organizar el resultado por porcentaje de idioma en orden descendente. 

SELECT countries.name, languages.language, languages.percentage 
FROM countries 
JOIN languages ON countries.code = languages.country_code
WHERE language = 'Slovene';

-- 2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades para cada país? 
-- Su consulta debe devolver el nombre del país y el número total de ciudades. 
-- Tu consulta debe organizar el resultado por el número de ciudades en orden descendente; 

SELECT * FROM cities;

SELECT countries.name AS country, COUNT(cities.name) AS number_of_cities
FROM cities
JOIN countries ON cities.country_id = countries.id
GROUP BY countries.name
ORDER BY number_of_cities DESC;

-- 3. ¿Qué consulta harías para obtener todas las ciudades de México con una población de 
-- más de 500,000? Tu consulta debe organizar el resultado por población en orden 
-- descendente.

SELECT * FROM cities;

SELECT cities.name AS city_name, cities.population AS city_population, countries.id 
FROM cities
JOIN countries ON cities.country_id = countries.id
WHERE countries.name = "Mexico" AND cities.population > 500000
ORDER BY cities.population DESC;

-- 4. ¿Qué consulta ejecutarías para obtener todos los idiomas en cada país con un 
-- porcentaje superior al 89%? Tu consulta debe organizar el resultado por porcentaje en 
-- orden descendente.

SELECT * FROM languages;
SELECT countries.name AS country_name, languages.percentage
FROM languages
LEFT JOIN countries ON languages.country_id = countries.id
WHERE languages.percentage > 89
ORDER BY languages.percentage DESC;

-- 5. ¿Qué consulta haría para obtener todos los países con un área de superficie inferior 
-- a 501 y una población superior a 100,000? 

SELECT * FROM countries;

SELECT countries.name, countries.surface_area AS area, countries.population AS population
FROM countries
WHERE countries.surface_area < 501 AND countries.population > 100000
ORDER BY countries.name ASC;

-- 6. ¿Qué consulta harías para obtener países con solo Monarquía Constitucional con un 
-- capital superior a 200 y una esperanza de vida superior a 75 años?

SELECT * FROM countries;
SELECT countries.name AS country_name, countries.government_form,countries.capital, countries.life_expectancy
FROM countries
WHERE countries.government_form = 'Constitutional Monarchy' AND countries.capital > 200
AND countries.life_expectancy > 75;

-- 7. ¿Qué consulta harías para obtener todas las ciudades de Argentina dentro del distrito
-- de Buenos Aires y tener una población superior a 500,000? La consulta debe devolver el 
-- nombre del país, el nombre de la ciudad, el distrito y la población.

SELECT countries.name AS country_name, cities.name AS city_name, cities.district, cities.population
FROM cities
JOIN countries ON cities.country_id = countries.id
WHERE cities.district = "Buenos Aires" AND cities.population > 500000;

-- 8. ¿Qué consulta harías para resumir el número de países en cada región? La consulta 
-- debe mostrar el nombre de la región y el número de países. Además, la consulta debe 
-- organizar el resultado por el número de países en orden descendente.


SELECT countries.region AS region, COUNT(countries.name) AS countries
FROM countries
GROUP BY countries.region
ORDER BY countries DESC;




