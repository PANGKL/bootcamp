create database bootcamp_exercise2;
use bootcamp_exercise2;

CREATE TABLE WORKER (
  WORKER_ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  FIRST_NAME CHAR(25),
  LAST_NAME CHAR(25),
  SALARY NUMERIC(15),
  JOINING_DATE DATETIME,
  DEPARTMENT CHAR(25)
);

-- inesrt data to worker
INSERT INTO WORKER 
  (FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
    ('Monika', 'Arora', 100000, '21-02-20 09:00:00', 'HR'),
    ('Niharika', 'Verma', 80000, '21-06-11 09:00:00', 'Admin'),
    ('Vishal', 'Singhal', 300000, '21-02-20 09:00:00', 'HR'),
    ('Mohan', 'Sarah', 300000, '12-03-19 09:00:00', 'Admin'),
    ('Amitabh', 'Singh', 500000, '21-02-20 09:00:00', 'Admin'),
    ('Vivek', 'Bhati', 490000, '21-06-11 09:00:00', 'Admin'),
    ('Vipul', 'Diwan', 200000, '21-06-11 09:00:00', 'Account'),
    ('Satish', 'Kumar', 75000, '21-01-20 09:00:00', 'Account'),
    ('Geetika', 'Chauhan', 90000, '21-04-11 09:00:00', 'Admin');

-- create table bonus
CREATE TABLE BONUS (
  WORKER_REF_ID INTEGER,
  BONUS_AMOUNT NUMERIC(10),
  BONUS_DATE DATETIME,
  FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

select * from worker;
select * from Bonus;

-- 1. insert data
insert into bonus values
(6,32000,'21-11-02 09:00:00')
,(6,20000,'22-11-02 09:00:00')
,(5,21000,'21-11-02 09:00:00')
,(9,30000,'21-11-02 09:00:00')
,(8,4500,'22-11-02 09:00:00')
;

-- 2.Secondary highest salary
select * 
from worker
where salary != (select max(salary) 
					from worker)
order by salary desc limit 1
;


-- 3.name of employees highest salary in each department
select Department, max(salary) as Highest_Salary
from worker
group by department
;

-- 4. fetch the list of employees with the same salary

select w1.*
from worker w1, worker w2
where w1.salary = w2.salary and
w1.worker_id != w2.worker_id
;

-- 5. Worker name with salaries + bonus in 2021
select w.first_name, w.last_name, w.salary, b.bonus_amount
from worker w, bonus b
where w.worker_id = b.WORKER_REF_ID
and b.Bonus_date between '2021-01-01 09:00:00' and '2021-12-31 23:59:59'
;

truncate worker;
drop table worker;












