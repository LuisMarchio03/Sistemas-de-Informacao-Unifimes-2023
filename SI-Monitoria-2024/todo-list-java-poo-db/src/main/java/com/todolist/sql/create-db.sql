CREATE DATABASE todo_db;

\c todo_db

CREATE TABLE todos (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    completed BOOLEAN NOT NULL DEFAULT FALSE
);
