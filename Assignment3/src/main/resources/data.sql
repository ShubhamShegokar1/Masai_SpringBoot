insert into author ( id, name, address, age)
values (101,'RAMESH','SHEGOAN',22);

insert into book( book_id, name, publication, category, pages, price, author_id)
values (201, 'GITA', 'NAVNEET', 'SAS', 23, 299,101);

insert into book( book_id, name, publication, category, pages, price,author_id)
values (202, 'SITA', 'NAVNEET', 'SSS', 34, 599,101);





insert into professor(professor_id,address,age,name)
values(101,'SHEGAON',23,'SHUBHAM');

insert into professor(professor_id,address,age,name)
values(102,'PUNE',25,'Nandakumar');

insert into subject(SUBJECT_ID,duration,name,room_no,timings)
values(1001,'12 hours','Nitin',24,'Nandakumar');

insert into subject(SUBJECT_ID,duration,name,room_no,timings)
values(1002,'13 hours','Don',27,'23 pm');

insert into PROFESSOR_SUBJECT (
    PROFESSORID ,courseid) values(101,1001);

insert into PROFESSOR_SUBJECT (
    PROFESSORID ,courseid) values(102,1002);