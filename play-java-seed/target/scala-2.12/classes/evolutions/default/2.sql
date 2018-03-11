# --- Sample dataset

# --- !Ups

delete from project;
delete from employee;
delete from department;


insert into employee (id,name, department_id) values ( 1,'Jimmy Brooks', 1);

insert into employee (id,name, department_id) values ( 2,'Jamie Barns', 3);

insert into employee (id,name, department_id) values ( 3,'Ann Faris', 1);

insert into employee (id,name, department_id) values ( 4,'Kate Hopkins', 2);

insert into department () values ();

insert into project (id,name,description,stock,price) values ( 1,'Kettle','Steel Electric Kettle',100,55.00 );

insert into project (id,name,description,stock,price) values ( 2,'Fridge freezer','Fridge + freezer large',45,799.00 );

insert into project (id,name,description,stock,price) values ( 3,'Portable Music Player','250GB music player (MP3,MP4,WMA,WAV)',5,99.00 );

insert into project (id,name,description,stock,price) values ( 4,'13inch Laptop','HP laptop,8GB RAM,250GB SSD',45,799.00 );

insert into employee_project(id, employee_id) values (1, 1);

insert into employee_project(id, employee_id) values (2, 5);

insert into employee_project(id, employee_id) values (3, 1);

insert into employee_project(id, employee_id) values (4, 3);

insert into employee_project(id, employee_id) values (5, 3);

insert into employee_project(id, employee_id) values (6, 8);

insert into employee_project(id, employee_id) values (7, 6);