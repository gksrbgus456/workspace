  ============================================
����(join) : �������� ���̺��� ���ϴ� �����͸�   
            �������ִ� �������̴�.
join�� oracle��ǰ���� ���Ǵ� oracle�� join�� �ְ�
��� ��ǰ���� ���������� ���Ǵ� ǥ��(ansi) join�� �ִ�.
=============================================

1 cartesian product (īƼ�� ��) ���� : 
���̺� ���� ������ŭ ������ִ� �����̴�.

1) oracle �� cartesian product 
select department_id, first_name,
    e.job_id, job_title
        from employees e,jobs j;--2,003
        
        select count(*) from employees; --107
        select count(*) from jobs; --19
        
2) ansi�� cartesian product(corss join)
    select e.department_id, e.first_name,
    e.job_id, j.job_title
    from employees e cross join jobs j ;
    
2 equi join --(���� ����) ���帹�̾� 
    ���帹�� ���Ǵ� ���ι������ ���� ����� �Ǵ� �� ���̺���
    ���������� �����ϴ� �÷��� ���� ��ġ�Ǵ� ���� �����Ͽ�
    ����� �����ϴ� ����̴�.
    
(1) oracle equi join
select e.department_id, e.first_name,
       e.job_id, j.job_id,  j.job_title
from employees e , jobs j 
where e.job_id = j.job_id;        --���� ���ο����� where���� �̷��� ����

(2) ansi�� equi joib(inner join)
select e.department_id, e.first_name,
        e.job_id, j.job_id, j.job_title
        from employees e inner join jobs j
        ON e.job_id = j.job_id;

select job_id
from employees            --employees    107���� �ִ�
where job_id IS  null;

--employees�� departments ���̺��� �����ȣ (employee_id),
--�μ���ȣ (department_id),�μ���(department_name)�� �˻��Ͻÿ�.

select e.employee_id, e.department_id, d.department_name
from employees e, departments d
where e.department_id = d.department_id;

select department_id
from employees
where department_id IS NULL;

--employees�� jobs���̺��� �����ȣ(employee_id),
--������ȣ(job_id),�Թ���(job_title)�� �˻��Ͻÿ�.

select e.employee_id, e.job_id, j.job_title
from employees e, jobs j 
where e.job_id = j.job_id;

--job_id�� 'FI_MGR'�� ����� ����
-- �޿�(salary)�� �ּҰ� (min_salary),
--�ִ밪(max_salary)�� ����Ͻÿ�.

select e.first_name, j.job_id, e.salary, j.min_salary,j.max_salary
from employees e,jobs j
where e.job_id = j.job_id
   AND e.job_id ='FI_MGR';

--�μ��� 'Seattle'�� �ִ� �μ����� �ٹ��ϴ�
--�������� first_name,hire_date,department_name,citu
--����ϴ� select������ �ۼ��Ͽ���

select e.first_name, e.hire_date, d.department_name,l.city
from employees e, departments d, locations l
where e.department_id = d.department_id
AND d.location_id = l.location_id
AND l.city= 'Seattle';


select e.first_name, e.hire_date, d.department_name,l.city
from employees e inner join departments d
ON e.department_id =d.department_id
inner join locations l
ON d.location_id = l.location_id
where l.city = 'Seattle';

--20�� �μ��� �̸��� �� �μ��� �ٹ��ϴ� ����� �̸� (first_name)�� ����Ͻÿ�.

select e.first_name,d.department_name
from departments d, employees e
where d.department_id  = e.department_id
AND d.department_id=20;

--1400,1500 �� ��ġ�� ���� �̸��� �װ��� �ִ� �μ��� �̸��� ����Ͻÿ�

select l.city, d.department_name
from departments d, locations l 
where l.location_id = d.location_id
AND l.location_id IN(1400,1500);

3. NATURAL JOIN
  NATURAL JOIN�� �� ���̺� ���� ������ �̸��� ���� ��� Į���鿡 
  ���� EQUI(=) JOIN�� �����Ѵ�.
  �׸��� SQL Server������ �������� �ʴ� ����̴�.
  
      select first_name, salary,department_id, department_name
      from employees natural join departments   
      
4.non_equi join
(=)�����ڸ� ������ >=,<=,>, < ���� �����ڸ� �̿��ؼ�
������ �����ϴ� ���ι���̴�.

