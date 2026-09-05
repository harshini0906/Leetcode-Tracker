-- Last updated: 05/09/2026, 20:09:45
# Write your MySQL query statement below
SELECT teacher_id,
       COUNT(DISTINCT subject_id) AS cnt
FROM Teacher
GROUP BY teacher_id;