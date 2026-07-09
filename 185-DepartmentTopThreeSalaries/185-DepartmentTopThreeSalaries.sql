-- Last updated: 09/07/2026, 15:11:15
# Write your MySQL query statement below
SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
JOIN Department d ON e.departmentId = d.id
WHERE (SELECT COUNT(DISTINCT salary) FROM Employee e2
    WHERE e2.departmentId = e.departmentId AND e2.salary >= e.salary) <= 3
ORDER BY Department, Salary DESC;