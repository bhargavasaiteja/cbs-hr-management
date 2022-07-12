create table profile_dropdown(
profile_id int not null auto_increment,
profile_source varchar(50),
primary key (profile_id)
);

create table employee_hiring(
id int not null,
profile_id int,
zoom_or_google_meet varchar(255),
interviewer_name varchar(50),
designation varchar(50),
status_id int,
select_comments varchar(50),
primary key (id),
foreign key (profile_id) references profile_dropdown(profile_id),
foreign key (status_id) references status_dropdown(status_id)
);

create table status_dropdown(
status_id int not null auto_increment,
select_status varchar(50),
primary key (status_id)
);


