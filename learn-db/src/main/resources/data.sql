create table person
( 
 	id integer not null,
	name varchar(255) not null,
  	location varchar(255),
  	birthdate timestamp,
    primary key(id)
);

INSERT INTO PERSON
(ID,NAME,LOCATION,BIRTHDATE)
VALUES
(10001, 'KALYAN','HYDERABAD',sysdate()) ;
INSERT INTO PERSON
(ID,NAME,LOCATION,BIRTHDATE)
VALUES
(10002, 'SOWMYA','HYDERABAD',sysdate()) ;
INSERT INTO PERSON
(ID,NAME,LOCATION,BIRTHDATE)
VALUES
(10003, 'ANIRUDH','LYNCHBURG',sysdate()) ;
INSERT INTO PERSON
(ID,NAME,LOCATION,BIRTHDATE)
VALUES
(10004, 'PARASITE','PALAKKAD',sysdate()) ;