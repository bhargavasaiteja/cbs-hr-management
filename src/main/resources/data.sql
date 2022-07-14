#EMPLOYEE_HIRING

INSERT INTO profile_dropdown(profile_id,profile_source)
VALUES (1,"Indeed"),
	   (2,"LinkedIn"),
       (3,"Naukri"),
       (4,"Glassdoor"),
       (5,"Monster"),
       (6,"CareerBuilder"),
       (7,"Others");

INSERT INTO status_dropdown(status_id,select_status)
VALUES (1,"Selected"),
	   (2,"Rejected"),
       (3,"Hold");


#EMPLOYEE ID

insert into skills values(1,'React JS');
insert into skills values(2,'Java');
insert into skills values(3,'Dot Net');

insert into designation values(1,'Software Enginner');
insert into designation values(2,'SrSoftware Enginner');
insert into designation values(3,'Manager');

insert into project(status_id,status_name)values(1,'Project ID');
insert into project(status_id,status_name)values(2,'Work location');

insert into geo(id,country_name)values(1,'India');
insert into geo(id,country_name)values(2,'USA');
insert into geo(id,country_name)values(3,'UK');

insert into department values(1,"Management");
insert into department values(2,"Fianance");
insert into department values(3,"Sales");
insert into department values(4,"Projects");

insert into  billing_status values(101,"Billing");
insert into  billing_status values(102,"Billing");
insert into  billing_status values(103,"bench");
insert into  billing_status values(104,"YTA project");


#onboarding_formalities


INSERT INTO offer_status VALUES (2,"accepted");
INSERT INTO offer_status VALUES (1,"rejected");

