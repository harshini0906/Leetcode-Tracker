-- Last updated: 09/07/2026, 15:09:10
# Write your MySQL query statement below
select Employee.name,Bonus.bonus 
from Employee
left join Bonus on Employee.empID=Bonus.empID
where bonus<1000 or Bonus is null;