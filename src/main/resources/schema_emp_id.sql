DROP TABLE IF EXISTS skill;
DROP TABLE IF EXISTS designation;

DROP TABLE IF EXISTS insurance;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS band;
DROP TABLE IF EXISTS billing;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS geo;
DROP TABLE IF EXISTS project;

CREATE TABLE skill (skill_id int NOT NULL, skill_name varchar(55) not null, PRIMARY KEY (id));
CREATE TABLE designation (designation_id int NOT NULL, designation_name varchar(100) not null, PRIMARY KEY (id));
CREATE TABLE insurance (insurance_id int NOT NULL, insurance_details varchar(100) not null, PRIMARY KEY (id));
CREATE TABLE department (department_id int NOT NULL, department_name varchar(100) not null, PRIMARY KEY (id));
CREATE TABLE band (band_id int NOT NULL, band_name varchar(50) not null, PRIMARY KEY (id));
CREATE TABLE billing (billing_id int NOT NULL, billing_status varchar(860) not null, PRIMARY KEY (id));
CREATE TABLE project (project_id int NOT NULL, project_status varchar(860) not null, PRIMARY KEY (id));
CREATE TABLE geo (geo_id int NOT NULL, geo_location_name varchar(90) not null, PRIMARY KEY (id));
CREATE TABLE company_mobile (company_mobile_id int NOT NULL, company_mobile_status varchar(90) not null, PRIMARY KEY (id));