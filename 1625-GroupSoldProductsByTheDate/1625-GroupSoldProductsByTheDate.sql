-- Last updated: 09/07/2026, 15:07:33
# Write your MySQL query statement below
select sell_date, count(distinct product) as num_sold, 
GROUP_CONCAT(
        DISTINCT product
        ORDER BY product ASC
        SEPARATOR ','
    ) AS products
from Activities 
group by sell_date;