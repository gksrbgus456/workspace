select * from DBA_SYS_PRIVS
WHERE grantee ='HR';

show USER;

--시스템 계정을 생성하기 위해 시스템 관리자로 접속
sql> monn system/a1234

--현재 시스템 관리자 상태기 떄문에 다른 사용자 계정 생성
-- 가능하므로 정상실행
create user user01 identified by tiger;

--현재 사용자 계정 검색(sys,system일때만 사용자 계정
-- 생성할 수 있음)
show user;



-------------------------------------------------------------------
사용자 권한 : 시스템권한과 객체권한으로 구분된다

 데이터베이스 관리자가 가지는 시스템권한
 1) create user : 새롭게 사용자를 생성하는 권한
 2) drop user : 사용자를 삭제하는 권한
 3) drop any table : 임의의 테이블을 삭제할 수 있는 권한
 4) query rewrite : 질의재작성을 할 수 있는 권한
 5) backup any table : 임의의 테이블을 백업할 수 있는 권한

 일반 사용자가 데이터베이스를 관리하는 권한
 1) create session : 데이터베이스에 접속할수 있는 권한
 2) create table : 사용자 스키마에게 테이블을 생성할 수 있는 권한
 3) create view : 사용자 스키마에게 뷰를 생성할 수 있는 권한
 4) create sequence : 사용자 스키마에게 시퀀스를 생성할 수 있는 권한
 5) create procedure : 사용자 스키마에게 프로시저(함수)를 생성할수 있는 권한
 ---------------------------------------------------------------------
 
 --사용자에게 권한 부여하기 위한 grant 명령어 
 -- grant system_privilege to user_name;
 
 --user01사용자에게 데이터베이스 접근권한 부여
 grant create session to user01;
 
 
 --사용자 계정 변경
 sql > conn user01/tiger 
 
 select * from employees;
 
 grant create table to user01;
 alter user user01 default tablespace users quota unlimited on users;
 
create user user02 identified by tiger;

/*user02 계정에 데이터베이스 접근 권한 부여서 with admin option
옵션을 지정하게 되면 현재 사용자 계정으로 다른 사용자에게 권한을 부여할 수 있다*/

grant create session to user02 WITH ADMIN OPTION;
grant create view to user02 WITH ADMIN OPTION;


create user user03 identified by tiger;

--user03 계정에 connect,resource 롤 권하 부여
grant connect,resource to user03;

 select * from dict
where table_name like '%ROLE%';

CREATe ROLE mrole;

grant mrole to user03;

--mrole 롤 제거한다
drop role mrole;

=====================================================

create user user04 identified by tiger;
grant create session to user04 with admin option;
grant create table to user04;
alter user user04 default tablespace users quota unlimited on users;

/*  SQL> create user user04 identified by tiger
2 default tablespace users temporary talbespace temp
3 quota 1M on users;
    => user04 사용자 생성*/
