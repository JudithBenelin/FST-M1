REM   Script: Activity 1-5
REM   Activity 1 to Activity 5

CREATE table salesman(  
    salesman_id int, 
    salesman_name varchar2(20), 
	salesman_city varchar2(20),  
	commision int, 
);

CREATE table salesman(  
    salesman_id int, 
    salesman_name varchar2(20), 
	salesman_city varchar2(20),  
	commision int 
);

INSERT All  
INTO salesman VALUES (5001, 'James Hoog', 'New York', 15) 
INTO salesman VALUES (5002, 'Nail Knite', 'PARIS', 13) 
INTO salesman VALUES (5003, 'Pit Alex', 'London', 11) 
INTO salesman VALUES (5005, 'McLyon', 'PARIS', 14) 
INTO salesman VALUES (5006, 'Paul Adam', 'New York', 13) 
INTO salesman VALUES (5007, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id , salesman_city from salesman;

SELECT salesman_id , salesman_city from salesman where salesman_city = 'PARIS';

Select salesman_id , commission from salesman where salesman_name = 'Paul Adam';

Select salesman_id , commission from salesman where Salesman_name = 'Paul Adam';

Select salesman_id , commision from salesman where Salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade = 200 where Salesman_city = 'PARIS';

UPDATE salesman SET grade = 300 where Salesman_name = 'James Hoog';

UPDATE salesman SET Salesman_name = 'Pierre' where Salesman_name = 'McLyon';

select * from salesman;

