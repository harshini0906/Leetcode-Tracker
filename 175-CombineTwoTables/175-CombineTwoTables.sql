-- Last updated: 09/07/2026, 15:11:32
# Write your MySQL query statement below
select Person.firstName,Person.lastName,Address.city,Address.state
from Person
left join Address
on Person.personId=Address.personId;