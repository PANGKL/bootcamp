create database bootcamp_exercise1;
use bootcamp_exercise1;

create table regions(
	region_id integer not null primary key,
	region_name varchar(25) not null

);


create table countries(
	country_id varchar(2) primary key,
	country_name varchar(20),
	region_id integer,
	foreign key(region_id) references regions(region_id)
);

create table locations(
location_id integer primary key,
street_address varchar(50),
postal_code integer,
city varchar(30) not null,
state_province varchar(50),
country_id char(2),
foreign key(country_id) references countries(country_id)
);




create table departments(
department_id integer not null primary key,
department_name varchar(30) not null,
manager_id integer not null,
location_id integer not null,
foreign key(location_id) references locations(location_id)
);





create table job_history(
employee_id integer,
start_date date default '1970-01-01',
end_date date default '1970-01-01',
job_id varchar(10) not null,
department_id integer not null,
primary key(employee_id , start_date),
foreign key(department_id) references departments(department_id),
foreign key(job_id) references jobs(job_id)
);



create table jobs(
	job_id varchar(10) not null primary key,
    job_title varchar(50),
    min_salary numeric(9,2),
    max_salary numeric(9,2),
    foreign key (grade_level) references job_grades(grade_level)
);

create table job_grades(
	grade_level varchar(2) primary key,
    lowest_sal integer not null,
    highest_sal integer not null
);

create table employees(
	employee_id integer not null primary key,
    first_name varchar(20)not null,
	last_name varchar(25)not null,
    email varchar(50)not null,
    phone_number varchar(25)not null,
    hire_date date not null,
    job_id varchar(10) not null,
    salary integer not null,
    commission_pct integer not null,
    manager_id integer not null,
    department_id integer not null,
    foreign key(employee_id) references job_history(employee_id),
    foreign key(job_id) references jobs(job_id),
    foreign key(department_id) references departments(department_id)
);





















