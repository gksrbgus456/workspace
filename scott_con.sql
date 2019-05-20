CREATE TABLE emp(
empno NUMBER  NOT NULL,
ENAME VARCHAR2(10),
job VARCHAR2(9),
mgr NUMBER,
hiredata DATE,
sal NUMBER,
comm NUMBER,
deptno NUMBER
);


select empno,ename,job,mgr FROM emp;    -- 원하는 값만
SELECT * from emp; -- 전체 다 조회

INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'1980-12-17',800null,20);

INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);

INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'1981-02-21',1250,200,30);

INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7566,'1981-04-02',2975,30,20);

INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7898,'1981-09-28',1250,300,30);

INSERT INTO EMP VALUES (7698,'BLAKE','MONAGER',7839,'1981-04-01',2850null,30);

INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'1981-06-01',2450null,10);

INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'1982-10-09',3000null,20);

INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',null,'1981-11-17',5000,10);

INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);

INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'1983-01-12',1100,null,20);

INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'1981-10-13',950,null,30);

INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'1981-10-3',3000,null,20);

INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);

commit;


CREATE TABLE DEPT
(deptno number,
DNAME VARCHAR2 (14),
LOC VARCHAR2(13) );


alter table dept rename column depitno to deptno;

SELECT * FROM dept;

INSERT INTO DEPT VALUES (10,'ACCOUNTUNG','NEW YORK');

INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');

INSERT INTO DEPT VALUES (30,'SALES','NEW CHICAGO');

INSERT INTO DEPT VALUES (40,'OPERATIONS',' BOSTON');


commit;
select * from dept;


CREATE TABLE BONUS
(
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
SAL NUMBER,
COMM number
);


CREATE TABLE SALGRADE 
(GRADE number,
LOSAL number,
HISAL number);

INSERT INTO SALGRADE VALUES (1,700,1200);

INSERT INTO SALGRADE VALUES (2,1201,1400);

INSERT INTO SALGRADE VALUES (3,1401,2000);

INSERT INTO SALGRADE VALUES (4,2001,3000);

INSERT INTO SALGRADE VALUES (5,3001,9999);

 
commit;

select * from SALGRADE;

select * from user_tables;

--////////////////////////////////////////////////////////////////////
select * from dept;
alter table dept add primary key(deptno);

CREATE TABLE emp01(
empno NUMBER PRIMARY KEY,
ename VARCHAR2 (20) NOT NULL,
job VARCHAR2 (9) unique,
deptno NUMBER(2) REFERENCES dept (deptno)
);
CREATE TABLE emp02(
empno NUMBER CONSTRAINTS emp02_empno_pk PRIMARY KEY,
ename VARCHAR2 (20) CONSTRAINTS emp02_ename_nn NOT NULL,
job VARCHAR2 (9) CONSTRAINTS emp02_job_uk unique, 
deptno NUMBER(2) CONSTRAINTS emp02_deptno_fk REFERENCES dept (deptno)
);






SELECT * FROM user_constraintS ;
WHERE table_name ='EMP02';

drop table dept;
select * from salgrade;

select table_name from user_tables;

select * from dept;


CREATE TABLE emp03(
empno NUMBER ,
ename VARCHAR2 (20) NOT NULL,
job VARCHAR2 (9),
deptno NUMBER(2), 
UNIQUE(job),
FOREIGN KEY (deptno) REFERENCES dept (deptno)
);

select * from user_constraints
where table_name = 'EMP03';

commit;
DROP TABLE emp04;
commit;
CREATE TABLE emp04(
empno NUMBER CONSTRAINTS EMP04_EMPNO_PK PRIMARY KEY,
ename VARCHAR2(20) CONSTRAINTS EMP04_ENAME_NN NOT NULL,
job VARCHAR2(9) CONSTRAINTS EMP04_JOB_UK UNIQUE,
depno NUMBER(2) CONSTRAINTS EMP04_DEPTNO_FK REFERENCES dept(deptno) 
);
commit;



select * from user_constraints
where table_name = 'EMP04';

select * from dept;
insert into emp04(empno,ename,job,deptno)
values ( 7369,'SMITH','SALEMAN',10);

SELECT * FROM emp04;

insert into emp04
values ( 7370,'TOM','CLARK',20);

--ORA-00001: unique constraint (SCOTT.EMP04_JOB_UK) violated
insert into emp04
values ( 7372,'JOHN','CLARK',10);

CREATE TABLE test(
data1 NUMBER,
data2 NUMBER CHECK (data2>= 1 AND data2 <= 99)
);

INSERT INTO test ( data1,data2) 
VALUES (100,50);

INSERT INTO test ( data1, data2)
VALUES (200,150);
SELECT * FROM test;

delete from test;

ALTER TABLE test
ADD CONSTRAINTS test_ck_data1
CHECK (data1 IN(1000,2000,3000,4000));

insert into test 
values (1000,50);


select * from test;

ORA-02292: integrity constraint (SCOTT.EMP04_DEPTNO_FK) violated - child record found
select * from dept;
select * from emp04;


delete from dept
where deptno = 10;

delete from dept
where deptno = 40;

create table parenttbl (

name varchar2 (30) constraints ptbl_name_pk primary key

);

create table test1(
no number (4) primary key,
name varchar2(30) constraints test1_name_pk references parenttbl (name) on delete cascade
);

insert into prarenttbl
values ('홍길동');

insert into parenrttbl
values ('모모랜드');

insert into test1
values(10,'홍길동');

select * form parenttbl;
select * from test1;
delete from parenttbl
where name = '홍길동';


insert into test2
values (20,'모모랜드');

select * from parenttbl;
select * from test2;
delete from parenttbl
were name = '모모랜드';
commit;