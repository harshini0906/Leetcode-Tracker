-- Last updated: 09/07/2026, 15:08:16
# Write your MySQL query statement below
select player_id,min(event_date) as first_login
from Activity 
group by player_id;