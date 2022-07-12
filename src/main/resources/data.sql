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

insert into Geo(id,country_name)values(1,'India');
insert into Geo(id,country_name)values(2,'USA');
insert into Geo(id,country_name)values(3,'UK');

insert into Department values(1,"Management");
insert into Department values(2,"Fianance");
insert into Department values(3,"Sales");
insert into Department values(4,"Projects");

insert into  billing_status values("Cbs",101,"Billing");
insert into  billing_status values("Pumperpal",102,"Billing");
insert into  billing_status values("Rapido",103,"bench");
insert into  billing_status values("Patanjali",104,"YTA project");

insert into insurance (insurance_id, insurance_details) values (1, "company name"),(2, "amount"),(3, "insurance no");
insert into band (band_id, band_name) values (1, "m1/e1"),(2, "m2/e2"),(3, "m3/e3");
insert into company_mobile (company_mobile_id, company_mobile_status ) values (1, "allocated"),(2, "not allocated"),(3, "not applicable");
