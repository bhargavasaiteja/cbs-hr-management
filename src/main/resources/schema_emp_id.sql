

DROP TABLE IF EXISTS insurance;
DROP TABLE IF EXISTS band;
DROP TABLE IF EXISTS company_mobile;

CREATE TABLE insurance (insurance_id int NOT NULL, insurance_details varchar(100) not null, PRIMARY KEY (id));
CREATE TABLE band (band_id int NOT NULL, band_name varchar(50) not null, PRIMARY KEY (id));
CREATE TABLE company_mobile (company_mobile_id int NOT NULL, company_mobile_status varchar(90) not null, PRIMARY KEY (id));