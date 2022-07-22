-- INSERT EMPLOYEES			
insert into employee (employeeid, first_name, last_name, email) values (1, 'Philbert', 'Slater', 'philbert@gmail.com');
insert into employee (employeeid, first_name, last_name, email) values (2, 'Gardner', 'Dunn', 'dunn@gmail.com');
insert into employee (employeeid, first_name, last_name, email) values (3, 'Steve', 'Sherman', 'sherman@gmail.com');
insert into employee (employeeid, first_name, last_name, email) values (4, 'Tasha', 'Connor', 'connor@gmail.com');
insert into employee (employeeid, first_name, last_name, email) values (5, 'Prunella', 'Wade', 'prunella@gmail.com');

-- INSERT PROJECTS			
insert into project (project_id, name, stage, description) values (1000, 'Push to Production', 'NOTSTARTED', 'Final deployment of the software into production');
insert into project (project_id, name, stage, description) values (1001, '2022 Employee Budget',  'COMPLETED', 'Decide on a new employee bonus budget for the year');
insert into project (project_id, name, stage, description) values (1002, 'Office Reconstruction', 'INPROGRESS', 'The office building needs to be renovated');
insert into project (project_id, name, stage, description) values (1003, 'Intranet Security Feature', 'INPROGRESS', 'Office security implementation');

-- INSERT PROJECT_EMPLOYEE_RELATION
insert into project_employee (project_id, employee_id) values (1000, 1);
insert into project_employee (project_id, employee_id) values (1001, 1);
insert into project_employee (project_id, employee_id) values (1002, 2);
insert into project_employee (project_id, employee_id) values (1000, 3);
insert into project_employee (project_id, employee_id) values (1002, 5);
insert into project_employee (project_id, employee_id) values (1003, 5);
