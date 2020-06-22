

create table BOOK(
    id int not null primary key,
    title varchar(50) not null,
    IS_BOOK_AVAILABLE boolean not null,
    author varchar(50) not null,
    primary key(id)
);

create table card_holder (
    id int not null primary key,
    first_name varchar(20),
    last_name varchar(20),
    card_number varchar(20),
    primary key(id)
);

create table Rental(
    rental_id int not null primary key,
    cardHolder_id int not null,
    book_id int not null
);

-- CREATE SEQUENCE SEQ_PG_CARD_HOLDER_ID  MINVALUE 1 MAXVALUE 9999 INCREMENT BY 1 START WITH 1  NOCYCLE ;
 
 --CREATE SEQUENCE SEQ_PG_Rental_ID  MINVALUE 1 MAXVALUE 999999 INCREMENT BY 1 START WITH 100   NOCYCLE ;


