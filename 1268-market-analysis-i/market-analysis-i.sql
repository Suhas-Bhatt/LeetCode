# Write your MySQL query statement below
SELECT u.user_id AS 'buyer_id', join_date, COUNT(o.order_date) AS 'orders_in_2019'
FROM Users u
LEFT JOIN Orders o on u.user_id = o.buyer_id and o.order_date LIKE '2019%'
GROUP BY u.user_id