# Write your MySQL query statement below
WITH RECURSIVE hierarchy AS (
    SELECT *, 1 AS level
    FROM employees
    WHERE manager_id IS NULL
    UNION
    SELECT e.*, (h.level + 1) AS level
    FROM employees AS e
    JOIN hierarchy AS h
    ON (e.manager_id = h.employee_id)
),
teamSize As(
    SELECT employee_id AS manager_id, employee_name , employee_id AS member_id
    FROM employees
    UNION ALL
    SELECT ts.manager_id, e.employee_name, e.employee_id AS member_id
    FROM teamSize AS ts
    JOIN employees AS e
    ON (e.manager_id = ts.member_id)
),
budget AS (
    SELECT ts.*, SUM(e.salary) AS budget
    FROM teamSize AS ts
    LEFT JOIN employees AS e
    ON (ts.member_id = e.employee_id)
    GROUP BY manager_id
)
SELECT ts.member_id AS employee_id, ts.employee_name , level , COUNT(*)-1 AS team_size, budget
FROM budget
JOIN teamSize AS ts
USING(manager_id)
LEFT JOIN hierarchy AS h
ON (ts.member_id = h.employee_id)
GROUP BY ts.manager_id
ORDER BY level ASC, budget DESC, employee_name ASC

