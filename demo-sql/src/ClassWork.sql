
CREATE TABLE TEACHER (
    ID INTEGER NOT NULL, -- AUTO_INCREMENT
    name VARCHAR(20) NOT NULL,
    AGE INTEGER(3) NOT NULL,
    NATIONALITY VARCHAR(2) NOT NULL,
    MEMBERSHIP VARCHAR(1) NOT NULL
);
  -- select data from table, * means All colums
 select id, name, age from TEACHER;
 -- insert records
 insert into teacher values(1,'John Lau',23,'HK','G');
 insert into teacher values(2, 'Mary',30,'CN','G');
 DELETE FROM teacher;
SELECT * FROM teacher;
                    
                    
                    

 CREATE TABLE STAFF(
 ID INTEGER NOT NULL,
 NAME VARCHAR(20) NOT NULL,
 SEX VARCHAR(1) NOT NULL,
 SALARY NUMERIC(10,2) -- NULLABE , 8 DIGITS GOES TO INTEGER, 2 BELONG

 );
 
DROP TABLE STAFF;
 -- ALL COLUMN ALIAS
INSERT INTO STAFF (ID, NAME, SEX, SALARY) VALUES
(1, 'John', 'M', 5000.00),
(2, 'Emma', 'F', 6000.00),
(3, 'Michael', 'M', 5500.00),
(4, 'Sophia', 'F', 6500.00),
(5, 'William', 'M', 5200.00),
(6, 'Olivia', 'F', 6200.00),
(7, 'James', 'M', 5300.00),
(8, 'Ava', 'F', 6100.00),
(9, 'Benjamin', 'M', 5400.00),
(10, 'Isabella', 'F', 6300.00),
(11, 'Henry', 'M', 5100.00),
(12, 'Mia', 'F', 5900.00),
(13, 'Alexander', 'M', 5600.00),
(14, 'Charlotte', 'F', 5700.00),
(15, 'Daniel', 'M', 5800.00),
(16, 'Amelia', 'F', 5400.00),
(17, 'Joseph', 'M', 5500.00),
(18, 'Harper', 'F', 5700.00),
(19, 'David', 'M', 5200.00),
(20, 'Ella', 'F', 6100.00),
(21, 'Matthew', 'M', 5300.00),
(22, 'Grace', 'F', 6000.00),
(23, 'Christopher', 'M', 5600.00),
(24, 'Victoria', 'F', 5900.00),
(25, 'Andrew', 'M', 5500.00),
(26, 'Lily', 'F', 5700.00),
(27, 'Ethan', 'M', 5400.00),
(28, 'Sofia', 'F', 6200.00),
(29, 'Daniel', 'M', 5300.00),
(30, 'Emily', 'F', 6100.00);
  
SELECT * FROM staff; 
 
Delete From staff;


  
-- Update
update staff set salary = salary +1000 ;
-- select data by criteria
select  * from staff where id =1;
select  * from staff where name = 'John Lau' and Salary < 50000;
select name,salary from staff where name = 'John Lau' and Salary < 20000;
select * from staff where name = 'John Lau' or name = 'Mary';
select id,name,salary from staff where name in ('Matthew Pang', 'Anna') and Salary<30001 ;
select id,name as fullname, salary from staff;
 -- UPDATE BY CRITERIA
 update staff set salary = salary + 1000 where id = 4;
 update staff set salary = salary +10,
 name = 'Mary Chan'
 where name = 'Mary'
 ;

 
 -- Delete by criteria
 delete from staff where id = 5;
 delete from staff where id in (1,2);
 -- Order by (sorting)
 select * from staff order by salary; -- default ascending order
select * from staff order by salary asc; -- same as above
select * from staff order by salary desc; -- decending order

select * 
from staff 
order by salary desc, id desc;

-- sub-query
select max(salary)from staff;
select id from staff where salary = (select max(salary)from staff);
select id from staff where salary = (select min(salary)from staff);
select name, salary from staff where salary = (select min(salary)from staff);
select id from staff where upper(name) like 'A%';SELECT COUNT(id) FROM staff WHERE UPPER(name) LIKE 'A%';
UPDATE staff SET salary = salary * 0.9 
WHERE salary = (SELECT MAX_salary FROM (SELECT MAX(salary) AS MAX_salary FROM staff) AS temp);
select sex,salary,name from staff where salary = (select max(salary) from staff);
select count(1) as Male,count(1) as Female  from staff where sex = 'M' ;





-- Function
select avg(salary) as AVERAGE_SALARY from staff;  -- Alias
select upper(name) as UP_CASE_NAME from staff;
select lower(name) as LOWER_CASE_NAME from staff;
insert into staff values(13,'PETER CHU', 22000);
insert into staff values(14,'peter chu', 21000);
select * from staff where upper(name) = 'PETER CHU';

-- Like 
select * from staff where upper(name) like '%CHU';  -- % means any character
select * from staff where upper(name) like '%TER%';
select * from staff where upper(name) like '%TER%' or name = 'BCD';

-- Count()
select * from staff;
select 1 from staff;
select count(*) from staff; -- 32
select count(1) from staff; -- 32
SELECT COUNT(id) FROM staff WHERE UPPER(name) LIKE 'A%';


