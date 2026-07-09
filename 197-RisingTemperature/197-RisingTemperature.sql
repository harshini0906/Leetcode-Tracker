-- Last updated: 09/07/2026, 15:11:07
# Write your MySQL query statement below
select w1.id 
from Weather w1,Weather w2
where DATEDIFF(w1.recordDate,w2.recordDate)=1 and w1.temperature>w2.temperature;