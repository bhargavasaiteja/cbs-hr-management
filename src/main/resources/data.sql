create table project_billing_status(project_name varchar(50),project_id int PRIMARY KEY,project_status varchar(50));
insert into  project_billing_status values("Cbs",101,"Billing");
insert into  project_billing_status values("Pumperpal",102,"Billing");
insert into  project_billing_status values("Rapido",103,"bench");
insert into  project_billing_status values("Patanjali",104,"YTA project");


create table Department(department_id int PRIMARY KEY,department_name varchar(30));
insert into Department values(1,"Management");
insert into Department values(2,"Fianance");
insert into Department values(3,"Sales");
insert into Department values(4,"Projects");
select *from Department;