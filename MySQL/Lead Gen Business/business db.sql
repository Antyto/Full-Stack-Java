-- 1. ¿Qué consulta ejecutaría para obtener los ingresos totales para marzo de 2012?
SELECT  MONTH(charged_datetime) AS'month', SUM(billing.amount) AS revenue
FROM billing
WHERE charged_datetime >= '2012/03/01' AND charged_datetime < '2012/03/31';

-- 2. ¿Qué consulta ejecutaría para obtener los ingresos totales recaudados del cliente con una identificación de 2?
SELECT billing.client_id, SUM(billing.amount) AS total_revenue
FROM billing
WHERE client_id =2;

-- 3. ¿Qué consulta ejecutaría para obtener todos los sitios que posee client = 10?
SELECT sites.domain_name AS website, sites.client_id
FROM sites
WHERE client_id =10;

-- 4. ¿Qué consulta ejecutaría para obtener el número total de sitios creados por mes por año para el cliente con una identificación de 1? 
-- ¿Qué pasa con el cliente = 20?
SELECT client_id, COUNT(domain_name) AS number_of_websites, MONTHNAME(created_datetime) AS 'month_created', YEAR(created_datetime) AS 'year_created'
FROM sites
WHERE client_id IN (1, 20)
GROUP BY MONTH(sites.created_datetime)
ORDER BY client_id ASC;

-- 5. ¿Qué consulta ejecutaría para obtener el número total de clientes potenciales generados para cada uno de los sitios entre el 1 de enero de 2011 
-- y el 15 de febrero de 2011?
SELECT sites.domain_name AS website, COUNT(leads.leads_id) AS number_of_leads, date_format(registered_datetime,"%M %d, %Y") AS date_generated
FROM sites
LEFT JOIN leads ON sites.site_id = leads.site_id
WHERE registered_datetime >= '2011/01/01' AND registered_datetime < '2011/02/15'
GROUP BY sites.domain_name;

-- 6. ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales que hemos generado para cada 
-- uno de nuestros clientes entre el 1 de enero de 2011 y el 31 de diciembre de 2011?
SELECT CONCAT_WS(' ', clients.first_name, clients.last_name) AS client_name, COUNT(leads.leads_id) AS number_of_leads
FROM clients
LEFT JOIN sites ON clients.client_id = sites.client_id
LEFT JOIN leads ON sites.site_id = leads.site_id
WHERE registered_datetime >='2011/01/01' AND registered_datetime < '2011/12/31' 
GROUP BY clients.client_id;

-- 7. ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales que hemos generado para cada 
-- cliente cada mes entre los meses 1 y 6 del año 2011?
SELECT CONCAT_WS(' ', clients.first_name, clients.last_name) AS client_name, COUNT(leads.leads_id) AS number_of_leads, MONTHNAME(registered_datetime) AS month_generated
FROM clients
LEFT JOIN sites ON clients.client_id = sites.client_id
LEFT JOIN leads ON sites.site_id = leads.site_id
WHERE registered_datetime >='2011/01/01' AND registered_datetime < '2011/06/30' 
GROUP BY clients.client_id;

-- 8. ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales que hemos generado para cada 
-- uno de los sitios de nuestros clientes entre el 1 de enero de 2011 y el 31 de diciembre de 2011? Solicite esta consulta por ID de cliente.
-- Presente una segunda consulta que muestre todos los clientes, los nombres del sitio y el número total de clientes potenciales generados en 
-- cada sitio en todo momento.
SELECT CONCAT_WS(' ', clients.first_name, clients.last_name) AS client_name, sites.domain_name AS website, COUNT(leads_id) AS number_of_leads, date_format(registered_datetime,"%M %d, %Y") AS date_generated
FROM clients
LEFT JOIN sites ON clients.client_id = sites.client_id
LEFT JOIN leads ON sites.site_id = leads.site_id
WHERE registered_datetime >='2011/01/01' AND registered_datetime < '2011/12/31' 
GROUP BY sites.domain_name
ORDER BY clients.client_id, COUNT(leads.leads_id) DESC;
SELECT CONCAT_WS(' ', clients.first_name, clients.last_name) AS client_name, sites.domain_name AS website, COUNT(leads_id) AS number_of_leads
FROM clients
LEFT JOIN sites ON clients.client_id = sites.client_id
LEFT JOIN leads ON sites.site_id = leads.site_id
GROUP BY sites.domain_name
ORDER BY clients.client_id, COUNT(leads.leads_id) DESC;

-- 9. Escriba una sola consulta que recupere los ingresos totales recaudados de cada cliente para cada mes del año. Pídalo por ID de cliente.
SELECT CONCAT(clients.first_name," ", clients.last_name) AS client_name, sum(billing.amount) AS total_revenue, date_format(charged_datetime,"%M") AS 'month_charged', date_format(charged_datetime,"%Y") AS year_charge
FROM billing
LEFT JOIN clients ON billing.client_id = clients.client_id
GROUP BY billing.charged_datetime
ORDER BY clients.client_id, charged_datetime ASC;

-- 10. Escriba una sola consulta que recupere todos los sitios que posee cada cliente. Agrupe los resultados para que cada fila muestre un nuevo
-- cliente. Se volverá más claro cuando agregue un nuevo campo llamado 'sitios' que tiene todos los sitios que posee el cliente.
-- (SUGERENCIA: use GROUP_CONCAT)
SELECT CONCAT_WS(' ',clients.first_name, clients.last_name) AS client_name, GROUP_CONCAT(domain_name, " / ") AS sites
FROM sites
LEFT JOIN clients ON clients.client_id = sites.client_id
GROUP BY clients.client_id;