-- group by
select upper(name) as name, sum(salary) AS TOTAL_SALARY -- SALARY COLUMN IS NOT ALLOWED
,avg(salary) as AVERAGE_SALARY
,max(salary) as max_salary
,min(salary) as min_salary
from staff 
group by upper(name);
select sex, count(0) as employee from staff group by sex;
select sex, sum(salary) as all_salary from staff group by sex;
select sex, avg(salary) as all_salary from staff group by sex;



-- String Operations
select * from staff where instr(name, 'chu') > 0;
select * from staff where length(name) >  6;
select substring(name,1,3) from staff; -- 0 will comeout empty
select length(trim(' testing testing ')) from dual;
select rtrim('     testing testing ') from dual;
select ltrim(' testing testing ') from dual;
select concat(ltrim(' testing testing '),('abc')) from dual; -- dual 1 x 1 table
select replace('I love Java', 'Java', 'PKL') from dual;


-- Havning 
select name, max(salary),count(3)
from STAFF 
where substring(name,1,1) in ('P', 'E')  -- before group by use where to filter condition
group by name Having count(name) > 2;  -- group完多過兩條先拎出(second filtering)

insert into staff values(31, 'Eric Cheung','M',200);
insert into staff values(32, 'Eric Kam', 'M',20000);


select name, min(salary),count(name)
from STAFF 
where substring(name,1,1) in ('A','E')  
group by name Having max(salary) > 10000; 

select distinct name, salary
from staff;

select * from staff;
select 2 from Student;






-- 23 Aug
DROP TABLE CUSTOMERS;
create table CUSTOMERS(
	ID INTEGER NOT NULL,
    NAME VARCHAR(50) NOT NULL,
    EMAIL VARCHAR(50)NOT NULL,
    VIP VARCHAR(1) NOT NULL
);


-- ONE TO MANY ONE CUSTOMER MAY HAVE MANY ORDERS
create table ORDERS(
ID INTEGER NOT NULL,
AMOUNT NUMERIC(9,2) NOT NULL,
CUSTOMER_ID INTEGER NOT NULL
);

CREATE TABLE ITEMS(
	ID INTEGER NOT NULL,
    AMOUNT NUMERIC(9,2) NOT NULL,
    DESCRIPITION VARCHAR(100) NOT NULL,
    ORDER_ID INTEGER NOT NULL

);




SELECT * FROM CUSTOMERS;
SELECT * FROM ORDERS;


insert into CUSTOMERS values(1,'JOHN', 'JOIN@GMAIL.COM','Y');
insert into CUSTOMERS values(2,'MARY', 'MARY@GMAIL.COM','N');
insert into CUSTOMERS values(3,'ERIC', 'MARY@GMAIL.COM','N');

INSERT INTO ORDERS VALUES(1,100.23, 1);
INSERT INTO ORDERS VALUES(2,200, 1);
INSERT INTO ORDERS VALUES(3,23, 2);
INSERT INTO ORDERS VALUES(4,123, 2);
INSERT INTO ORDERS VALUES(5,3984, 2);


SELECT * FROM CUSTOMERS;
SELECT * FROM ORDERS;
SELECT * FROM ITEMS;
DROP TABLE ORDERS;
DROP TABLE CUSTOMERS;
DROP TABLE ITEMS;

-- JOIN TABLE, INNER JOIN
SELECT O.ID AS ORDER_ID, O.AMOUNT AS ORDER_AMOUNT, O.CUSTOMER_ID , C.NAME AS CUSTOMER_NAME
FROM CUSTOMERS C INNER JOIN ORDERS O -- INTERSET
ON C.ID = O.CUSTOMER_ID
WHERE C.ID = 2
;

-- APPORACH 1
select O.CUSTOMER_ID,
C.NAME AS CUSTOMER_NAME,
O.ID AS ORDER_ID,
O.AMOUNT AS ORDER_AMOUNT,
I.DESCRIPITION AS ITEM_DESC,
I.AMOUNT AS ITEM_PRICE
FROM CUSTOMERS C
INNER JOIN ORDERS O ON C.ID = O.CUSTOMER_ID
INNER JOIN ITEMS I ON I.ORDER_ID = O.ID
;

-- APPORACH 2
select O.CUSTOMER_ID,
C.NAME AS CUSTOMER_NAME,
O.ID AS ORDER_ID,
O.AMOUNT AS ORDER_AMOUNT,
I.DESCRIPITION AS ITEM_DESC,
I.AMOUNT AS ITEM_PRICE
FROM CUSTOMERS C, ORDERS O, ITEMS I
WHERE O.CUSTOMER_ID = C.ID
AND I.ORDER_ID = O.ID
;



-- Left join
select C.ID,
C.NAME AS CUSTOMER_NAME,
O.ID AS ORDER_ID,
O.AMOUNT AS ORDER_AMOUNT
-- I.DESCRIPITION AS ITEM_DESC,
-- I.AMOUNT AS ITEM_PRICE
FROM CUSTOMERS C Left join ORDERS O ON O.CUSTOMER_ID = C.ID
;

