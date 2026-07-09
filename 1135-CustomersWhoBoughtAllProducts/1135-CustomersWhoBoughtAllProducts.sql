-- Last updated: 09/07/2026, 15:08:26
# Write your MySQL query statement below
select customer_id
from Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) = (
    SELECT COUNT(*) 
    FROM Product
);