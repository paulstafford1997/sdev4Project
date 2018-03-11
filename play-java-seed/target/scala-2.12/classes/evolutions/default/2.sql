# --- Sample dataset

# --- !Ups

delete from project;
delete from employee;
delete from department;


insert into employee (id,name, fk_employee_department_id) values ( 1,'Jimmy Brooks', 1);

insert into employee (id,name, department_id) values ( 2,'Jamie Barns', 3);

insert into employee (id,name, department_id) values ( 3,'Ann Faris', 1);

insert into employee (id,name, department_id) values ( 4,'Kate Hopkins', 2);

insert into employee (id,name, department_id) values ( 5,'Jeremy Bobs', 3);

insert into employee (id,name, department_id) values ( 6,'John Mansony', 1);

insert into department (id, name) values (1, "Marketing");

insert into department (id, name) values (2, "Development");

insert into department (id, name) values (3, "Accounting");

insert into project (id,name) values ( 1,'Ballot');

insert into project (id,name) values ( 2,'Barney');

insert into employee_project(id, employee_id) values (1, 1);

insert into employee_project(id, employee_id) values (2, 2);

insert into employee_project(id, employee_id) values (2, 3);

insert into employee_project(id, employee_id) values (2, 4);

insert into employee_project(id, employee_id) values (1, 5);

insert into employee_project(id, employee_id) values (2, 6);