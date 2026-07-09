-- Last updated: 09/07/2026, 15:08:51
# Write your MySQL query statement below
select(
select num from MyNumbers
group by num
having count(num)=1
order by num desc
limit 1
) as num;