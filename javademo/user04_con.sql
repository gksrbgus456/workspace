 --user04 사용자 생성
 create user user04 identified by tiger;
 
 grant create session to user04 with admin option;
 
 grant create table to user04;
 
create table sawon(
id varchar2(10),
name varchar(20));

select * from sawon;