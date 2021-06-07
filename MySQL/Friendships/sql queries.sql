SELECT * FROM users;
SELECT users.id, users.first_name, users.last_name, users2.first_name AS friend_first_name , users2.last_name AS friend_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.person_1_id
LEFT JOIN users AS users2 ON friendships.person_2_id = users2.id;

-- 1. Devuelva a todos los usuarios que son amigos de Kermit, asegúrese de que sus nombres se muestren en los resultados.

SELECT users.first_name, COUNT(users.id) AS amount_of_friendships,  users2.first_name AS friend_first_name , users2.last_name AS friend_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.person_1_id
LEFT JOIN users AS users2 ON friendships.person_2_id = users2.id
WHERE users.id = 4;

-- 2. Devuelve el recuento de todas las amistades.

SELECT COUNT(friendships.person_1_id) AS amount_of_friendships
FROM friendships;

-- 3. Descubre quién tiene más amigos y devuelve el recuento de sus amigos.

SELECT users.first_name, users.last_name, COUNT(users.id) AS number_of_friendships
FROM users
LEFT JOIN friendships ON users.id = friendships.person_1_id
LEFT JOIN users AS users2 ON friendships.person_2_id = users2.id;

-- 4. Crea un nuevo usuario y hazlos amigos de Eli Byers, Kermit The Frog y Marky Mark.

INSERT INTO users (id, first_name, last_name, created_at)
VALUES (6, 'Mark', 'Lee', NOW());
INSERT INTO friendships (person_1_id, person_2_id, created_at)
VALUES ('6', '2', NOW()), ('6', '4', NOW()), ('6', '5', NOW());

-- 5. Devuelve a los amigos de Eli en orden alfabético.

SELECT users.first_name, users.last_name, users2.first_name AS friend_first_name, users2.last_name AS friend_last_name  
FROM users
LEFT JOIN friendships ON users.id = friendships.person_1_id
LEFT JOIN users AS users2 ON friendships.person_2_id = users2.id
WHERE users.id = '4'
ORDER BY friend_last_name ASC;

-- 6. Eliminar a Marky Mark de los amigos de Eli.

DELETE FROM friendships 
WHERE person_1_id = '2' AND person_2_id = '5';

-- 7. Devuelve todas las amistades, mostrando solo el nombre y apellido de ambos amigos.

SELECT users.first_name, users.last_name, users2.first_name AS friend_first_name, users2.last_name AS friend_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.person_1_id
LEFT JOIN users AS users2 ON friendships.person_2_id = users2.id;

