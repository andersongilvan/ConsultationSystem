CREATE TABLE users(

    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    hash_password VARCHAR(100) NOT NULL,
    hole VARCHAR(10) DEFAULT 'USER'

);