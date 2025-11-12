# Write your MySQL query statement below
-- SELECT u.name, r.distance AS travelled_distance
SELECT u.name , IFNULL(SUM(r.distance),0) AS travelled_distance
FROM USERS u
Left JOIN Rides r 
ON u.id=r.user_id
GROUP BY r.user_id
ORDER by travelled_distance DESC,u.name; 
