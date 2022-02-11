DROP TABLE characters;

CREATE TABLE characters(
    id SERIAL,
    name VARCHAR(255),
    darkside BOOLEAN,
    age INT
);

INSERT INTO characters (name, darkside, age) VALUES ('Obi', false, 27);
INSERT INTO characters (name, darkside, age) VALUES ('Luke', false, 32);


UPDATE characters SET darkside = true;

UPDATE characters SET darkside = false WHERE name = 'Obi';

UPDATE characters SET age = 1 WHERE id = 1;

UPDATE characters SET id = 2 WHERE name = 'Obi';
UPDATE characters SET id = 1 WHERE name = 'Luke';
