drop table if exists cbs_onboarding_formalities.education_details;
create table cbs_onboarding_formalities.education_details(id tinyint NOT NULL PRIMARY KEY,ssc_Percentage float,
 intermediate_Percentage float, intermediate_specialization varchar(60),
 UG_percentage float,UG_specialization varchar(60),PG_percentage float,
 PG_specialization varchar(60),Dr_percentage float,Dr_specialization varchar(60));
