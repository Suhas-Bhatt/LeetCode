# Write your MySQL query statement below
with cte as (
    select 
    user_id,
    reaction,
    count(reaction) as total_count
    from reactions
    group by user_id, reaction
    order by user_id, total_count desc
)

select
user_id,
reaction as dominant_reaction,
round( max(total_count) / sum( total_count ), 2) as reaction_ratio
from cte
group by user_id
having sum(total_count) >= 5
and max(total_count) / sum(total_count) >= 0.6
order by reaction_ratio desc, user_id asc