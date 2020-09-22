DROP TABLE users_products;
CREATE TABLE users_products (id number, product VARCHAR(255));
INSERT INTO users_products VALUES ( 'Product1' );
INSERT INTO users_products VALUES ( 'Product2' );
INSERT INTO users_products VALUES ( 'Product3' );
INSERT INTO users_products VALUES ( 'Product4' );

DROP TABLE users;
CREATE TABLE IF NOT EXISTS users (id number auto_increment, name VARCHAR(255), details_id number, FOREIGN KEY (details_id) REFERENCES users_products (id));
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