select e.first_name, e.salary,j.min_salary,
       j.max_salary,j.job_title
    from employees e, jobs j
    where e.job_id = j.job_id
    AND e.salary >= j.min_salary
    AND e.salary <= j.max_salary;

(2) ansi�� non_equi join
select e.first_name, e.salary,j.min_salary,
       j.max_salary, j.job_title
    from employees e join jobs j
    ON e.job_id = j.job_id
    AND e.salary >= j.min_salary
    AND e.salary<= j.max_salary;
    
5. outer join 
    ���� ���̺��� �����Ͱ� �ְ� �ٸ� �ݴ��ʿ��� �����Ͱ� ���� ��쿡 
    �����Ͱ� �ִ� ���̺� ������ ��� �������� �����̴�.
    
(1) oralce�� outer join
    select e.first_name, e.employee_id
           d.department_id, e.department_id
        from employees e, departments d
        where e.department_id = d.department_id(+)
        ORDER BY e.employee_id;

(2) ansi�� outer join
 
select e.first_name, e.employee_id,
       d.department_id,e.department_id
    from employees e left outer join departments d
    ON e.department_id = d.department_id
    ORDER BY e.employee_id;
    
6. self join 
�ϳ��� ���̺��� �ΰ��� ���̺�� �����ؼ� ����ϴ� ���ι���̴�.
(1) oracle �� self join

select e.employee_id as "�����ȣ",
       e.first_name as "����̸�",
       e.manager_id as "�����ڹ�ȣ",
       m.first_name as "�������̸�"
from employees e, employees m
where e.manager_id = m.employee_id

select employee_id, first_name, man22ager_id
from employees e, employees m
where e.manger_id = m.employee_id

(2) ansi�� self join

select e.employee_id as "�����ȣ",
       e.first_name as "����̸�",
       e.manager_id as "�����ڹ�ȣ",
       m.first_name as "�������̸�"
from employees e join employees m
ON e.manager_id = m.employee_id;


 ----------------------------------------------
 ����
 ----------------------------------------------
 
1)EMPLOYEES ���̺��� �Ի��� ��(hire_date) ���� �ο����� ��ȸ�Ͻÿ� . 
  <���: ��        ������   >

select to_char(hire_date,'mm') as"��",count(*) as"������"
from employees
GROUP BY to_char(hire_date,'mm')
ORDER BY to_char(hire_date,'mm');

2)�� �μ����� �ٹ��ϴ� �������� ��ȸ�ϴ� SQL ��ɾ �ۼ��Ͻÿ�. 
��, �������� 5�� ������ �μ� ������ ��µǾ�� �ϸ� �μ������� ���� ������ �ִٸ� �μ��� ��<�̹�ġ�ο�>�� �̶�� ���ڰ� ��µǵ��� �Ͻÿ�. 
�׸��� ��°���� �������� ���� �μ����� ��µǾ�� �մϴ�.

select  nvl(d.department_name,'�̹�ġ�ο�'),count(e.employee_id)
from departments d , employees e
where d.department_id(+)=e.department_id
GROUP BY d.department_name
having count(e.employee_id)<=5
ORDER BY count(e.employee_id) desc;

3)�� �μ� �̸� ���� 2005�� ������ �Ի��� �������� �ο����� ��ȸ�Ͻÿ�.
 <��� :    �μ���		�Ի�⵵	�ο���  >
 SELECT d.department_name �μ���, to_char(e.hire_date,'yyyy') �Ի�⵵,
       count(e.employee_id) �ο��� 
FROM employees e, departments d 
WHERE e.department_id = d.department_id 
 AND to_char(e.hire_date,'yyyy') < '2005' 
GROUP BY d.department_name, to_char(e.hire_date,'yyyy');

4)��å(job_title)���� 'Manager'�� �����̵� ����� �̸�(first_name), ��å(job_title), �μ���(department_name)�� ��ȸ�Ͻÿ�.
select j.job_title,e.first_name,d.department_name
from employees e, departments d, jobs j
where  e.department_id = d.department_id
AND j.job_id=e.job_id
AND j.job_title like '%Manager%';


5)'Executive' �μ��� �ӿ� �ִ� �������� ������ �̸��� ��ȸ�Ͻÿ�. 
��, �����ڰ� ���� ������ �ִٸ� �� ���� ������ ��°���� ���Խ��Ѿ� �մϴ�.
 <��� : �μ���ȣ ������  �����ڸ�  >
 SELECT e.department_id �μ���ȣ, e.first_name ������, e2.first_name �����ڸ�
