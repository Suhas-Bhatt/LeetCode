# Write your MySQL query statement below
WITH temp1 AS (
    SELECT p1.*, p2.category 
    FROM ProductPurchases as p1
    INNER JOIN ProductInfo AS p2
    ON p1.product_id = p2.product_id 
),
temp2 AS(
    SELECT DISTINCT t1.category AS category1, t2.category as category2 , t1.user_id 
    FROM temp1 AS t1 
    INNER JOIN temp1 AS t2
    ON t1.user_id = t2.user_id 
    WHERE t1.category < t2.category
)

SELECT category1, category2,count(*) AS customer_count 
FROM temp2 
GROUP BY category1,category2
HAVING count(*) >2 
ORDER BY count(*) DESC, category1 ASC , category2 ASC