-- Right join
select 
C.ID,
C.NAME AS CUSTOMER_NAME,
O.ID AS ORDER_ID,
O.AMOUNT AS ORDER_AMOUNT
-- I.DESCRIPITION AS ITEM_DESC,
-- I.AMOUNT AS ITEM_PRICE
FROM CUSTOMERS C right join ORDERS O ON O.CUSTOMER_ID = C.ID
;



SELECT * FROM CUSTOMERS;
SELECT * FROM ORDERS;
SELECT * FROM ITEMS;




-- ONE TO MANY
INSERT INTO ITEMS VALUES(1,10,'APPLE', 1);
INSERT INTO ITEMS VALUES(2,20,'IPHONE', 1);
INSERT INTO ITEMS VALUES(3,23,'LEMON' ,2);
INSERT INTO ITEMS VALUES(4,123,'PEACH', 2);
INSERT INTO ITEMS VALUES(5,200, 'BOTTLE', 2);
INSERT INTO ITEMS VALUES(6,300, 'PEOPLE', 2);
INSERT INTO ITEMS VALUES(7,34, 'BOOK', 2);




-- 24 Aug
start transaction;
select * from customers;
insert into CUSTOMERS values(4,'XYZ', 'XYZ@GMAIL.COM','N');
rollback; -- rollback task if fail
commit;


Create table Student(
	id integer auto_increment,
    name varchar(50),
    age numeric(3),
    primary key(id)
);

insert into Student (name, age) value ('John', 23);
insert into Student (name, age) value ('Mary', 23);


delete from student;
drop table student;
drop table student_subjects;
select * from student;
select * from subjects;
select * from student_subjects;

Create table SUBJECTS(
	id integer auto_increment,
    name varchar(50),
    primary key(id)
);
insert into subjects (name) value ('Chinese');
insert into subjects (name) value ('English');
insert into subjects (name) value ('Maths');


-- DDL
Create table STUDENT_SUBJECTS(
	id integer auto_increment,
    student_id integer not null,
    subject_id integer not null,
    primary key(id),
    foreign key(student_id) references Student(id),
    foreign key(subject_id) references subjects(id) -- 鎖住table 的integrity
);

-- DML
insert into STUDENT_SUBJECTS (student_id, subject_id) values(1,1);
insert into STUDENT_SUBJECTS (student_id, subject_id) values(1,2);
insert into STUDENT_SUBJECTS (student_id, subject_id) values(2,3);
-- error, Foreign Key constraint fails
insert into STUDENT_SUBJECTS (student_id, subject_id) values(2,4); -- no id = 4 subject



-- Truncate
truncate table student_subjects;  -- Delete
select * from student_subjects;


-- Alter add / drop column (DDL)
alter table students add email varchar(50);
alter table students drop email;

-- alter column definition
alter table students modify email varchar(60);
-- error if data length exceed the column length
alter table students modify email varchar(55); 



-- On delete Cascade
Create table department(
	ID integer primary key auto_increment,
    DEPT_NAME varchar(50) not null
);

insert into department (dept_name) values('CS');
insert into department (dept_name) values('MARKETING');

drop table course;
drop table department; 
Create table course(
	ID integer primary key auto_increment,
    COURSE_NAME varchar(50) not null,
	COURSE_CODE varchar(5) not null,
    DEPT_ID integer,
    foreign key(Dept_ID) references department(id) on delete set null
    -- delete all child if delete parent, but difficult to find which data has been deleted
);
insert into course (COURSE_NAME, COURSE_CODE, DEPT_ID) values('java', 'CS01', 1);
insert into course (COURSE_NAME, COURSE_CODE, DEPT_ID) values('java', 'MT01', 2);
insert into course (COURSE_NAME, COURSE_CODE, DEPT_ID) values('java', 'MT01', 3);


-- delete parent (department)
delete from course where id = 2;
delete from department where id = 2; -- success, all child delete if on delete cascade

-- delete set null

delete from course;
select * from course;
select * from department;

--  rename column
Alter table course rename column course_name to name;

alter table course add column start_date date default null;
alter table course add column END_date date default '1900-01-01';

-- modify and default
insert into course value(3,'Python', 'CS002', 1, null, null);
alter table course modify column end_date datetime default '1990-01-01 00:00:00';

-- Limit 
select * from course order by id limit 2; -- first 2 item

-- Offset
select  * from course order by id limit 2 offset 1; -- skip 1 row


-- Exists / Not Exists
insert into department (dept_name) values ('sales');
insert into department (dept_name) values ('CVIL');

select D.*
from department D	-- source
where not exists(	-- check exists or not suppose nothing 先return true, 
-- if not exists is true , d.* will return something
	select 1		-- any type
	from course C	-- to find weather exist in this table
	where C.DEPT_ID = D.ID -- key
);







create table staff2(
		id integer,
        salary integer 
);

select * from staff2;
drop table staff2;
drop procedure if exists add_staff;

delimiter //
create procedure add_staff (in staff_id integer,in salary integer)
begin
    insert into staff2 values(staff_id, salary);
end //

delimiter ;





call add_staff(1,200);















