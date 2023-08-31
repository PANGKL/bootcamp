drop table regions;
drop table countries;
drop table locations;
drop table departments;
drop table job_history;
drop table jobs;
drop table employees;

select * from regions;
select * from countries;
select * from locations;
select * from departments;
select * from job_history;
select * from jobs;
select * from employees;




INSERT INTO regions (region_id, region_name) VALUES
(1, 'North America'),
(2, 'Europe'),
(3, 'Asia'),
(4, 'South America'),
(5, 'Africa'),
(6, 'Australia'),
(7, 'Middle East'),
(8, 'Central America'),
(9, 'Caribbean'),
(10, 'Pacific Islands');




INSERT INTO countries (country_id, country_name, region_id)
VALUES
('DE', 'Germany', 1),
('IT', 'Italy', 1),
('JP', 'Japan', 3),
('US', 'United State', 2)
;
	

INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id)
VALUES
(1000, '1297 Via Cola di Rie', 989, 'Roma', null, 'IT'),
(1100, '93091 Calle della Te', 10934, 'Venice', null , 'IT'),
(1200, '2017 Shinjuku-ku', 1689, 'Tokyo', 'Tokyo Prefectu', 'JP'),
(1400, '2014 Jabberwocky Rd', 26192, 'Southlake', 'Texas', 'US')
;




INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES
(10, 'Administration', 200, 1100),
(20, 'Marketing', 201, 1200),
(30, 'Purchasing', 103, 1400)
;




INSERT INTO job_history (employee_id, start_date, end_date, job_id, department_id)
VALUES
(102, '1993-01-13', '1998-07-24', 'IT_PROG', 20),
(101, '1989-09-21', '1993-10-27', 'MK_REP', 10),
(101, '1993-10-28', '1997-03-15', 'MK_REP', 30),
(100, '1996-02-17', '1999-12-19', 'ST_CLERK', 30),
(103, '1998-03-24', '1999-12-31', 'MK_REP', 20)
;




INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
VALUES
('IT_PROG', 'Programmer', 10000.00, 50000.00),
('MK_REP', 'MK_REP', 10000.00, 30000.00),
('ST_CLERK', 'Clerk', 5000.00, 40000.00)
;



INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
VALUES
(100, 'Steven', 'King', 'SKING', '515-1234567', '1987-06-17', 'ST_CLERK', 24000, 0.00, 109, 10),
(101, 'Neena', 'Kochhar', 'NKOCHHAR', '987-654-3210', '1987-06-18', 'MK_REP', 17000, 0.00, 103, 20),
(102, 'Lex', 'De Haan', 'LDEHAAN', '555-555-5555', '1987-06-19', 'IT_PROG', 17000, 0.00, 108, 30),
(103, 'Alexander', 'Hunold', 'AHUNOLD', '111-222-3333', '1987-06-20', 'MK_REP', 9000, 0.00, 105, 20);


INSERT INTO job_grades VALUES ('A', 1000, 2999);
INSERT INTO job_grades VALUES ('B', 3000, 5999);
INSERT INTO job_grades VALUES ('C', 6000, 9999);
INSERT INTO job_grades VALUES ('D', 10000, 14999);
INSERT INTO job_grades VALUES ('E', 15000, 24999);
INSERT INTO job_grades VALUES ('F', 25000, 40000);