FROM employees e, employees e2, departments d
WHERE e.department_id = d.department_id 
 AND d.department_name = 'Executive'
 AND e2.employee_id(+)= e.manager_id;


-----------------------------------------------------------------------------------------
��������(subquery)
 �ϳ��� SQL���ȿ� ���ԵǾ� �ִ� �� �ٸ� SQL���� ���Ѵ�.
 ���������� �˷����� ���� ������ �̿��� �˻��� ���� ����Ѵ�.
 ���������� ���������� ���������� �����ϴ� �������� �����̴�.
 ���������� ���������� �÷��� ��� ����� �� ������ ���������� ���������� �÷��� ����� �� ����. 
 ���� ����� �������� �÷��� ǥ���ؾ� �Ѵٸ� ���ι������ ��ȯ�ϰų� �Լ�, ��Į�� ��������(scarar subquery)���� ����ؾ� �Ѵ�. 
 ������ ���հ��� ��(Product)�� �����̴�. 
 
�ܺ� ���� (��������)
 :�Ϲ� ������ �ǹ��մϴ�.
��Į�� ��������
 :SELECT ���� ������ ���Ǵ� ����, �Լ�ó�� ���ڵ�� ��Ȯ�� �ϳ��� ������ ��ȯ�ϴ� ���������Դϴ�.
�ζ��� ��
 :FROM ���� ���Ǵ� ������, ���ϴ� �����͸� ��ȸ�Ͽ� ������ ������ ����� ������ �����ϰų� ������ ������ �ٽ� ��ȸ�� �� ����մϴ�.



���������� ����� �� ���� ���׿� ����
  ���������� ��ȣ�� ���μ� ����Ѵ�. 
  ���������� ���� ��(Single Row) �Ǵ� ���� ��(Multiple Row) �� �����ڿ� �Բ� ��� �����ϴ�. 
  ���� �� �� �����ڴ� ���������� ����� �ݵ�� 1�� �����̾�� �ϰ� ���� �� �� �����ڴ� ���������� ��� �Ǽ��� ��� ����. 
  �������������� ORDER BY�� ������� ���Ѵ�. 
  ORDER BY���� SELECT������ ���� �� ���� �� �� �ֱ� ������ ORDER BY���� ���������� ������ ���忡 ��ġ�ؾ� �Ѵ�.
  

���� ���� ��밡���� ��ġ
SELECT, FROM, WHERE, HAVING,ORDER BY 
INSERT���� VALUES,
UPDATE���� SET, CREATE��

���������� ������ �����ϴ� ����̳� ��ȯ�Ǵ� �������� ���¿� ���� �з��� �� �ִ�.
1 �����ϴ� ��Ŀ� ���� �������� �з�
  Un-Correlated(�񿬰�) : ���������� �������� �÷��� ������ ���� �ʴ� ������ ���������̴�.
          ���������� ��(���������� ����� ���)�� �����ϱ� ���� ��������  �ַ� ����Ѵ�.
  Correlated(����) : ���������� �������� Į���� ������ �ִ� ������ ���������̴�.
          �Ϲ������� ���������� ���� ����Ǿ� ������ �����͸� ������������ ������ �´��� Ȯ��
	  �ϰ��� �� �� �ַ� ���ȴ�.  (EXISTS���������� �׻� ���� ���������� ���ȴ�. ������ �����ϴ� 1�Ǹ� ã����
	  �߰� �˻��� ���� �ʴ´�.)
