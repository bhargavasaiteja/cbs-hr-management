DELETE FROM skill;
DELETE FROM designation;
DELETE FROM insurance;
DELETE FROM department;
DELETE FROM band;
DELETE FROM billing;
DELETE FROM project;
DELETE FROM geo;
DELETE FROM company_mobile;

insert into skill (skill_id, skill_name) values(1, "java"), (2, "dot net"),(3, "react js");
insert into designation (designation_id, designation_name) values (1, "software eng"),(2, "sr software eng"),(3, "manager");
insert into insurance (insurance_id, insurance_details) values (1, "company name"),(2, "amount"),(3, "insurance no");
insert into department (department_id, department_name) values (1, "management"),(2, "fianance"),(3, "sales"),(4, "projects");
insert into band (band_id, band_name) values (1, "m1/e1"),(2, "m2/e2"),(3, "m3/e3");
insert into billing (billing_id, billing_status) values (1, "in billing"),(2, "bench"),(3, "yta project");
insert into project (project_id, project_status ) values (1, "project id"),(2, "work location");
insert into geo (geo_id, geo_location_name ) values (1, "india"),(2, "usa"),(3, "uk");
insert into company_mobile (company_mobile_id, company_mobile_status ) values (1, "allocated"),(2, "not allocated"),(3, "not applicable");