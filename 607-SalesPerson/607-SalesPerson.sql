-- Last updated: 09/07/2026, 15:08:56
# Write your MySQL query statement below
select name 
from SalesPerson
WHERE sales_id NOT IN
(
    SELECT o.sales_id
    FROM Orders o
    JOIN Company c
        ON c.com_id = o.com_id
    WHERE c.name = 'RED'
);