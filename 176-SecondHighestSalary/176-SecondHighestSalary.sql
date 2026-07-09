-- Last updated: 09/07/2026, 15:11:31
# Write your MySQL query statement below
select max(salary) as SecondHighestSalary
from Employee
where salary<(select max(salary) from Employee);