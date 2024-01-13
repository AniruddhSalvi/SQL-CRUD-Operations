CREATE DATABASE student;
USE student;
CREATE TABLE class(
	id INT PRIMARY KEY,
    name VARCHAR(50),
    date VARCHAR(10),
    cyl INT NOT NULL
);
INSERT INTO class
(id,name,date,cyl)
VALUES
(1,"Naruto","22/01/2024",5),
(2,"Sasuke","23/03/2024",7),
(3,"Sakura","24/02/2024",6);

SELECT * FROM class;