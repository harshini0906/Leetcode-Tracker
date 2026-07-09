-- Last updated: 09/07/2026, 15:11:21
# Write your MySQL query statement below
select email from Person
group by email
having count(email)>1;