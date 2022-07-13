DELETE FROM insurance;
DELETE FROM band;
DELETE FROM company_mobile;

DELETE FROM Geo;
DELETE FROM Department;
DELETE FROM billing_status;

DELETE FROM project;
DELETE FROM designation;
DELETE FROM skills

insert into skills values(1,'React JS');
insert into skills values(2,'Java');
insert into skills values(3,'Dot Net');

insert into designation values(1,'Software Enginner');
insert into designation values(2,'SrSoftware Enginner');
insert into designation values(3,'Manager');

insert into project(status_id,status_name)values(1,'Project ID');
insert into project(status_id,status_name)values(2,'Work location');

insert into geo(geo_id,country_name)values(1,'India');
insert into geo(geo_id,country_name)values(2,'USA');
insert into geo(geo_id,country_name)values(3,'UK');

insert into department values(1,"Management");
insert into department values(2,"Fianance");
insert into department values(3,"Sales");
insert into department values(4,"Projects");

insert into  billing_status values(101,"Billing");
insert into  billing_status values(102,"Billing");
insert into  billing_status values(103,"bench");
insert into  billing_status values(104,"YTA project");

insert into insurance (insurance_id, insurance_details) values (1, "company name"),(2, "amount"),(3, "insurance no");
insert into band (band_id, band_name) values (1, "m1/e1"),(2, "m2/e2"),(3, "m3/e3");
insert into company_mobile (company_mobile_id, company_mobile_status ) values (1, "allocated"),(2, "not allocated"),(3, "not applicable");

insert into employee_details values(10001,"2021-05-11",87564534,5690,"codex" ,"14lpa","4years","yes",8754378,"8lpa","gadrlaravali@gmail.com","veeru","yes","shift B","yes","gadrlaravali@gmail.com","hyd");
insert into employee_details values(10004,"2021-05-11",9536774,5670,"codex" ,"10lpa","5years","yes",96534356,"5lpa","gadrlaravali@gmail.com","veeru","yes","shift A","yes","gadrlaravali@gmail.com","hyd");
insert into employee_details values(10007,"2021-05-11",6898659,5780,"codex" ,"14lpa","4years","yes",4587998,"9lpa","gadrlaravali@gmail.com","veeru","yes","shift C","yes","gadrlaravali@gmail.com","hyd");