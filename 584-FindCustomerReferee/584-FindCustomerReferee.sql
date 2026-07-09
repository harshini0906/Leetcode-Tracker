-- Last updated: 09/07/2026, 15:09:06
# Write your MySQL query statement below
select name
from Customer
where referee_id!=2 or referee_id is null;