-- Last updated: 09/07/2026, 15:08:23
# Write your MySQL query statement below
select Product.product_name, Sales.year, Sales.price
from Sales
join Product
on Sales.product_id=Product.product_id;