# Write your MySQL query statement below

-- SELECT s.product_id,
--        s.year AS first_year,
--        s.quantity,
--        s.price
-- FROM Sales s
-- WHERE s.year = (
--     SELECT MIN(year)
--     FROM Sales
--     WHERE product_id = s.product_id
-- );
# Write your MySQL query statement below
select product_id,year as first_year, quantity, price
from Sales
where(product_id, year) in (
    select  product_id, min(year) 
    from Sales 
    group by product_id
    )
