CREATE TABLE books (
    isbn VARCHAR(250) NOT NULL PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    language VARCHAR(45) NOT NULL,
    author VARCHAR(250) NULL REFERENCES authors(id),
    publication_date DATETIME NULL
) ENGINE=INNODB;

INSERT INTO books(isbn, title, language, author) VALUES
('978-0244761622', 'Le petit livre rouge: Citations du Président Mao Zedong', 'FR', 'Mao Zedong'),
('978-2853002943', 'La Bible', 'FR', 'Geoffrey CLERMONT'),
('978-0132350884', 'Clean Code', 'EN', 'Robert MARTIN');

CREATE TABLE authors (
   id VARCHAR(250) NOT NULL AUTO_INCREMENT PRIMARY KEY,
   first_name VARCHAR(250) NOT NULL,
   last_name VARCHAR(250) NOT NULL,
   birth_date DATETIME NULL

) ENGINE=INNODB;

INSERT INTO authors(first_name, last_name, birth_date) VALUES
('Mao', 'Zedong', '19831226 10:34:09 AM'),
('Geoffrey', 'Clermont', '19991011 10:34:09 AM'),
('Robert', 'Martin', '19831226 10:34:09 AM');