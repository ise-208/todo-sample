DROP TABLE IF EXISTS todos;


CREATE TABLE todos (
    id INTEGER NOT NULL AUTO_INCREMENT,
    title VARCHAR(20),
    completed BOOLEAN,
    PRIMARY KEY(id)
);

INSERT INTO todos (id, title, completed) VALUES(1,'foo', true);
INSERT INTO todos (id, title, completed) VALUES(2,'bar', true);