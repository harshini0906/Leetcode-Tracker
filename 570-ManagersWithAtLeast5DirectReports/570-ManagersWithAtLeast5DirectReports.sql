-- Last updated: 09/07/2026, 15:09:12
# Write your MySQL query statement below
SELECT name 
FROM Employee 
WHERE id IN (
    SELECT managerId 
    FROM Employee 
    GROUP BY managerId 
    HAVING COUNT(*) >= 5)