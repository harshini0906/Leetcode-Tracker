-- Last updated: 09/07/2026, 15:07:37
# Write your MySQL query statement below
select u.unique_id, e.name
from Employees e
left join EmployeeUNI u on e.id=u.id;