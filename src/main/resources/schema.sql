
DROP TABLE IF EXISTS insurance;
DROP TABLE IF EXISTS band;
DROP TABLE IF EXISTS company_mobile;

DROP TABLE IF EXISTS billing_status;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS geo;

DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS designation;
DROP TABLE IF EXISTS skills;

CREATE TABLE insurance (insurance_id int NOT NULL, insurance_details varchar(100) not null, PRIMARY KEY (id));
CREATE TABLE band (band_id int NOT NULL, band_name varchar(50) not null, PRIMARY KEY (id));
CREATE TABLE company_mobile (company_mobile_id int NOT NULL, company_mobile_status varchar(90) not null, PRIMARY KEY (id));
create table billing_status(project_name varchar(50),project_id int PRIMARY KEY,project_status varchar(50));
create table department(department_id int PRIMARY KEY,department_name varchar(30));
create table geo(id int PRIMARY KEY,country_name varchar(30));
create table project(status_id int PRIMARY KEY,status_name varchar(30));
create table designation(id int PRIMARY KEY,designation_name varchar(50));
create table skills(id int PRIMARY KEY,skills_name varchar(50));
CREATE TABLE insurance (insurance_id int NOT NULL, insurance_details varchar(100) not null, PRIMARY KEY (id));
CREATE TABLE band (band_id int NOT NULL, band_name varchar(50) not null, PRIMARY KEY (id));
CREATE TABLE company_mobile (company_mobile_id int NOT NULL, company_mobile_status varchar(90) not null, PRIMARY KEY (id));