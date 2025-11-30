-- Write your PostgreSQL query statement below
-- SELECT * 
-- FROM products
-- WHERE description LIKE '%SN____-____'
-- OR description LIKE '%SN____-____%'
-- -- ORDER BY product_id ASC
SELECT product_id, product_name, description
FROM Products
WHERE REGEXP_LIKE(description, '(^|[^A-Za-z0-9])SN[0-9]{4}-[0-9]{4}([^0-9]|$)', 'c')
ORDER BY product_id;