select * from regions;
select * from countries;
select * from locations;
select * from departments;
select * from job_history;
select * from jobs;
select * from employees;
select * from job_grades;


-- 3.
select l.location_id,l.street_address,l.city,l.state_province, c.country_name
from locations l, countries c
where l.country_id = c.country_id 
;

-- 4
select first_name, last_name, department_id
from employees;


-- 5. employee who work in japan
select e.first_name, e.last_name, e.job_id, e.department_id
from employees e, departments d, locations l, countries c
where e.department_id = d.department_id 
and d.location_id = l.location_id
and l.country_id = c.country_id
and c.country_id = 'JP'
;

-- 6.first_name, lastname, managerid, lastname
select e.first_name, e.last_name, e.manager_id
from  departments d 
left join employees e
on d.manager_id = e.employee_id
;

-- 7. first_name, lastname, hire date after employee'Lex De Haan'
select first_name, last_name, hire_date
from employees
where employee_id = (select employee_id
					from employees
					where concat(trim(first_name),' ',trim(last_name)) = 'Lex De Haan') +1
;

-- 8. department name, number of employees

select d.department_name, count(1) as number_Of_employees
from employees e, departments d
where e.department_id = d.department_id
group by d.department_name;
;

-- 9. employee_id, job_title, number of day
select e.employee_id, j.job_title, datediff(jh.end_date, jh.start_date) as report_duty_days
from employees e, departments d, job_history jh, jobs j
where e.department_id = d.department_id and
d.department_id = jh.department_id and
e.job_id = j.job_id
and e.department_id = 30
;


-- 10. department name, manager name, city, countrie name, 

with manager as(
select e.first_name, e.last_name, e.manager_id, d.location_id
from  departments d 
left join employees e
on d.manager_id = e.employee_id)


select m.first_name, m.last_name, l.city, c.country_name
from manager m, locations l, countries c
where m.location_id = l.location_id
and l.country_id = c.country_id
;


-- 11.
select d.department_name ,avg(e.salary) as average_salary
from employees e , departments d
where e.department_id = d.department_id
group by e.department_id
;

-- 12 Normalization

select * from jobs;
alter table jobs drop min_salary;
alter table jobs drop max_salary;
alter table jobs add column grade_level varchar(1);
alter table jobs add constraint foreign key(grade_level) references job_grades(grade_level);



















