DROP TABLE users_products;
CREATE TABLE users_products (id number auto_increment, product VARCHAR(255));
INSERT INTO users_products VALUES (1, 'Product1' );
INSERT INTO users_products VALUES (2, 'Product2' );
INSERT INTO users_products VALUES (3, 'Product3' );
INSERT INTO users_products VALUES (4, 'Product4' );

DROP TABLE users;
CREATE TABLE IF NOT EXISTS users (id number auto_increment, name VARCHAR(255), product_id number, FOREIGN KEY (product_id) REFERENCES products (id));
INSERT INTO users VALUES ( 1, 'Petya', 1 );
INSERT INTO users VALUES ( 2, 'Vasya', 2 );
INSERT INTO users VALUES ( 3, 'Semuel', 3 );
INSERT INTO users VALUES ( 4, 'Petro', 4 );

DROP TABLE products;
CREATE TABLE IF NOT EXISTS products (id number auto_increment PRIMARY KEY, name VARCHAR(255));
INSERT INTO products VALUES ( 1, 'Apple');
INSERT INTO products VALUES ( 2, 'PineApple');
INSERT INTO products VALUES ( 3, 'Craimberry');
INSERT INTO products VALUES ( 4, 'Cherry');