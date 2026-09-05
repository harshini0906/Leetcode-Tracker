-- Last updated: 05/09/2026, 20:07:48
# Write your MySQL query statement below
SELECT user_id, email
FROM Users
WHERE email REGEXP '^[a-z0-9_]+@[^@0-9]+\\.com$' order by user_id;