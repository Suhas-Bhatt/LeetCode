# Write your MySQL query statement below
WITH ranking_list AS
(SELECT
    user_id,
    action_date,
    action,
    RANK() OVER (PARTITION BY user_id, action ORDER BY action_date) AS ranking
FROM
    activity
),
combined_actions AS 
(
    SELECT 
        fr.user_id,
        fr.action,
        CAST(nr.ranking AS SIGNED) - CAST(fr.ranking AS SIGNED) +1 AS streak_length,
        fr.action_date AS start_date,
        nr.action_date AS end_date
    FROM
        ranking_list fr
    INNER JOIN
        ranking_list nr
    ON
        fr.user_id = nr.user_id
        AND fr.ranking < nr.ranking
        AND fr.action = nr.action
        AND fr.action_date < nr.action_date
        AND DATEDIFF(nr.action_date, fr.action_date) >= 4
        AND DATEDIFF(nr.action_date, fr.action_date) = CAST(nr.ranking AS SIGNED) - CAST(fr.ranking AS SIGNED)
)
SELECT 
    ca.user_id,
    ca.action,
    ca.streak_length,
    ca.start_date,
    ca.end_date
FROM
    combined_actions ca
INNER JOIN
(SELECT 
    user_id,
    action,
    MAX(streak_length) AS max_streak_length
FROM
    combined_actions 
GROUP BY
    user_id,
    action
) ma 
ON ca.user_id = ma.user_id 
AND ca.action = ma.action
AND ca.streak_length = ma.max_streak_length
ORDER BY
    ca.streak_length DESC,
    ca.user_id