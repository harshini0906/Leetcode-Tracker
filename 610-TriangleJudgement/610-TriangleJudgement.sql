-- Last updated: 09/07/2026, 15:08:53
# Write your MySQL query statement below
SELECT *,
IF(
    x + y > z
    AND x + z > y
    AND y + z > x,
    'Yes',
    'No'
) AS triangle
FROM Triangle;