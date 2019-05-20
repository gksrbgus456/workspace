select * from DBA_SYS_PRIVS
WHERE grantee ='HR';

show USER;

--�ý��� ������ �����ϱ� ���� �ý��� �����ڷ� ����
sql> monn system/a1234

--���� �ý��� ������ ���±� ������ �ٸ� ����� ���� ����
-- �����ϹǷ� �������
create user user01 identified by tiger;

--���� ����� ���� �˻�(sys,system�϶��� ����� ����
-- ������ �� ����)
show user;



-------------------------------------------------------------------
����� ���� : �ý��۱��Ѱ� ��ü�������� ���еȴ�

 �����ͺ��̽� �����ڰ� ������ �ý��۱���
 1) create user : ���Ӱ� ����ڸ� �����ϴ� ����
 2) drop user : ����ڸ� �����ϴ� ����
 3) drop any table : ������ ���̺��� ������ �� �ִ� ����
 4) query rewrite : �������ۼ��� �� �� �ִ� ����
 5) backup any table : ������ ���̺��� ����� �� �ִ� ����

 �Ϲ� ����ڰ� �����ͺ��̽��� �����ϴ� ����
 1) create session : �����ͺ��̽��� �����Ҽ� �ִ� ����
 2) create table : ����� ��Ű������ ���̺��� ������ �� �ִ� ����
 3) create view : ����� ��Ű������ �並 ������ �� �ִ� ����
 4) create sequence : ����� ��Ű������ �������� ������ �� �ִ� ����
 5) create procedure : ����� ��Ű������ ���ν���(�Լ�)�� �����Ҽ� �ִ� ����
 ---------------------------------------------------------------------
 
 --����ڿ��� ���� �ο��ϱ� ���� grant ��ɾ� 
 -- grant system_privilege to user_name;
 
 --user01����ڿ��� �����ͺ��̽� ���ٱ��� �ο�
 grant create session to user01;
 
 
 --����� ���� ����
 sql > conn user01/tiger 
 
 select * from employees;
 
 grant create table to user01;
 alter user user01 default tablespace users quota unlimited on users;
 
create user user02 identified by tiger;

/*user02 ������ �����ͺ��̽� ���� ���� �ο��� with admin option
�ɼ��� �����ϰ� �Ǹ� ���� ����� �������� �ٸ� ����ڿ��� ������ �ο��� �� �ִ�*/

grant create session to user02 WITH ADMIN OPTION;
grant create view to user02 WITH ADMIN OPTION;


create user user03 identified by tiger;

--user03 ������ connect,resource �� ���� �ο�
grant connect,resource to user03;

 select * from dict
where table_name like '%ROLE%';

CREATe ROLE mrole;

grant mrole to user03;

--mrole �� �����Ѵ�
drop role mrole;

=====================================================

create user user04 identified by tiger;
grant create session to user04 with admin option;
grant create table to user04;
alter user user04 default tablespace users quota unlimited on users;

/*  SQL> create user user04 identified by tiger
2 default tablespace users temporary talbespace temp
3 quota 1M on users;
    => user04 ����� ����*/
