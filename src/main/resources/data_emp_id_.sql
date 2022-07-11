DELETE FROM insurance;
DELETE FROM band;
DELETE FROM company_mobile;

insert into insurance (insurance_id, insurance_details) values (1, "company name"),(2, "amount"),(3, "insurance no");
insert into band (band_id, band_name) values (1, "m1/e1"),(2, "m2/e2"),(3, "m3/e3");
insert into company_mobile (company_mobile_id, company_mobile_status ) values (1, "allocated"),(2, "not allocated"),(3, "not applicable");