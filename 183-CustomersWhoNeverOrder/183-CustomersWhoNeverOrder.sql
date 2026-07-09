-- Last updated: 09/07/2026, 15:11:19
# Write your MySQL query statement below
select name as Customers
from Customers
where id not in (select customerId from Orders);