# --- !Ups

update employee set id = 1 where id is null;

# --- !Ups
delete from user;

insert into user (email,name,password,role) values ( 'admin@products.com', 'Alice Admin', 'password', 'admin' );

insert into user (email,name,password,role) values ( 'user@products.com', 'Charlie User', 'password', 'user' );