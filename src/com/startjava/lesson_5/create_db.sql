CREATE DATABASE testbd;

CREATE TABLE Jaegers (
    id serial PRIMARY KEY,
    modelName VARCHAR (150),
    mark VARCHAR (50),
    height numeric(10,2), 
    weight numeric(10,3), 
    status VARCHAR (50),
    origin VARCHAR (50),
    launch date,
    kaijuKill INT 
);