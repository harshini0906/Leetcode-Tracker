-- Last updated: 09/07/2026, 15:08:24
# Write your MySQL query statement below
select actor_id,director_id
from ActorDirector
group by actor_id,director_id
having count(Timestamp)>=3;