2 ��ȯ�Ǵ� �������� ���¿� ���� �������� ����
  Single Row(������ ��������) : ���������� �������� �׻� 1�� ������ ���������� �ǹ��Ѵ�. 
          ������ ���������� ���� �� �� �����ڿ� �Բ� ���ȴ�.
	  ���� �� �� �����ڴ� =, <, <=, >, >=, <>�� �ִ�.
  Multi Row(������ ��������) : ���������� ���� ����� ���� ���� ���������� �ǹ��Ѵ�. 
          ���� �� ���������� ���� �� �� �����ڿ� �Բ� ���ȴ�. 
	  ���� �� �� �����ڿ��� in, all, any, some, exists�� �ִ�.
	      in : ���������� ������('='�����ڷ� ���� ���)�� ���������� ��� �߿���
               �ϳ��� ��ġ�ϸ� ���̴�.
           any,some : ���� ������ �� ������ ���� ������ �˻� ����� �ϳ� �̻��� ��ġ�ϸ�
                ���̴�.
           all : ���� ������ �� ������ ���� ������ �˻� ����� ��� ���� ��ġ�ϸ� ���̴�.
           exists : ���� ������ �� ������ ���� ������ ��� �߿��� �����ϴ� ���� �ϳ���
               �����ϸ� ���̴�.
  Multi Column(����Į�� ��������) : ���������� ���� ����� ���� �÷��� ��ȯ�Ѵ�.
          ���������� �������� ���� �÷��� ���ÿ� ���� �� �ִ�. 
	  ���������� ������������ ���ϰ��� �ϴ� �÷� ������ �÷��� ��ġ�� �����ؾ� �Ѵ�.
---------------------------------------------------------------   
--Lex�� �ٹ��ϴ� �μ����� ����Ͻÿ�.
select department_id 
from employees
where first_name ='Lex';


select department_name
from departments
where department_id = 90;

select d.department_name
from employees e, departments d
where e.department_id = d.department_id
AND e.first_name = 'Lex'

select department_name
from departments
where department_id = 
             (select department_id
             from employees
             where first_name = 'Lex')

--lex�� ���� �μ��� �ٹ��ϴ� ��� �̸��� �μ���ȣ�� ����Ͻÿ�.
select department_id
from employees
where first_name ='Lex'


select first_name
from employees
where department_id =90

select e.first_name ,e.department_id
from employees e, employees m
where e.department_id = m.department_id
AND m.first_name = 'Lex';

select first_name, department_id
from employees 
where department_id (select department_id
                    from employees
                    where first_name ='Lex');
                    
--'Lex'�� ������ ���� (job_id)�� ���� ����� �̸� (first_name),
--���� (job_title), �Ի��� (hire_date)�� ����Ͻÿ�. 

select first_name, job_title, hire_date
from employees e, jobs j
where e.job_id = j.job_id
    AND e.job_id =
                (select job_id
                from employees
                where first_name ='Lex');


select job_id
from employees 
where first_name = 'Lex'

--'IT'�� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ����Ͻÿ�.

select first_name,department_id
from employees 
where department_id =(
                    SELECT department_id
                    from departments
                    where department_name = 'IT');
        
--'Bruce'���� �޿��� ���� ���� ����̸� (first_name), �μ���,�޿��� ����Ͻÿ�.

select first_name, department_name,e.salary
from employees e,departments d
where e.department_id = d.department_id
AND e.salary > (
                select salary
                from employees  
                where first_name = 'Bruce')
                
ORDER BY e.salary;


--Steven�� ���� �μ����� �ٹ��ϴ� ����� �̸�,�޿�,�Ի����� ����Ͻÿ�.(in)

select first_name, salary,hire_date, department_id
from employees
where department_id in(
                    select department_id
                    from employees
                    where first_name ='Steven');
                    
--�μ����� ���� �޿��� ���� �޴� ����� �̸�, �޿� ,�μ���ȣ�� ����Ͻÿ�.(in)

select first_name, salary,department_id
from employees  
where (department_id, salary)in(
                                select department_id,max(salary)
                                from employees
                                GROUP BY department_id)
ORDER BY department_id

--30�Ҽӵ� ������߿��� �޿��� ���� ���� �޴� ������� �� ���� �޿���
--�޴� ����� �̸� , �޿� , �Ի����� ����Ͻÿ�,(all)
--(������������ max() �Լ��� ������� �ʴ´�.)

select first_name, salary,hire_date
from employees
where salary >all(
                 select salary
                 from employees
                 where department_id =30);
                 
--�μ���ȣ�� 30���� ������� �޴� �����޿����� ���� �޿��� �޴� ����� �̸�,
--�޿�, �Ի����� ����Ͻÿ�. (min ( ) �Լ��� ������� �ʴ´�) (any)


select first_name, salary,hire_date
from employees
where salary >any(
                 select salary
                 from employees
                 where department_id =30);
                 
--20�� �μ��� ���� ����� ������ ������� �����, �Ի���,�޿�
--�μ���ȣ�� ����Ͻÿ�.(exists)

select first_name , hire_date, salary, department_id
from employees
where EXISTS(select department_id
                from employees
                where department_id =20);
                