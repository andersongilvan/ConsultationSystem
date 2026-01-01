CREATE TABLE doctors(

    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    crm VARCHAR(20) NOT NULL,
    speciality VARCHAR(50) NOT NULL,
    active BOOLEAN DEFAULT TRUE,
    address_id INTEGER UNIQUE,

    CONSTRAINT fk_doctors_address
        FOREIGN KEY(address_id) REFERENCES address(id)

);