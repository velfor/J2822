DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fio varchar(50),
    phone varchar(50),
    email varchar(50),
    href varchar(20),
    description varchar(20)
);