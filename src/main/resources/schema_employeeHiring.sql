CREATE TABLE profile_dropdown (
profile_id int NOT NULL  PRIMARY KEY,
     profile_source varchar(50)
       FOREIGN KEY (profile_id) REFERENCES employee_hiring(profile_id)
);

CREATE TABLE employee_hiring (
profile_id int,
zoom_or_googlemeet varchar(255),
interviewer_name varchar(255),
designation varchar(255),
status_id int,
comments varchar(255),
);

CREATE TABLE status_dropdown (
status_id int NOT NULL  PRIMARY KEY,
     select_status varchar(50),
      FOREIGN KEY (status_id) REFERENCES employee_hiring(status_id)
);


