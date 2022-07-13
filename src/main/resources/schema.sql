drop table if exists cbs_onboarding_formalities.education_details;
create table cbs_onboarding_formalities.education_details(id tinyint NOT NULL PRIMARY KEY,ssc_Percentage float,
 intermediate_Percentage float, intermediate_specialization varchar(60),
 UG_percentage float,UG_specialization varchar(60),PG_percentage float,
 PG_specialization varchar(60),Dr_percentage float,Dr_specialization varchar(60));


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

create table employee_details (
emp_id bigint Primary Key,
experience varchar(50),
personal_email_id varchar(100) NOT NULL,
work_email_id varchar(100) NOT NULL,
mobile_number bigint UNIQUE KEY,
current_ctc varchar(20),
offered_ctc varchar(20),
doj date NOT NULL,
system_allocated varchar(10),
reporting_manager varchar(50),
bank_user_id bigint UNIQUE KEY,
client_name varchar(50),
client_code int,
shift_timings varchar(50),
shift_allowance int ,
work_location varchar(50),
location_allowance varchar(10)
);