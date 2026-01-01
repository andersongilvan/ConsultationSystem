CREATE TABLE patients(

    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    cpf VARCHAR(14) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    address_id INTEGER UNIQUE,

    CONSTRAINT fk_patients_address
        FOREIGN KEY(address_id) REFERENCES address(id)

);